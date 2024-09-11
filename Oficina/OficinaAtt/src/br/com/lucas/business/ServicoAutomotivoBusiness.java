package br.com.lucas.business;

import br.com.lucas.api.common.ServicosAutomotivoEnum;
import br.com.lucas.business.entidades.Borracharia;
import br.com.lucas.business.entidades.LojaDeBateria;
import br.com.lucas.business.entidades.LojaDeOleo;
import br.com.lucas.business.entidades.OficinaMecanica;

public class ServicoAutomotivoBusiness {

    public String executarServico(ServicosAutomotivoEnum servicoSelecionado) {
        Borracharia borracharia = new Borracharia();
        LojaDeBateria lojaDeBateria = new LojaDeBateria();
        LojaDeOleo lojaDeOleo = new LojaDeOleo();
        OficinaMecanica oficinaMecanica = new OficinaMecanica();

        StringBuilder resultado = new StringBuilder();

        switch (servicoSelecionado) {
            case TROCADEPNEU:
                resultado.append(borracharia.trocarPneu()).append("\n");
                resultado.append(borracharia.trocarBateria()).append("\n");
                resultado.append(borracharia.trocarOleo()).append("\n");
                resultado.append(borracharia.servicoMecanica()).append("\n");
                break;
            case TROCADEBATERIA:
                resultado.append(lojaDeBateria.trocarBateria()).append("\n");
                resultado.append(lojaDeBateria.trocarPneu()).append("\n");
                resultado.append(lojaDeBateria.trocarOleo()).append("\n");
                resultado.append(lojaDeBateria.servicoMecanica()).append("\n");
                break;
            case TROCADEOLEO:
                resultado.append(lojaDeOleo.trocarOleo()).append("\n");
                resultado.append(lojaDeOleo.trocarPneu()).append("\n");
                resultado.append(lojaDeOleo.trocarBateria()).append("\n");
                resultado.append(lojaDeOleo.servicoMecanica()).append("\n");
                break;
            case SERVICOMECANICA:
                resultado.append(oficinaMecanica.servicoMecanica()).append("\n");
                resultado.append(oficinaMecanica.trocarPneu()).append("\n");
                resultado.append(oficinaMecanica.trocarBateria()).append("\n");
                resultado.append(oficinaMecanica.trocarOleo()).append("\n");
                break;
        }

        return resultado.toString();
    }
}
