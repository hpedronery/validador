package com.valida.senha.regras;

public class RegraTamanho implements Regra {

    private final int maior;
    private final int menor;

    public RegraTamanho(int maior, int menor) {
        this.maior = maior;
        this.menor = menor;
    }

    @Override
    public void verifica(String senha) {
        menorQue(senha);
        maiorQue(senha);
    }

    private void menorQue(String senha) {
        if(senha.length() < menor) {
            geraErro("A senha deve ter mais que " + menor + " caracteres.");
        }
    }

    private void maiorQue(String senha) {
        if(senha.length() > maior) {
            geraErro("A senha deve ter menos de " + maior + " caracteres.");
        }
    }
}
