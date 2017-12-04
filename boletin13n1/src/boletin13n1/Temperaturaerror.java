
package boletin13n1;


public class Temperaturaerror extends Exception {
    
    public Temperaturaerror(){
        super("a temperatura no puede ser superior a 80º centigrados");
    }
}
