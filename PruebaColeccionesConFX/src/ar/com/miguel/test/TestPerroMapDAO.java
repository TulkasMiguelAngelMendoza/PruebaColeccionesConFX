
package ar.com.miguel.test;

import ar.com.miguel.entity.Perro;
import ar.com.miguel.model.PerroMapDAO;
import java.util.List;

public class TestPerroMapDAO {
    
    public static void main(String[] args){
        PerroMapDAO Perros=new PerroMapDAO();
        List<Perro> listaPerros;
        
        Perros.guardar(new Perro("obejero aleman", "marron", 4, "aleman"));
        Perros.guardar(new Perro("terrier", "blanco", 4, "afganistan"));
        Perros.guardar(new Perro("coli", "rubio", 4, "paraguayo"));
        Perros.guardar(new Perro("dogo argentino", "blanco", 4, "argentina"));
        Perros.guardar(new Perro("toy", "negro", 4, "china"));
        
        System.out.println(Perros);
        
        System.out.println("------- recuperar un unico elemento ----------");
        System.out.println(Perros.recuperar("coli"));
        
        System.out.println("------ eliminar un elemento ---------");
        Perros.eliminar(new Perro("terrier","",0,""));
        System.out.println(Perros);
        
        System.out.println("------- modificar un perro -----------");
        Perros.modificar(new Perro("dogo argentino","negro y blanco",4,"brazil"));
        System.out.println(Perros);
        
        System.out.println("-------- recupero todos los perros e imprimo lista ---------------");
        listaPerros=Perros.recuperarTodos();
        System.out.println(listaPerros);
    }//fin del main
    
}
