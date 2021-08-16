package com.valida.senha.regras;

import com.valida.senha.exceptions.ValidacaoSenhaException;
import com.valida.senha.servico.Validador;

public abstract class Regra {

    public void geraErro(String mensagemDeErro) {
        if(Validador.isGeraRelatorio())
            setMensagemDeErro(mensagemDeErro);
        else
            throw new ValidacaoSenhaException(mensagemDeErro);
    }

    public void setMensagemDeErro(String mensagemDeErro) {
        Validador.setMensagemDeErro(Validador.getMensagemDeErro() + mensagemDeErro + "\n");
    }

    public abstract void verifica(String senha);
}