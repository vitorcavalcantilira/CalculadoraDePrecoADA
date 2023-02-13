package br.com.CalculadoraDePrecos.Parametros;

public class FreteCalculo extends Frete{

    private Double discount = 1.0;

    public FreteCalculo(Double peso, Double tam, Double distance, Double valorMercadoria) {
        super(peso, tam, distance, valorMercadoria);
    }
    
    @Override
    public Double valorDoFrete() {
        if(!validadorPesoTamanho()) return null;
        Double valorDoFrete = super.valorDoFrete() - this.discount;
        System.out.printf("Seu frete custará R$ %.2f \n", valorDoFrete);
        return valorDoFrete;
    }
}
