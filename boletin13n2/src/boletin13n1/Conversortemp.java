
package boletin13n1;
import java.util.Scanner;

public class Conversortemp {
    final float c=80;
    Scanner sc = new Scanner(System.in);
    public float Conversionfc(float tc) throws Temperaturaerror{

       if(tc>80){
           throw new Temperaturaerror();
       }else{
        
      float f= 9*tc+32/5;
       return f;
       }
    }
        public float Conversionrc(float tcr) throws Temperaturaerror{


        
      float r= 4*tcr/5;
       return r;
      
    }


}
