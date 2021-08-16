package com.valida.senha.servico;

import com.valida.senha.regras.RegraCaracteres;
import com.valida.senha.regras.RegraEspacosEmBranco;
import com.valida.senha.regras.RegraTamanho;
import com.valida.senha.regras.enums.RegraEnum;

import java.util.Arrays;

public class Regrador {

    public void ehValida(String senha) {
        Validador validador = new Validador(Arrays.asList(
                new RegraTamanho(20, 10),
                new RegraCaracteres(RegraEnum.MAIUSCULAS, 1),
                new RegraCaracteres(RegraEnum.MINUSCULAS, 1),
                new RegraCaracteres(RegraEnum.DIGITOS, 1),
                new RegraCaracteres(RegraEnum.ESPECIAIS, 1),
                new RegraEspacosEmBranco()
        ));
        Validador.setGeraRelatorio(true);
        validador.validar(senha);
    }
}