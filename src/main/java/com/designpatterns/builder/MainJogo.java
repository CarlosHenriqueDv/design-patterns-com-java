package com.designpatterns.builder;

/**
 * design-patterns-com-java
 *
 * @author cshen on 21/01/2023.
 */
public class MainJogo {

    public static void main(String[] args) {

        //Personagem p1 = new Personagem("Natsu", "Barbáro", 120, 300, 60, 80, 0, 400, 0, 40);

        Personagem pBarbaro = new Personagem.PersonagemBuilder()
                .nome("Danvard")
                .classe("Barbáro")
                .forca(100)
                .agilidade(55)
                .destreza(88).criarPersonagem();

        Personagem pMago = new Personagem.PersonagemBuilder()
                .nome("Darkmor")
                .classe("Mago")
                .inteligencia(150)
                .carisma(98)
                .destreza(40).criarPersonagem();


        Personagem.PersonagemBuilder builderMagoShaman =
                new Personagem.PersonagemBuilder()
                .inteligencia(200)
                .forca(10)
                .percepcao(150);

        Personagem mago = builderMagoShaman
                .classe("Mago")
                .nome("Darkna")
                .criarPersonagem();

        Personagem shaman = builderMagoShaman
                .classe("Shaman")
                .nome("Luael")
                .criarPersonagem();


        System.out.println(mago);
        System.out.println(shaman);


        /*
        System.out.println(pBarbaro);
        System.out.println();
        System.out.println(pMago);
        */

    }
}
