#ifndef MENU_H_INCLUDED
#define MENU_H_INCLUDED
#include <iostream>
#include "Desarrollo.h"
using namespace std;

void menu (){
    int op;
cout<<"|------------------------|"<<endl;
cout<<"|1.-Ingreso de notas     |"<<endl;
cout<<"|2.-Ver promedios        |"<<endl;
cout<<"|3.-Salir                |"<<endl;
cout<<"|Ingrese una opcion      |"<<endl;
cin>>op;

switch(op){
case 1:
        ingresoNotas();
        menu();
    break;
case 2:
    leerPromedio();
    menu();
    break;
case 3:
    cout<<"Saliendo del programa...."<<endl;
    break;

    default: cout<<"Error en ingreso"<<endl;

}
}


#endif // MENU_H_INCLUDED
