package com.mycompany.testprincipal;
import java.util.Random;
import java.util.Scanner;

public class TestPrincipal {

    public static void main(String[] args) {
        Random valorRandom = new Random();
        Scanner scanner = new Scanner(System.in);
        String yes = "y"; 

        do {
            int valor1 = valorRandom.nextInt(6) + 1;
            int valor2 = valorRandom.nextInt(6) + 1;

            System.out.println(valor1 + " - " + valor2);
            
            System.out.println("¿Desea volver a tirar los dados (y = yes/*)?");
            try {
                String y = scanner.next();

                if (!y.equalsIgnoreCase(yes)) {
                    break; 
                }
            } catch (Exception e) {
                System.out.println("Hubo un error al leer la entrada del usuario.");
                break;
            }
        } while (true); 

        System.out.println("Gracias por jugar."); 
    }
}
