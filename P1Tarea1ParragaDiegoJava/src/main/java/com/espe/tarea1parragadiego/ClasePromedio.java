
package com.espe.tarea1parragadiego;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class ClasePromedio extends ClasePersona {
    //Atributos
    private ArrayList<Float> Parraga_promedio= new ArrayList<>();//Se alamacenara los promedios en este ArrayList
    private String Parraga_nombreArchivo;//Para que el usuario elija el nombre de su archivo

    //Constructor 
    public ClasePromedio(String Parraga_estudiante, float Parraga_nota1, float Parraga_nota2, float Parraga_nota3) {
        super(Parraga_estudiante, Parraga_nota1, Parraga_nota2, Parraga_nota3);
    }

    
 //Sobreescritura del metodo de la clase padre
    @Override
    public void ingresarNotas() {
        Scanner scan = new Scanner(System.in);
      System.out.println("Bienvenido al sistema");
      System.out.print("Ingrese cuantos estudiantes desea ingresar (1-3): ");
      int num = scan.nextInt();
     while(num<1 || num>3){
            System.out.print("Error. Solo entre 1 - 3: ");
            num=scan.nextInt();
        }
        for (int i=0;i<num;i++) {
            System.out.println("-------------------------------------------------");
            System.out.print("Ingrese el nombre del estudiante #"+ (i+1) +": ");
              scan.nextLine();//Para limpiar el buffer
            String Parraga_estudiante=scan.nextLine();//Pedimos el nombre del estudiante
            //Ingreso de notas y su validacion de 0 y 20
            System.out.print("Ingrese la nota 1: ");
            float Parraga_nota1=scan.nextFloat();
            while(Parraga_nota1<0 || Parraga_nota1>20){
                System.out.print("Error 0-20. Vuelva a ingresar la nota 1: ");
                 Parraga_nota1=scan.nextFloat();
            }
            System.out.print("Ingrese la nota 2: ");
            float Parraga_nota2=scan.nextFloat();
            while(Parraga_nota2<0 || Parraga_nota2>20){
                System.out.print("Error 0-20. Vuelva a ingresar la nota 2: ");
                 Parraga_nota2=scan.nextFloat();
            }
            System.out.print("Ingrese la nota 3: ");
            float Parraga_nota3=scan.nextFloat();
            while(Parraga_nota3<0 || Parraga_nota3>20){
                System.out.print("Error 0-20. Vuelva a ingresar la nota 3: ");
                 Parraga_nota3=scan.nextFloat();
            }
             float promedio=(Parraga_nota1+Parraga_nota2+Parraga_nota3)/3;//declaro el atributo promedio para sacar su nota
             Parraga_promedio.add(promedio);//Almaceno los promedio en el ArrayList
             System.out.println("Promedio de "+Parraga_estudiante+": "+promedio);//Imprimo en cada iteración su promedio
             
        }
        //Pido al usuario que ingrese el nombre de su archivo para que luego lo pueda buscar
        scan.nextLine();
        System.out.print("Ingrese el nombre del archivo para guardar los promedios: ");
        Parraga_nombreArchivo = scan.nextLine();
        guardarPromedios(); 
    }

    // Utilizo para guardar todos los promedios en CSV y JSON
    private void guardarPromedios() {
        String filePathCSV=Parraga_nombreArchivo+".csv";
        String filePathJSON=Parraga_nombreArchivo+".json";

        // Guardar en CSV
        try (BufferedWriter guardar = new BufferedWriter(new FileWriter(filePathCSV))) {
            for (int i = 0; i<Parraga_promedio.size();i++) {
                guardar.write("Estudiante #"+(i+1)+", Promedio: " + Parraga_promedio.get(i));
                guardar.newLine();
            }
            System.out.println("Promedios guardados en archivo CSV: "+filePathCSV);
        } catch (IOException e) {
            System.out.println("Error al guardar en CSV: " + e.getMessage());
        }

        // Guardar en JSON
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePathJSON))) {
            writer.write("[\n");
            for (int i = 0; i < Parraga_promedio.size(); i++) {
                writer.write("{\"estudiante\": " + (i + 1) + ", \"promedio\": " + Parraga_promedio.get(i) + "}");
                if (i < Parraga_promedio.size() - 1) {
                    writer.write(",\n");
                }
            }
            writer.write("\n]");
            System.out.println("Promedios guardados en archivo JSON: " + filePathJSON);
        } catch (IOException e) {
            System.out.println("Error al guardar en JSON: " + e.getMessage());
        }
    }
}
    
    

    
  
    