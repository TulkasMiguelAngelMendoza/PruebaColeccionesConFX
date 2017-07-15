
package ar.com.miguel.model;

import ar.com.miguel.entity.Perro;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PerroMapDAO implements PerroDAO {
    
    private Map<String, Perro> mapPerros;

    public PerroMapDAO() {
        mapPerros=new TreeMap();
    }
    
    
    
    @Override
    public void guardar(Perro t) {
       mapPerros.put(t.getRaza(), t);
    }

    @Override
    public Perro recuperar(String k) {
        return mapPerros.get(k);
    }

    @Override
    public void modificar(Perro t) {
        mapPerros.replace(t.getRaza(), t);
    }

    @Override
    public List<Perro> recuperarTodos() {
        List<Perro> listaPerros=new ArrayList();
        mapPerros.forEach((clave,perro)->listaPerros.add(perro));
        return listaPerros;
    }

    @Override
    public void eliminar(Perro t) {
        mapPerros.remove(t.getRaza());
    }

    @Override
    public String toString() {
        return mapPerros.toString();
    }
    
    
    
}
