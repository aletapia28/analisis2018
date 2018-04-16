package juegobingo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;


/**
 *
 * @author aleta
 */
public class JuegoBingo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Carton varton = new Carton();
        varton.NumerosRamdom();
      //  varton.NumerosRamdom()= varton.NumerosRamdom();
        
    }
    
}

class Carton{
    private String carton[][];
    private final int matriz=5;
    private final int tamatriz= matriz * matriz;
    private HashMap<String,Boolean> MapaCartones;
    private ArrayList<String> eventos;
    private ArrayList<String> eventosSeleccionados;
    private final String FREE = "FREE SPACE";
    private  int player=0;
    private boolean win;
    
    
    Carton(){}
    
    Carton(ArrayList<String> eventosSelecionados, int number){
        carton= new String [matriz][matriz];
        eventosSelecionados= new ArrayList<>();
        eventos= new ArrayList<>();
        MapaCartones= new HashMap<>();
            MapaCartones.put( FREE, true);
            player=number;
            win=false;
                      
    }
    
    public boolean NumerosRamdom(){     
//        if(this.eventos.size() < tamatriz - 1)
  //              return false;
            while(eventosSeleccionados.size() < tamatriz  - 1)
            {
                Random rand = new Random();
                int index  = rand.nextInt(this.eventos.size());
                String str = eventos.get(index);
                eventosSeleccionados.add(str);
                eventos.remove(str);
            }//end while
            int count = 0;
            for(String str:eventosSeleccionados)
            {
             
                MapaCartones.put(str,false);
                if(count == tamatriz/2)
                {  
                    carton[count/tamatriz][count%tamatriz] = FREE;
                    count++;
                }//end if
                carton[count/tamatriz][count%tamatriz] = str;
                count++;
            }//end for
            return true;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    

}
