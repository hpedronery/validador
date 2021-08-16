package com.valida.senha.servico;

import com.valida.senha.regras.Regra;
import com.valida.senha.exceptions.ValidacaoSenhaException;

import java.util.List;

public class Validador {

    private static boolean geraRelatorio;
    private static String mensagemDeErro = "";
    private final List<Regra> regras;

    public Validador(List<Regra> regras) {
        this.regras = regras;
    }

    public void validar(String senha) {
        regras.forEach(item -> item.verifica(senha));
        if (Validador.geraRelatorio && !Validador.getMensagemDeErro().isEmpty())
            throw new ValidacaoSenhaException(mensagemDeErro);
    }

    public static boolean isGeraRelatorio() {
        return geraRelatorio;
    }

    public static void setGeraRelatorio(boolean geraRelatorio) {
        Validador.geraRelatorio = geraRelatorio;
    }

    public static String getMensagemDeErro() {
        return mensagemDeErro;
    }

    public static void setMensagemDeErro(String mensagemDeErro) {
        Validador.mensagemDeErro = mensagemDeErro;
    }
}