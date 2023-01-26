package com.designpatterns.builder;

/**
 * design-patterns-com-java
 *
 * @author cshen on 21/01/2023.
 */
public class Personagem {

    private String nome;
    private String classe;

    //atributos fisicos
    private int constituicao;
    private int forca;
    private int destreza;
    private int agilidade;

    //atributos mentais
    private int inteligencia;
    private int forcaVontade;
    private int carisma;
    private int percepcao;
    /*
    public Personagem(String nome, String classe, int constituicao, int forca, int destreza, int agilidade, int inteligencia, int forcaVontade, int carisma, int percepcao) {
        this.nome = nome;
        this.classe = classe;
        this.constituicao = constituicao;
        this.forca = forca;
        this.destreza = destreza;
        this.agilidade = agilidade;
        this.inteligencia = inteligencia;
        this.forcaVontade = forcaVontade;
        this.carisma = carisma;
        this.percepcao = percepcao;
    }*/

    public Personagem(PersonagemBuilder builder){
        this.nome = builder.nome;
        this.classe = builder.classe;
        this.constituicao = builder.constituicao;
        this.forca = builder.forca;
        this.destreza = builder.destreza;
        this.agilidade = builder.agilidade;
        this.inteligencia = builder.inteligencia;
        this.forcaVontade = builder.forcaVontade;
        this.carisma = builder.carisma;
        this.percepcao = builder.percepcao;

    }

    public static class PersonagemBuilder{
        private String nome;
        private String classe;

        //atributos fisicos
        private int constituicao;
        private int forca;
        private int destreza;
        private int agilidade;

        //atributos mentais
        private int inteligencia;
        private int forcaVontade;
        private int carisma;
        private int percepcao;

        public PersonagemBuilder nome(String nome ){
            this.nome = nome;
            return this;
        }

        public PersonagemBuilder classe(String classe){
            this.classe = classe;
            return this;
        }

        public PersonagemBuilder constituicao(int constituicao){
            this.constituicao = constituicao;
            return this;
        }

        public PersonagemBuilder forca(int forca){
            this.forca = forca;
            return this;
        }

        public PersonagemBuilder destreza(int destreza){
            this.destreza = destreza;
            return this;
        }

        public PersonagemBuilder agilidade(int agilidade){
            this.agilidade = agilidade;
            return this;
        }

        public PersonagemBuilder inteligencia(int inteligencia){
            this.inteligencia = inteligencia;
            return this;
        }

        public PersonagemBuilder forcaVontade(int forcaVontade){
            this.forcaVontade = forcaVontade;
            return this;
        }

        public PersonagemBuilder carisma(int carisma){
            this.carisma = carisma;
            return this;
        }

        public PersonagemBuilder percepcao(int percepcao){
            this.percepcao = percepcao;
            return this;
        }

        public Personagem criarPersonagem(){
            return new Personagem(this);
        }




    }

    @Override
    public String toString() {
        return "Personagem = Nome: " + nome + '\n' +
                "Classe= " + classe + "\n" +
                "{Atributos fisicos: " + "forca= " + forca + "; " +
                "destreza= " + destreza + "; " +
                "agilizade= " + agilidade + "; " +
                "forca= " + forca + "; "+
                "constituicao= " + constituicao + "}";

    }



}
