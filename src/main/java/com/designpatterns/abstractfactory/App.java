package com.designpatterns.abstractfactory;

import com.designpatterns.abstractfactory.factory.GuiFactory;
import com.designpatterns.abstractfactory.product.Botao;
import com.designpatterns.abstractfactory.product.Painel;

/**
 * EstudosJava
 *
 * @author cshen on 07/02/2023.
 */
public class App {

    private Painel painel;
    private Botao botao;

    public App(GuiFactory guiFactory) {
        this.painel = guiFactory.criaPainel();
        this.botao = guiFactory.criaBotao();
    }

    public void configuracaoGuiApplication(){
        System.out.println(this.painel.tipoPainel());
        System.out.println(this.botao.tipoBotao());
    }
}
