package com.designpatterns.abstractfactory.factory;

import com.designpatterns.abstractfactory.product.Botao;
import com.designpatterns.abstractfactory.product.BotaoWindows;
import com.designpatterns.abstractfactory.product.Painel;
import com.designpatterns.abstractfactory.product.PainelWindows;

/**
 * EstudosJava
 *
 * @author cshen on 07/02/2023.
 */
public class WindowsGuiFactory implements GuiFactory {
    @Override
    public Painel criaPainel() {
        return new PainelWindows(true);
    }

    @Override
    public Botao criaBotao() {
        return new BotaoWindows();
    }
}
