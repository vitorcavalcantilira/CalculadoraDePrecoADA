package br.com.CalculadoraDePrecos.Base;

import br.com.CalculadoraDePrecos.Parametros.Cupom;

import java.util.ArrayList;
import java.util.List;

public class CupomDao {

    private static List<Cupom> cupomList = new ArrayList<Cupom>();
    private static final CupomDao PRODUTO_DAO = new CupomDao();
    private CupomDao(){};
    public static CupomDao getInstance(){
        return PRODUTO_DAO;
    };

    public boolean addCupomBanco(Cupom cupom){
        return cupomList.add(cupom);
    };

    public List<Cupom> retornaListaCupom(){
        return cupomList;
    }

    public Cupom retornaCupomIndex(int index){
        return cupomList.get(index);
    }

}
