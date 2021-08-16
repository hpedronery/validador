package com.valida.senha.regras;

import com.valida.senha.regras.caracteres.RegraEnum;

import java.util.List;
import java.util.stream.Collectors;

public class RegraCaracteres extends Regra {

    private final RegraEnum regraEnum;
    private final int quantidade;

    public RegraCaracteres(RegraEnum regraEnum, int quantidade) {
        this.regraEnum = regraEnum;
        this.quantidade = quantidade;
    }

    @Override
    public void verifica(String senha) {
        List<Character> characters = senha.chars().
                mapToObj(ch -> (char)ch).
                collect(Collectors.toList());

        var contador = 0;
        for(char ch: characters) {
            if (regraEnum.verifica(ch))
                contador++;
        }

        if(contador < quantidade) {
            geraErro("A senha deve ter ao menos " + quantidade + " caractere(s) " + regraEnum.getNome());
        }
    }
}
