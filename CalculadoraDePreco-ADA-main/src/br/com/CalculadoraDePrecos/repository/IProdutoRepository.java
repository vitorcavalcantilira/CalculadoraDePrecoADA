package br.com.CalculadoraDePrecos.repository;

import br.com.CalculadoraDePrecos.Parametros.Produto;

import java.util.List;

public interface IProdutoRepository {

    public Produto criarProduto(String nome, double valor);
    public boolean salvarProdutoBanco(Produto produto);
    public List<Produto> retornaListaProdutos();
    public Produto retornaProdutoIndex(int index);
}
