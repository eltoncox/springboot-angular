# Etapa 1: Build da aplicação usando Maven e Java 17
FROM maven:3.9.7-amazoncorretto-17 AS build

# Define o diretório de trabalho dentro do container
WORKDIR /app

# Copia o arquivo pom.xml e baixa as dependências antes do código (cache mais eficiente)
COPY pom.xml .

RUN mvn dependency:go-offline

# Copia o código-fonte para o container
COPY src ./src

# Compila o projeto e gera o .jar
RUN mvn clean package -DskipTests

# Etapa 2: Imagem final com JDK leve
FROM amazoncorretto:17-alpine-jdk

WORKDIR /app

# Copia o JAR gerado na etapa anterior
COPY --from=build /app/target/*.jar app.jar

# Expõe a porta padrão do Spring Boot
EXPOSE 8080

# Comando para rodar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]
