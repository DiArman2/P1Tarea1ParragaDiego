
package com.espe.tarea1parragadiego;


public abstract class ClasePersona {
    //Atributos de la clase padre
    protected String Parraga_estudiante;
    protected float Parraga_nota1, Parraga_nota2, Parraga_nota3;

    public ClasePersona(String Parraga_estudiante, float Parraga_nota1, float Parraga_nota2, float Parraga_nota3) {
        this.Parraga_estudiante = Parraga_estudiante;
        this.Parraga_nota1 = Parraga_nota1;
        this.Parraga_nota2 = Parraga_nota2;
        this.Parraga_nota3 = Parraga_nota3;
    }

    //Get y set de la clase
    public String getParraga_estudiante() {
        return Parraga_estudiante;
    }

    public void setParraga_estudiante(String Parraga_estudiante) {
        this.Parraga_estudiante = Parraga_estudiante;
    }

    public float getParraga_nota1() {
        return Parraga_nota1;
    }

    public void setParraga_nota1(float Parraga_nota1) {
        this.Parraga_nota1 = Parraga_nota1;
    }

    public float getParraga_nota2() {
        return Parraga_nota2;
    }

    public void setParraga_nota2(float Parraga_nota2) {
        this.Parraga_nota2 = Parraga_nota2;
    }

    public float getParraga_nota3() {
        return Parraga_nota3;
    }

    public void setParraga_nota3(float Parraga_nota3) {
        this.Parraga_nota3 = Parraga_nota3;
    }

   
    //Metodos, (accion)
    public abstract void ingresarNotas();
    
   
}
