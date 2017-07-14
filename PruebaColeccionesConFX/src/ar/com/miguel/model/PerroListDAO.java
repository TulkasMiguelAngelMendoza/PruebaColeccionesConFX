
package ar.com.miguel.model;

import ar.com.miguel.entity.Perro;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PerroListDAO implements PerroDAO {

    private List<Perro> listPerros;

    public PerroListDAO() {
        listPerros=new ArrayList();
    }
        
    @Override
    public void guardar(Perro t) {
        listPerros.add(t);
        Collections.sort(listPerros);
    }

    @Override
    public Perro recuperar(String k) {
        Perro p=new Perro();
        p.setRaza(k);
        
       
        int ind=Collections.binarySearch(listPerros, p);
        if(ind<0)
            return null;
        else
            return listPerros.get(ind);  
    }

    @Override
    public void modificar(Perro t) {
        int ind=Collections.binarySearch(listPerros, t);;     
        if(ind>=0)
            listPerros.set(ind, t);
          
    }

    @Override
    public List<Perro> recuperarTodos() {
        return listPerros;
       
    }

    @Override
    public void eliminar(Perro t) {
        int ind=Collections.binarySearch(listPerros, t);
        if(ind>=0)
            listPerros.remove(ind);
           
    }
    
 
          

    
}
