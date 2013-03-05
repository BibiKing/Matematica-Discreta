
import java.util.List;

public class Conjunto <T extends Comparable>{
    List<T> elementos;
    
    public Conjunto(List<T> elementos){
        this.elementos = elementos;
    }
    
    public boolean contemElemento(Object e){
        for(T elemento: elementos){
            if(elemento.compareTo(e) == 0){
                return true;
            }
        }    
        return false;        
    }
    
    public boolean estaContido(Conjunto C){
        for(T elemento: elementos){
            if(!C.contemElemento(elemento)){
                return false;
            }
        }
        return true;
    }

}
