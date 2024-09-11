//package br.com.lucas.business.repository;
//
//import br.com.lucas.business.entidades.LojaDeOleo;
//import br.com.lucas.business.entidades.ServicoAutomotivoInterface;
//
//public class RelatorioOleoRepository implements ServicoAutomotivoInterface {
//	private LojaDeOleo oleo;
//
//	public RelatorioOleoRepository() {
//		this.oleo = new LojaDeOleo(); // Dados predefinidos na entidade
//	}
//
//	@Override
//	public String gerarRelatorio() {
//		return "Oficina do Lucas realizou o serviço: \nTroca de Óleo \nTipo: " + oleo.getTipo() + "\n"
//				+ oleo.getMarca();
//	}
//}
