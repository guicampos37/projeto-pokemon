package classes;

/*
charmander = new Pokemon("Charmander",300, 100, "fogo", "planta");
squirtle = new Pokemon("Squirtle", 500, 50, "agua", "fogo");
bulbasaur = new Pokemon("Bulbasaur", 400, 75, "planta", "agua");
*/

public class Pokemon {
    public String nome;
    public int vida;
    public int dano;
    public String tipo;
    public String vantagem;
    
    public Pokemon(String nome,int vida, int dano, String tipo, String vantagem) {
        this.nome = nome;
        this.vida = vida;
        this.dano = dano;
        this.tipo = tipo;
        this.vantagem = vantagem;
    }
}
