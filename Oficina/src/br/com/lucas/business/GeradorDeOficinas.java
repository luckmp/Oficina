package br.com.lucas.business;

import java.util.List;

import br.com.lucas.api.common.ServicosAutomotivoEnum;
import br.com.lucas.business.entidades.OficinaEntidade;

public class GeradorDeOficinas {

	private List<OficinaEntidade> oficinas;

	public GeradorDeOficinas(List<OficinaEntidade> oficinas) {
		if (oficinas == null) {
			throw new IllegalArgumentException("A lista de oficinas não pode ser nula.");
		}
		this.oficinas = oficinas;
	}

	public List<OficinaEntidade> getOficinas() {
		return oficinas;
	}

	public void adicionarOficina(OficinaEntidade oficina) {
		oficinas.add(oficina);
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

	public String gerarRelatorioOficinas() {
		StringBuilder sb = new StringBuilder();
		if (oficinas.isEmpty()) {
			sb.append("Nenhuma oficina disponível.\n");
			return sb.toString();
		}

		for (OficinaEntidade oficina : oficinas) {
			sb.append("Oficina: ").append(oficina.getNome()).append("\n");
			sb.append("CNPJ: ").append(oficina.getCNPJ()).append("\n");

			// Serviços realizados
			sb.append("Serviços realizados:\n");
			boolean encontrouServico = false;
			for (ServicosAutomotivoEnum servico : ServicosAutomotivoEnum.values()) {
				if (oficina.realizaServico(servico)) {
					sb.append("- ").append(formatarDescricaoServico(servico)).append("\n");
					encontrouServico = true;
				}
			}
			if (!encontrouServico) {
				sb.append("Nenhum serviço realizado.\n");
			}

			// Serviços não realizados
			sb.append("\nServiços não realizados:\n");
			encontrouServico = false;
			for (ServicosAutomotivoEnum servico : ServicosAutomotivoEnum.values()) {
				if (!oficina.realizaServico(servico)) {
					sb.append("- ").append(formatarDescricaoServico(servico)).append("\n");
					encontrouServico = true;
				}
			}
			if (!encontrouServico) {
				sb.append("Todos os serviços realizados.\n");
			}

			sb.append("\n----------------------------------\n\n");
		}
		return sb.toString();
	}
	   

}
