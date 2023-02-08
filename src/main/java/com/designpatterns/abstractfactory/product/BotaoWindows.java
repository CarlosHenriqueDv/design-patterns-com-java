package com.designpatterns.abstractfactory.product;

/**
 * EstudosJava
 *
 * @author cshen on 07/02/2023.
 */
public class BotaoWindows implements Botao {

    private final String tipoBotao = "Windows";

    @Override
    public void click() {
        System.out.println("Click " + tipoBotao);
    }

    @Override
    public String tipoBotao() {
        return "Tipo Botao: " + this.tipoBotao;
    }
}
