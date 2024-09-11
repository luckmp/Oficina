package br.com.lucas.api.dto;

import br.com.lucas.api.common.ServicosAutomotivoEnum;
import br.com.lucas.business.entidades.ServicoAutomotivoWrapper;

public class ServicoAutomotivoDto {

    private ServicoAutomotivoWrapper wrapper;

    public ServicoAutomotivoDto() {
        // Inicializa o Wrapper
        this.wrapper = new ServicoAutomotivoWrapper();
    }

    public void processarServico(ServicosAutomotivoEnum servico) {
        switch (servico) {
            case TROCADEPNEU:
                System.out.println(wrapper.trocarPneu());
                break;
            case TROCADEBATERIA:
                System.out.println(wrapper.trocarBateria());
                break;
            case TROCADEOLEO:
                System.out.println(wrapper.trocarOleo());
                break;
            case SERVICOMECANICA:
                System.out.println(wrapper.servicoMecanica());
                break;
        }
    }
}
