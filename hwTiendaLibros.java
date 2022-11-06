package ejerciciosUdemy;

import java.util.Scanner;

public class hwTiendaLibros {

    public static void main(String[] args) {

        String nombre;
        int id;
        double price;
        boolean envioFree;

        Scanner dato = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        nombre = dato.nextLine();
        System.out.print("Ingrese su ID: ");
        id = dato.nextInt();
        System.out.print("Precio: ");
        price = dato.nextDouble();
        System.out.print("Es gratis el envio: ");
        envioFree = dato.nextBoolean();

        System.out.println(nombre + " ID: " + id);
        System.out.println("$: "+ price +" Envio Gartuito: "+envioFree);

    }
}
