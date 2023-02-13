package br.com.CalculadoraDePrecos.services;

import br.com.CalculadoraDePrecos.Parametros.Cupom;
import br.com.CalculadoraDePrecos.repository.ICupomRepository;

public class CupomService implements ICupomRepository {
    @Override
    public Cupom gerarCupom() {
        return null;
    }

    @Override
    public void salvarCupom(Cupom cupom) {

    }

    @Override
    public boolean validaCupom() {
        return false;
    }

    @Override
    public void usaCupom() {

    }
}
