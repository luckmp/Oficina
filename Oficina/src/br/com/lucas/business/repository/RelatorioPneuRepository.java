//package br.com.lucas.business.repository;
//
//import br.com.lucas.business.entidades.Borracharia;
//import br.com.lucas.business.entidades.ServicoAutomotivoInterface;
//
//public class RelatorioPneuRepository implements ServicoAutomotivoInterface {
//	private Borracharia pneu;
//
//	public RelatorioPneuRepository() {
//		this.pneu = new Borracharia(); // Dados predefinidos na entidade
//	}
//
//	@Override
//	public String gerarRelatorio() {
//		return "Oficina do Lucas realizou o serviço: \nTroca de Pneu \nTamanho: " + pneu.getTamanho() + "\n"
//				+ pneu.getMarca();
//	}
//}
