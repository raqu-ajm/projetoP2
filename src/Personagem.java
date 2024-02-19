public class Personagem {
        private String nome;
        private int energia;
        private int maxEnergia;
    
        public Personagem(String nome, int energia, int maxEnergia) {
            this.nome = nome;
            this.energia = energia;
            this.maxEnergia = maxEnergia;
        }
    
        //métodos
        public String getNome() {
            return nome;
        }
    
        public int getEnergia() {
            return energia;
        }

        public void mudarEnergia(int dano) {
            System.out.println(this.nome + " tinha " + this.energia + " energia");
            int novaEnergia = this.energia-dano;

            if(novaEnergia < maxEnergia && novaEnergia > 0){
                this.energia = novaEnergia;
                System.out.println("agora ele tem " + this.energia + " de energia") ;
            }
            else if (novaEnergia >= maxEnergia) {
                this.energia = maxEnergia;
                System.out.println("agora ele tem " + this.energia + " de energia");
            }
            else if (novaEnergia <= 0) {
                this.energia = 0;
                System.out.println(nome + "chegou a "+ this.energia +" e ficou esgotado!");
            }
        }
    }
