package br.com.lucas.business.repository;

import br.com.lucas.api.common.ServicosAutomotivoEnum;
import br.com.lucas.business.Factory.GeradorDeOficinaFactory;
import br.com.lucas.business.entidades.OficinaEntidade;

import java.util.List;

public class ListaOficinas {

	public static void adicionarOficinasPadrao() {
		GeradorDeOficinaFactory.adicionarOficina("Oficina do Lucas", "12.345.678/0001-95",
				List.of(ServicosAutomotivoEnum.TROCADEOLEO, ServicosAutomotivoEnum.TROCADEPNEU));
		GeradorDeOficinaFactory.adicionarOficina("Oficina do Marcos", "98.765.432/0001-19",
				List.of(ServicosAutomotivoEnum.SERVICOMECANICA, ServicosAutomotivoEnum.TROCADEBATERIA));
		GeradorDeOficinaFactory.adicionarOficina("Oficina x", "00.000.000/0001-00",
				List.of(ServicosAutomotivoEnum.TROCADEBATERIA, ServicosAutomotivoEnum.TROCADEOLEO, ServicosAutomotivoEnum.TROCADEPNEU, ServicosAutomotivoEnum.SERVICOMECANICA));
	}

	public static List<OficinaEntidade> getOficinas() {
		return GeradorDeOficinaFactory.getGeradorDeOficinas().getOficinas();
	}

	public static String gerarRelatorioOficinas() {
		return GeradorDeOficinaFactory.gerarRelatorioOficinas();
	}

}
