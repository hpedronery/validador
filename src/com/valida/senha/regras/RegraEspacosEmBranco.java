package com.valida.senha.regras;

public class RegraEspacosEmBranco extends Regra {
    @Override
    public void verifica(String senha) {
        if(senha.strip().length() < senha.length())
            geraErro("A senha não deve conter espaços vazios.");
    }
}
