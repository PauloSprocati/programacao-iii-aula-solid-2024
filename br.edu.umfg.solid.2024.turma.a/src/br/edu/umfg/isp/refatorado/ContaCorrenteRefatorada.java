package br.edu.umfg.isp.refatorado;

public class ContaCorrenteRefatorada extends AbstractConta implements IContaRefatoradora {

    public ContaCorrenteRefatorada(String documento, String nome) {
        super(documento, nome);
    }

}
