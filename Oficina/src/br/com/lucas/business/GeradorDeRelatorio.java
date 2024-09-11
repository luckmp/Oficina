package br.com.lucas.business;

import br.com.lucas.api.common.ServicosAutomotivoEnum;
import br.com.lucas.business.entidades.ServicoAutomotivoInterface;
import br.com.lucas.business.repository.RelatorioRepositoryFactory;

public class GeradorDeRelatorio {

	public String gerarRelatorio(ServicosAutomotivoEnum servico) {
		ServicoAutomotivoInterface repository = RelatorioRepositoryFactory.criarRelatorio(servico);
		return repository.gerarRelatorio();
	}
}
