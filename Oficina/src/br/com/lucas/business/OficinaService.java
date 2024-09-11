package br.com.lucas.business;

import br.com.lucas.business.repository.ListaOficinas;
import br.com.lucas.api.common.ServicosAutomotivoEnum;
import br.com.lucas.business.entidades.OficinaEntidade;
import java.util.List;

public class OficinaService {

	public void adicionarOficinasPadrao() {
		ListaOficinas.adicionarOficinasPadrao(); // Chama o repositório para adicionar as oficinas padrão
	}

	public void imprimirOficinasDisponiveis() {
		List<OficinaEntidade> oficinas = ListaOficinas.getOficinas();
		if (oficinas.isEmpty()) {
			System.out.println("Nenhuma oficina disponível.");
		} else {
			for (OficinaEntidade oficina : oficinas) {
				System.out.println("" + oficina.getNome() + " - CNPJ: " + oficina.getCNPJ());
				System.out.println("Serviços realizados:");

				for (ServicosAutomotivoEnum servico : ServicosAutomotivoEnum.values()) {
					if (oficina.realizaServico(servico)) {
						System.out.println("- " + formatarDescricaoServico(servico));
					}
				}

				System.out.println("Serviços não realizados:");
				for (ServicosAutomotivoEnum servico : ServicosAutomotivoEnum.values()) {
					if (!oficina.realizaServico(servico)) {
						System.out.println("- " + formatarDescricaoServico(servico));
					}
				}

				System.out.println("----------------------------------");
			}
		}
	}

	private String formatarDescricaoServico(ServicosAutomotivoEnum servico) {
		switch (servico) {
		case TROCADEOLEO:
			return "Troca de Óleo";
		case TROCADEPNEU:
			return "Troca de Pneu";
		case SERVICOMECANICA:
			return "Serviço de Mecânica";
		case TROCADEBATERIA:
			return "Troca de Bateria";
		default:
			return "Serviço Desconhecido";
		}
	}
}
