
package ar.com.miguel.test;

import ar.com.miguel.entity.Perro;
import ar.com.miguel.model.PerroDAO;
import ar.com.miguel.model.PerroListDAO;
import java.util.List;

public class TestPerroListDAO {
    
    public static void main(String[] args){
        PerroDAO perros=new PerroListDAO();
        List<Perro> listaP;
        Perro ptemp;
        
        perros.guardar(new Perro("golden retriver", "marron", 4, "ukrania"));
        perros.guardar(new Perro("pitbull", "negro", 4, "albania"));
        perros.guardar(new Perro("gran danes", "blanco", 4, "brazil"));
        perros.guardar(new Perro("coli", "rubio", 4, "uruguay"));
        perros.guardar(new Perro("pastor aleman", "negro", 4, "paraguay"));
        
        listaP=perros.recuperarTodos();
        System.out.println(listaP);
        
        perros.guardar(new Perro("mastill", "blanco y negro", 4, "francia") );
        System.out.println(perros.recuperarTodos());
        
        perros.eliminar(new Perro("gran danes", "", 0, ""));
        System.out.println(perros.recuperarTodos());
        
        ptemp=new Perro("pitbull", "gris", 4, "argentina");
        System.out.println(ptemp);
        perros.modificar(ptemp);
        System.out.println(perros.recuperarTodos());
        
        ptemp=perros.recuperar("coli");
        System.out.println(ptemp);
        
        
    }//fin del main
    
}