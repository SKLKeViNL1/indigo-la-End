import java.util.Scanner;
import java.util.Random;
public class ArrayGod {
    public static void main(String[] args) {
        int[] normal = {1,2,3,4,5,6};
        int[] otro =new int [5];
        for (int x=0; x<normal; x++){
            otro[x] =otro [x+1];
        }


        for(int g=0;g<1;g++){
            for(int h=0;h<6;h++){
                BarajaVer = BarajaVer + "|" + matriz[g][h]+ "|" ;
            }
            System.out.println("La baraja actual del jugador es:  "+BarajaVer);
        }
    }
}