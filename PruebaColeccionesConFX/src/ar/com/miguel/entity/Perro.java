
package ar.com.miguel.entity;


public class Perro extends Animal implements Comparable<Perro> {
    private String raza;
    private String color_pelo;

    public Perro() {
        
    }
    
    public Perro(String raza, String color_pelo, int patas, String pais) {
        super(patas, pais);
        this.raza = raza;
        this.color_pelo = color_pelo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor_pelo() {
        return color_pelo;
    }

    public void setColor_pelo(String color_pelo) {
        this.color_pelo = color_pelo;
    }

    @Override
    public String toString() {
        return raza + ", " + color_pelo + ", "+ super.toString();
    }

    @Override
    public int compareTo(Perro o) {
        return raza.compareTo(o.getRaza());
    }
    
      
    
}
