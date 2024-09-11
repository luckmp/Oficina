package br.com.lucas.api.controller;

import br.com.lucas.api.common.ServicosAutomotivoEnum;
import br.com.lucas.business.ServicoAutomotivoBusiness;

public class ServicoAutomotivoController {

    private final ServicoAutomotivoBusiness service = new ServicoAutomotivoBusiness();

    public String executarServico(ServicosAutomotivoEnum servicoSelecionado) {

        return service.executarServico(servicoSelecionado);
    }
}
