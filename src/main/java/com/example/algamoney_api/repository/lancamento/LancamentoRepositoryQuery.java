package com.example.algamoney_api.repository.lancamento;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.algamoney_api.model.Lancamento;
import com.example.algamoney_api.repository.filter.LancamentoFilter;

public interface LancamentoRepositoryQuery {
	
	public Page<Lancamento> filtrar(LancamentoFilter lancamentoFilter, Pageable pageable);
	//public <ResumoLancamento> resumir(LancamentoFilter lancamentoFilter, Pageable pageable);

}
