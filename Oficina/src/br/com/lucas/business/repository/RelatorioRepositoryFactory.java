//package br.com.lucas.business.repository;
//
//import br.com.lucas.api.common.ServicosAutomotivoEnum;
//import br.com.lucas.business.entidades.ServicoAutomotivoInterface;
//
//public class RelatorioRepositoryFactory {
//
//	// FACTORY DOS RELATORIOS
//	public static ServicoAutomotivoInterface criarRelatorio(ServicosAutomotivoEnum tipoServico) {
//		switch (tipoServico) {
//		case TROCADEOLEO:
//			return new RelatorioOleoRepository();
//		case TROCADEPNEU:
//			return new RelatorioPneuRepository();
//		case SERVICOMECANICA:
//			return new RelatorioMecanicaRepository();
//		case TROCADEBATERIA:
//			return new RelatorioBateriaRepository();
//		default:
//			throw new IllegalArgumentException("Tipo de serviço desconhecido");
//		}
//	}
//}
