package br.edu.umfg.isp.refatorado;

import br.edu.umfg.isp.legado.IConta;

public class ContaPoupancaRefatorada extends AbstractConta implements IContaRefatoradora {
    public ContaPoupancaRefatorada(String documento, String nome) {
        super(documento, nome);
    }
}
