package br.com.lucas.view;

import br.com.lucas.api.ServicoAutomotivoController;
import br.com.lucas.business.entidades.Borracharia;
import br.com.lucas.business.entidades.ServicoAutomotivoInterface;

public class Main {
	
	public static void main(String[] args) {
		
		ServicoAutomotivoController controller = new ServicoAutomotivoController();
		controller.trocarPneu();
		
		
//		ServicoAutomotivoInterface i= new Borracharia();
//		System.out.println(i.trocarBateira());
//		System.out.println(i.trocarOleo());
//		System.out.println(i.trocarPneu());
//		System.out.println(i.servicoMecanica());
		
//		// Adicionar oficinas padrão
//		controller.adicionarOficinasPadrao();
//
//		// Imprimir as oficinas disponíveis
//		controller.imprimirOficinasDisponiveis();
//
//		// Gerar relatório de um serviço específico
//		controller.gerarRelatorioServico(ServicosAutomotivoEnum.TROCADEPNEU);
	}
}
