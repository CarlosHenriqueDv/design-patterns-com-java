package com.designpatterns.abstractfactory.factory;

import com.designpatterns.abstractfactory.product.Botao;
import com.designpatterns.abstractfactory.product.Painel;

/**
 * EstudosJava
 *
 * @author cshen on 07/02/2023.
 */
public interface GuiFactory {

    Painel criaPainel();
    Botao criaBotao();

}
