
package ar.com.miguel.entity;

public abstract class Animal {
    private int patas;
    private String pais;

    public Animal() {
    }
        
    public Animal(int patas, String pais) {
        this.patas = patas;
        this.pais = pais;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return patas + ", " + pais ;
    }
    
    
    
}
