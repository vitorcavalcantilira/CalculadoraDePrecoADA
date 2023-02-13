package br.com.CalculadoraDePrecos.Parametros;
    abstract class Frete implements IFrete {

        private Double peso;
        private Double tam;
        private Double distance;
        private Double promo = 0.0;

        protected Frete(Double peso, Double tam, Double distance, Double ValorProduto) {
            this.peso = peso;
            this.tam = tam;
            this.distance = distance;
        }

        @Override
        public Boolean tamanhoMaximo() {
            if (tam > 40) {
                System.out.println("Tamanho máximo de 40cm.");
                return false;
            }
            return true;
        }

        @Override
        public Boolean pesoMaximo() {
            if (peso > 10.0) {
                System.out.println("Peso máximo é 10kg.");
                return false;
            }
            return true;
        }

        protected Boolean validadorPesoTamanho() {
            if (pesoMaximo() && tamanhoMaximo()) {
                return true;
            }
            return false;
        }

        @Override
        public Double precoPelaDistancia() {
            return distance * 1.10;
        }

        @Override
        public Double precoPeloPeso() {
            return peso * 0.30;
        }

        public Double valorDoFrete() {
            return precoPelaDistancia() + precoPeloPeso() - promo;
        }

    }
