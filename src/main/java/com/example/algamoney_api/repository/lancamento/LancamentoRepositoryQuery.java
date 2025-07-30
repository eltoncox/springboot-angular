package com.example.algamoney_api.repository.lancamento;

import java.util.List;

import com.example.algamoney_api.model.Lancamento;
import com.example.algamoney_api.repository.filter.LancamentoFilter;

public interface LancamentoRepositoryQuery {
	
	public List<Lancamento> filtrar(LancamentoFilter lancamentoFilter);
	//public <ResumoLancamento> resumir(LancamentoFilter lancamentoFilter, Pageable pageable);

}
