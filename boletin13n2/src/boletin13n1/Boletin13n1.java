
package boletin13n1;
import java.util.Scanner;

public class Boletin13n1 {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
       Conversortemp ct = new Conversortemp();
               System.out.println("introduzca los grados centigrados");
      float tc= sc.nextFloat(); 
      try{
          System.out.println(ct.Conversionfc(tc)); 
      }catch(Temperaturaerror te){
        System.out.println(te.getMessage());
      }
      float tcr;
      
      try{
         
               do{
        

           System.out.println("introduzca los grados centigrados correctamente");
              tcr=sc.nextFloat();
     }while(tcr>80);
                System.out.println(ct.Conversionrc(tcr));
      }catch(Temperaturaerror te){
        System.out.println(te.getMessage());
      }
    }
    
}
