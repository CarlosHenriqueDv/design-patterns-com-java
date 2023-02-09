package com.designpatterns.abstractfactory;

import com.designpatterns.abstractfactory.factory.GuiFactory;
import com.designpatterns.abstractfactory.factory.LinuxGuiFactory;
import com.designpatterns.abstractfactory.factory.WindowsGuiFactory;

/**
 * EstudosJava
 *
 * @author cshen on 07/02/2023.
 */
public class GuiMain {

    public static void main(String[] args) {

        GuiFactory factory = new WindowsGuiFactory();
        App windowsApp = new App(factory);
        windowsApp.configuracaoGuiApplication();;

        System.out.println(        );

        factory = new LinuxGuiFactory();
        App linuxApp = new App(factory);
        linuxApp.configuracaoGuiApplication();
    }
}
