
package ar.com.miguel.test;

import ar.com.miguel.entity.Perro;


public class TestPerro {
    
    public static void main(String[] args){
        Perro p1=new Perro("golden retriver", "blanco", 4, "alemania");
        Perro p2=new Perro("gran danes", "negro", 4, "EEUU");
        Perro p3=new Perro("pittbull", "marron", 4, "argentina");
        
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        
        
    }
    
}
