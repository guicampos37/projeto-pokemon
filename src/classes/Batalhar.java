package classes;

public class Batalhar {
    
    public Batalhar(Pokemon pokemon1, Pokemon pokemon2) {
        int rodadas = 1;
        
        System.out.println("ULTIMATE POKEMON CHAMPIONSHIP");
        System.out.println(pokemon1.nome + " VS " + pokemon2.nome);
        System.out.println("");
        
        while(pokemon1.vida > 0 && pokemon2.vida > 0) {
            System.out.println("Rodada número: " + rodadas);
            System.out.println("");
            
            if(pokemon1.vida > 0) {
                System.out.println(pokemon1.nome + " ataca " + pokemon2.nome);
            
                if (pokemon1.vantagem.equals(pokemon2.tipo)) {
                    System.out.println("Golpe crítico!");
                    pokemon2.vida -= pokemon1.dano * 2;
                    System.out.println(pokemon2.nome + " recebeu " + pokemon1.dano * 2 + " de dano");
                } else if(pokemon1.tipo.equals(pokemon2.vantagem)) {
                    System.out.println("Golpe não efetivo");
                    pokemon2.vida -= pokemon1.dano / 2;
                    System.out.println(pokemon2.nome + " recebeu " + pokemon1.dano / 2 + " de dano");
                } else {
                    pokemon2.vida -= pokemon1.dano;
                    System.out.println(pokemon2.nome + " recebeu " + pokemon1.dano + " de dano");
                }       
                                
                if(pokemon2.vida < 1) {
                    System.out.println("");
                    System.out.println(pokemon2.nome + " desmaiou");
                }
            }            
            
            if(pokemon2.vida > 0) {
                System.out.println("");
                
                System.out.println(pokemon2.nome + " ataca " + pokemon1.nome);
            
                if(pokemon2.vantagem.equals(pokemon1.tipo)) {
                    System.out.println("Golpe crítico");
                    pokemon1.vida -= pokemon2.dano * 2;
                    System.out.println(pokemon1.nome + " recebeu " + pokemon2.dano * 2 + " de dano");
                } else if(pokemon2.tipo.equals(pokemon1.vantagem)) {
                    System.out.println("Golpe não efetivo");
                    pokemon1.vida -= pokemon2.dano / 2;
                    System.out.println(pokemon1.nome + " recebeu " + pokemon2.dano / 2 + " de dano");
                } else {
                    pokemon1.vida -= pokemon2.dano;    
                    System.out.println(pokemon1.nome + " recebeu " + pokemon2.dano + " de dano");
                }
                                
                if(pokemon1.vida < 1) {
                    System.out.println("");
                    System.out.println(pokemon1.nome + " desmaiou");
                }
            }
            
            System.out.println("-------------------------------------------");
            
            rodadas++;
        }
    }
}
