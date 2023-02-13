package br.com.CalculadoraDePrecos.repository;

import br.com.CalculadoraDePrecos.Parametros.Cupom;

public interface ICupomRepository {

    public Cupom gerarCupom();
    public void salvarCupom(Cupom cupom);
    public boolean validaCupom();
    public void usaCupom();


}
