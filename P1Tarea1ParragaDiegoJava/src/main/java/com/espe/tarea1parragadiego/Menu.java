
package com.espe.tarea1parragadiego;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Menu {
    ClasePromedio ingreso;
    public void menu(){
        Scanner scan=new Scanner(System.in);
        int op;
        do{
        System.out.println("|==============================|");
        System.out.println("1.-Ingresar notas");
        System.out.println("2.-Ver notas");
        System.out.println("3.-Salir");
        System.out.println("Escoja una opcion");
        op=scan.nextInt();
        
        switch(op){
            case 1:
                ingresoNotas();
                break;
            case 2:
                verNotas();
                break;
            case 3:
                System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Ingrese una opcion correcta");
        }
        
        }while(op!=3);
    }
    
    public void ingresoNotas(){
        ingreso=new ClasePromedio("", 0f, 0f, 0f);
        ingreso.ingresarNotas();
        
    }
    public void verNotas() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el nombre del archivo a leer: ");
        String Parraga_nombreArchivo=scan.nextLine();
        leerArchivo(Parraga_nombreArchivo+".csv");
    }

    // Método para leer el archivo CSV
    private void leerArchivo(String fileName) {
        try (BufferedReader leer = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = leer.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
    

