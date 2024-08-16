package br.edu.umfg.isp.refatorado;

public interface IContaRefatoradora {
    void creditar(Double valor);

    void debitar(Double valor);

    Double getSaldo();
}
