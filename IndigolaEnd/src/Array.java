import java.util.Scanner;
import java.util.Random;
public class Array {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int players,bots,TotalPlayers,jugada;

        System.out.println("Ingresa catindad de jugadores 1-4");
        players = teclado.nextInt();
        System.out.println("Ingresa catindad de bots 1-3");
        bots = teclado.nextInt();
        TotalPlayers=players+bots;
            for (int rep =1; rep <=TotalPlayers; rep++){
                System.out.println("----------------------------");
                System.out.println("Jugador "+rep);
                System.out.println("----------------------------");
                MatrizArray();
            }
    }
    public static String MatrizArray(){
        int jugada;
        Random randon = new Random();
        //Matriz cuadrada de tamanio 10 x 12
        int[][] matriz = new int[8][12];
        // dos for para recorrer cada posicion de la matriz y agregar el numero
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                //Colocar de numero aleatorio
                matriz[i][j] = randon.nextInt(9);
            }
        }
        //Imprimir baraja

        String BarajaVer = "";
        for (int i = 1; i <=1; i++) {
            for (int j = 0; j <=6 ; j++) {
                BarajaVer = BarajaVer + "|" + matriz[i][j]+ "|" ;
            }
            BarajaVer = BarajaVer + "\n";
        }

        //Rempazar/Eliminar Carta
        System.out.println("La baraja del jugador es:  "+BarajaVer);
        Scanner teclado=new Scanner(System.in);
        System.out.println("Posicion de carta que desea colocar: ");
        jugada = teclado.nextInt();
        for (int g=jugada; g<7; g++){
            matriz[g] =matriz [g+1];
        }

        System.out.println("La baraja actual del jugador es:  ");
        for(int g=0;g<7;g++)
            System.out.println(matriz[g]);


        //Rempazar/Eliminar Carta
        System.out.println("La baraja del jugador es:  "+BarajaVer);
        //Remplazar
        Scanner leer=new Scanner(System.in);
        System.out.println("Posicion de carta que desea colocar: ");
        jugada = leer.nextInt();
        for (int g=jugada; g<1; g++){
            for (int h=jugada; h<6; h++){
                matriz[g][h] =matriz [g+1][h+1];
            }
            }


            for(int g=0;g<1;g++){
                for(int h=0;h<6;h++){
                    BarajaVer = BarajaVer + "|" + matriz[g][h]+ "|" ;
            }
                System.out.println("La baraja actual del jugador es:  "+BarajaVer);
            }
        return BarajaVer;
    }
}
