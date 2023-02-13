package br.com.CalculadoraDePrecos.Parametros;

public class ParametroCupom {

    public Cupom gerarCupom() {
        return new Cupom();
    }

    public void salvarCupom(Cupom cupom) {
       cupom = gerarCupom();
    }

    @Override
    public boolean validaCupom() {
        return false;
    }

    @Override
    public void usaCupom() {

    }
}
