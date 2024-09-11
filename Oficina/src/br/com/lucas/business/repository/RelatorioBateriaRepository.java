//package br.com.lucas.business.repository;
//
//import br.com.lucas.business.entidades.LojaDeBateria;
//import br.com.lucas.business.entidades.ServicoAutomotivoInterface;
//
//public class RelatorioBateriaRepository implements ServicoAutomotivoInterface {
//	private LojaDeBateria bateria;
//
//	public RelatorioBateriaRepository() {
//		this.bateria = new LojaDeBateria(); // Dados predefinidos na entidade
//	}
//
//	@Override
//	public String gerarRelatorio() {
//		return "Oficina do Marcos realizou o serviço: \nTroca de Bateria \n" + bateria.getMarca();
//	}
//}
////