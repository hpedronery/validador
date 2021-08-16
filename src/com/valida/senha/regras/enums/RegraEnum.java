package com.valida.senha.regras.enums;

public enum RegraEnum {

    MAIUSCULAS("maiúsculo(s)") {
        public boolean verifica(char ch) {
            return Character.isUpperCase(ch);
        }
    },
    MINUSCULAS("minúsculo(s)") {
        public boolean verifica(char ch) {
            return Character.isLowerCase(ch);
        }
    },
    DIGITOS("numérico(s)") {
        public boolean verifica(char ch) {
            return Character.isDigit(ch);
        }
    },
    ESPECIAIS("especial(is)") {
        public boolean verifica(char ch) {
            return !Character.isDigit(ch) && !Character.isLetter(ch) && !Character.isWhitespace(ch);
        }
    };

    private final String nome;

    RegraEnum(String nome) {
        this.nome = nome;
    }

    public abstract boolean verifica(char ch);

    public String getNome() {
        return nome;
    }
}