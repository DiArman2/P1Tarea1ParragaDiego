#ifndef DESARROLLO_H_INCLUDED
#define DESARROLLO_H_INCLUDED
#include <iostream>
#include <fstream>

using namespace std;

int num;
float nota1, nota2, nota3;
float Promedios[5];
void promedio(float nota1, float nota2, float nota3,int estudiante);
void guardarPromedio();

void ingresoNotas (){
cout<<"Bienvenido al sistema de nota"<<endl;
cout<<"Ingrese cuantos estudiantes desea ingresar (1-3)"<<endl;
cin>>num;
while(num<1 || num>3){
cout<<"Error. Solo entre 1 - 3: ";
cin>>num;
}
for(int i=0; i<num; i++){
cout<<"-------------------------------------------------"<<endl;
cout<<"Ingrese las notas del estudiante #"<<i+1<<": "<<endl;
cout<<"Ingrese la nota 1: ";
cin>>nota1;
while(nota1<0 || nota1>20){
cout<<"Error. Las notas son entre 0 - 20: ";
cin>>nota1;
}
cout<<"Ingrese la nota 2: ";
cin>>nota2;
while(nota2<0 || nota2>20){
cout<<"Error. Las notas son entre 0 - 20: ";
cin>>nota2;
}
cout<<"Ingrese la nota 3: ";
cin>>nota3;
while(nota3<0 || nota3>20){
cout<<"Error. Las notas son entre 0 - 20: ";
cin>>nota3;
}
 promedio(nota1, nota2, nota3, i);

}
cout<<endl;
 guardarPromedio();

}

void promedio (float nota1, float nota2, float nota3, int i){
float prome;
prome=(nota1+ nota2+ nota3)/3;
Promedios[i]=prome;

if(prome>14){
 cout<<"El estudiante #"<<i + 1<<" aprobo la materia con la nota de: "<<prome<<endl;
}else{
    cout<<"El estudiante #"<<i + 1<<" no aprobo la materia con la nota de: "<<prome<<endl;
}
}


void guardarPromedio(){
string nombre;
cout<<"Dale un nombre al archivo de los Promedios"<<endl;
cin.ignore();
getline(cin,nombre);

ofstream archivo (nombre.c_str(),ios::out);
if (archivo.is_open()){
    for(int i=0; i<num; i++){
    archivo<<"Promedio del estudiante #"<<i+1<<": "<<Promedios[i]<<endl;
        }
archivo.close();
cout<<"El archivo fue guardado correctamente"<<endl;
}else{
    cout<<"El archivo no fue guardado correctamente"<<endl;
}
}

void leerPromedio(){
string nombre,linea;
cout<<"Ingresa el nombre de tu archivo"<<endl;
cin.ignore();
getline(cin,nombre);

ifstream archivo (nombre);
if (archivo.is_open()){
while(getline(archivo, linea)){
    cout<<linea<<endl;
}
archivo.close();
cout<<"El archivo fue leido correctamente"<<endl;
}else{
    cout<<"El archivo no fue encontrado"<<endl;
}
}


#endif // DESARROLLO_H_INCLUDED
