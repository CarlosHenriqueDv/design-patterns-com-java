package com.designpatterns.abstractfactory.factory;

import com.designpatterns.abstractfactory.product.Botao;
import com.designpatterns.abstractfactory.product.BotaoLinux;
import com.designpatterns.abstractfactory.product.LinuxPainel;
import com.designpatterns.abstractfactory.product.Painel;

/**
 * EstudosJava
 *
 * @author cshen on 07/02/2023.
 */
public class LinuxGuiFactory implements GuiFactory {
    @Override
    public Painel criaPainel() {
        return new LinuxPainel(true);
    }

    @Override
    public Botao criaBotao() {
        return new BotaoLinux();
    }
}
