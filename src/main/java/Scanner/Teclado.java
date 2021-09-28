package Scanner;

import java.util.Scanner;
// El paquete java.lang no se importa nunca

public class Teclado {
    public static void main(String[] args) {
        // Para leer por teclado usamos la clase Scanner
        // Declaración de un objeto Scanner y otro String
        Scanner teclado;
        String miNombre;

        // Construyo el objeto Scanner con su constructor pasando como parámetro el flujo de entrada estándar
        // Entrada estándar es System.in
        // Todos los constructores necesitan palabra reservada new para poder reservar memoria
        teclado = new Scanner(System.in);

        // Se guarda en la variable miNombre el resultado de introducir caracteres por teclado hasta que se pulsa enter
        System.out.println("Introduce tu nombre");
        miNombre = teclado.nextLine();
        System.out.println("Bienvenido " + miNombre);
    }
}
