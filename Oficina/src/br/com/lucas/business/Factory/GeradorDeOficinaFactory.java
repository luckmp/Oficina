package br.com.lucas.business.Factory;

import java.util.ArrayList;
import java.util.List;

import br.com.lucas.api.common.ServicosAutomotivoEnum;
import br.com.lucas.business.GeradorDeOficinas;
import br.com.lucas.business.entidades.OficinaEntidade;

public class GeradorDeOficinaFactory {

	private static GeradorDeOficinas geradorDeOficinas = new GeradorDeOficinas(new ArrayList<>());

	// Método para adicionar uma oficina
	public static void adicionarOficina(String nome, String cnpj, List<ServicosAutomotivoEnum> servicos) {
		OficinaEntidade oficina = new OficinaEntidade(nome, cnpj, servicos);
		geradorDeOficinas.adicionarOficina(oficina);
	}

	// Método para obter o gerador de oficinas
	public static GeradorDeOficinas getGeradorDeOficinas() {
		return geradorDeOficinas;
	}

	// Método para gerar o relatório das oficinas
	public static String gerarRelatorioOficinas() {
		return geradorDeOficinas.gerarRelatorioOficinas();
	}
}
