package br.com.lucas.api;

import br.com.lucas.api.dto.ServicoAutomotivoDto;
import br.com.lucas.business.ServicoAutomotivoBusiness;

public class ServicoAutomotivoController {
	
	public void trocarBateria() {
		
		ServicoAutomotivoBusiness bateria = new ServicoAutomotivoBusiness();
		ServicoAutomotivoDto dto = bateria.executarTrocaBateria();
		System.out.println(dto);
	}
	
	public void trocarPneu() {
		
		ServicoAutomotivoBusiness pneu = new ServicoAutomotivoBusiness();
		ServicoAutomotivoDto dto1 = pneu.executarTrocaPneu();
		System.out.println(dto1);
	} 
	
	public void trocarOleo() {
		
		ServicoAutomotivoBusiness oleo = new ServicoAutomotivoBusiness();
		ServicoAutomotivoDto dto = oleo.executarTrocaOleo();
		System.out.println(dto);
	}
	
	public void servicoMecanica() {
		
		ServicoAutomotivoBusiness mecanica = new ServicoAutomotivoBusiness();
		ServicoAutomotivoDto dto = mecanica.executarServicoMecanica();
		System.out.println(dto);
	}
	
	

//	private OficinaService oficinaService;
//
//	public ServicoAutomotivoController() {
//		this.oficinaService = new OficinaService();
//	}
//
//	public void adicionarOficinasPadrao() {
//		oficinaService.adicionarOficinasPadrao(); // Controller delega ao serviço
//	}
//
//	public void imprimirOficinasDisponiveis() {
//		oficinaService.imprimirOficinasDisponiveis(); // Controller delega ao serviço
//	}
//
//	public void gerarRelatorioServico(ServicosAutomotivoEnum servico) {
//		ServicoAutomotivoInterface relatorio = RelatorioRepositoryFactory.criarRelatorio(servico);
//		System.out.println(relatorio.gerarRelatorio()); // Exibe o relatório gerado
//	}
	
	
}
