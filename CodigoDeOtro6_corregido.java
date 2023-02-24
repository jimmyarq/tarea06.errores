// Se agrega package
// Se agrega Scanner
// Se importa la clase Scanner
// Se cambia system print a out.print
// Se corrige int multiplo = (opcion == 1) ? 5 : 7;
// Se cambia printy in por out



package mx.generation;

import java.util.Scanner;

public class CodigoDeOtos6 {
  
    public static void main(String[] args) {
    
        int[] n = new int[20];

        for (int i = 0; i < 20; i++) {
            n[i] = (int)(Math.random() * 381) + 20;
            System.out.print(n[i] + " ");
        }
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n¿Qué números quiere resaltar? ");
        System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
        int opcion = scanner.nextInt();

        int multiplo = (opcion == 1) ? 5 : 7;

        for (int e : n) {
            if (e % multiplo == 0) {
                System.out.print("[" + e + "] ");
            } else {
                System.out.print(e + " ");
            }
        }
    }
}