import java.util.Scanner;
public class StudentProm {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float m1, m2, m3, m4, m5, m6, m7, prom;
        System.out.println("Ingrese materia 1");
        m1 = leer.nextInt();
        System.out.println("Ingrese materia 2");
        m2 = leer.nextInt();
        System.out.println("Ingrese materia 3");
        m3 = leer.nextInt();
        System.out.println("Ingrese materia 4");
        m4 = leer.nextInt();
        System.out.println("Ingrese materia 5");
        m5 = leer.nextInt();
        System.out.println("Ingrese materia 6");
        m6 = leer.nextInt();
        System.out.println("Ingrese materia 7");
        m7 = leer.nextInt();

        prom = (m1 + m2 + m3 + m4 + m5 + m6 + m7) / 7;
        System.out.println(prom);

        if (m1 >= 4) {
            System.out.println("Materia 1: Aprobado");
        } else {
            System.out.println("Materia 1: Reprobado");
        }
        if (m2 >= 4) {
            System.out.println("Materia 2: Aprobado");
        } else {
            System.out.println("Materia 2: Reprobado");
        }
        if (m3 >= 4) {
            System.out.println("Materia 3: Aprobado");
        } else {
            System.out.println("Materia 3: Reprobado");
        }
        if (m4 >= 4) {
            System.out.println("Materia 4: Aprobado");
        } else {
            System.out.println("Materia 4: Reprobado");
        }
        if (m5 >= 4) {
            System.out.println("Materia 5: Aprobado");
        } else {
            System.out.println("Materia 5: Reprobado");
        }
        if (m6 >= 4) {
            System.out.println("Materia 6: Aprobado");
        } else {
            System.out.println("Materia 6: Reprobado");
        }
        if (m7 >= 4) {
            System.out.println("Materia 7: Aprobado");
        } else {
            System.out.println("Materia 7: Reprobado");
        }

    }
}
