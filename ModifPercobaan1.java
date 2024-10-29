import java.util.Scanner;

public class ModifPercobaan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     double[] bil = new double[4];
     

     bil[0] = 5.0;
     bil[1] =  12867;
     bil[2] = 7.5;
     bil[3] = 2000000;

   

     System.out.println(bil[0]);
     System.out.println(bil[1]);
     System.out.println(bil[2]);
     System.out.println(bil[3]);

     for (int i = 0; i <= 4 ; i++){
        System.out.println(bil[i]);
      
       }
    }
    
}