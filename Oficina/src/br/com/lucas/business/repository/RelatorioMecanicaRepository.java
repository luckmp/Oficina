//package br.com.lucas.business.repository;
//
//import br.com.lucas.business.entidades.OficinaMecanica;
//import br.com.lucas.business.entidades.ServicoAutomotivoInterface;
//
//public class RelatorioMecanicaRepository implements ServicoAutomotivoInterface {
//	private OficinaMecanica mecanica;
//
//	public RelatorioMecanicaRepository() {
//		this.mecanica = new OficinaMecanica(); // Dados predefinidos na entidade
//	}
//
//	@Override
//	public String gerarRelatorio() {
//		return "Oficina do Marcos realizou o serviço: \nMecânica Geral \nDescrição: " + mecanica.getDescricao();
//	}
//}
