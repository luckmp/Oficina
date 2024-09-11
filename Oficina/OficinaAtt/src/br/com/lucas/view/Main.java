package br.com.lucas.view;

import br.com.lucas.api.common.ServicosAutomotivoEnum;
import br.com.lucas.api.controller.ServicoAutomotivoController;

public class Main {

    public static void main(String[] args) {
        ServicoAutomotivoController controller = new ServicoAutomotivoController();
        String resultado = controller.executarServico(ServicosAutomotivoEnum.TROCADEOLEO);
        System.out.println(resultado);
    }
}
