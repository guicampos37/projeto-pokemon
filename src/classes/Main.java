
package classes;

public class Main {

    public static void main(String[] args) {
        pokeLoadingScreen loadingScreen = new pokeLoadingScreen();
        loadingScreen.setVisible(true);
        pokeScreen screen = new pokeScreen();
        
        try {
            for(int i=0; i <= 100; i++) {
                Thread.sleep(40);
                loadingScreen.porcentagem.setText(Integer.toString(i) + "%");
                loadingScreen.barra.setValue(i);
                
                if(i == 100) {
                    loadingScreen.setVisible(false);
                    
                }
            }
        } catch(Exception e) {
            
        }
        
        if(!loadingScreen.isVisible()) {
            screen.setVisible(true);
        }
    }
    
}
