package br.com.lucas.business.entidades;

public class ServicoAutomotivoWrapper implements ServicoAutomotivoInterface {

	@Override
	public String trocarPneu() {
		return "Não executo Troca de Pneu";
	}

	@Override
	public String trocarBateira() {
		return "Não executo Troca de Bateria";
	}

	@Override
	public String trocarOleo() {
		return "Não executo Troca de Oleo";
	}

	@Override
	public String servicoMecanica() {
		return "Não executo Servico de Mecanica";
	}

}
