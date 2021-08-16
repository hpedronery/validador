package com.valida.senha.regras;

import com.valida.senha.exceptions.ValidacaoSenhaException;
import com.valida.senha.servico.Validador;

public interface Regra {

    default void geraErro(String mensagemDeErro) {
        if(Validador.isGeraRelatorio())
            setMensagemDeErro(mensagemDeErro);
        else
            throw new ValidacaoSenhaException(mensagemDeErro);
    }

    default void setMensagemDeErro(String mensagemDeErro) {
        Validador.setMensagemDeErro(Validador.getMensagemDeErro() + mensagemDeErro + "\n");
    }

    void verifica(String senha);
}