
package boletin13n1;
import java.util.Scanner;

public class Conversortemp {
    final float c=80;
    public float Conversionfc(float tc) throws Temperaturaerror{

       if(tc>80){
           throw new Temperaturaerror();
       }else{
        
      float f= 9*tc+32/5;
       return f;
       }
    }
        public float Conversionrc(float tc) throws Temperaturaerror{

       if(tc>80){
           throw new Temperaturaerror();
       }else{
        
      float r= 4*tc/5;
       return r;
       }
    }


}
