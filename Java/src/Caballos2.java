import java.util.Scanner;
public class Caballos2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int ncaballo, tablero,dadoTotal;
        int caballodado,caballoda=0,ganador;
        String salir ="Si";
        System.out.println("Tamaño del tablero: ");
        tablero = leer.nextInt();
        System.out.println("Cantidad de caballos: ");
        ncaballo = leer.nextInt();
        while(salir.equals("Si")){
        for (int a=1; a<=ncaballo; a++){
            for (int x=1; x<=1; x++){
                System.out.println("Caballo "+a);
                System.out.println("Tiradas");
                int dado0 = (int)(Math.random()*100+1);
                System.out.println(dado0);
                int dado1 = (int)(Math.random()*100+1);;
                System.out.println(dado1);
                int dado2 = (int)(Math.random()*100+1);;
                System.out.println(dado2);
                int dado3 = (int)(Math.random()*100+1);;
                System.out.println(dado3);
                int dado4 = (int)(Math.random()*100+1);;
                System.out.println(dado4);
                dadoTotal=dado0+dado1+dado2+dado3+dado4;
                caballodado=caballoda+dadoTotal;
                System.out.println("Caballo "+a+" Lleva: "+caballodado);
                System.out.println("El caballo gana solo si pasa de "+tablero);
                System.out.println("\t");
            }
        }
            System.out.println("Quiere volver a intentar? (Si/No)");
            Scanner readName = new Scanner(System.in);
            salir = readName.nextLine();
        }
        System.out.println("Que caballo gano?");
        ganador = leer.nextInt();
        System.out.println("Felicidades caballo "+ganador+" por superar los "+ tablero);
    }
}

