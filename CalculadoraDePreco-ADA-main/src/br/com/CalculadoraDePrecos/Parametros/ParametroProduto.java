package br.com.CalculadoraDePrecos.Parametros;


import java.util.List;

public class ParametroProduto {

    private static final ParametroProduto PRODUTO_CONTROLLER = new ParametroProduto();
    private ParametroProduto(){}
    private static ParametroProduto getInstance(){
        return PRODUTO_CONTROLLER;
    }


    public Produto criarProduto(String nome, double valor) {
        return null;
    }

    public void salvarProdutoBanco(Produto produto) {

    }

    public List<Produto> retornaListaProdutos() {
        return null;
    }

    public Produto retornaProdutoIndex(int index) {
        return null;
    }
}
