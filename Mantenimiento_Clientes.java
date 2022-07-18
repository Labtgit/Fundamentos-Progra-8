package com.mycompany.mantenimiento_clientes;
import java.util.Scanner;
public class Mantenimiento_Clientes {
    int opcion,Cedula,NumeroTelefonico;
    String cliente;
    Scanner leer=new Scanner(System.in);
    public void Nombre_de_cliente(){
        System.out.print("Digite el nombre del cliente : ");
        cliente=leer.next();
    }
    public void Datos_Cliente(){
      System.out.println("A continuacion se requieriran los siguientes datos");
      System.out.println("Cedula");
      System.out.println("Numero de telefono");
      System.out.print("Digite el numero de cedula : ");
      Cedula=leer.nextInt();
      System.out.print("Digite el numero telefonico: ");
      NumeroTelefonico=leer.nextInt();
    }
    public void Mostar_Datos(){
        System.out.println("Nombre del cliente :"+cliente);
        System.out.println("Cedula del cliente :"+Cedula);
        System.out.println("Numero telefonico del cliente: "+NumeroTelefonico);
    }
    public void Modificar_Datos(){
        System.out.println("Estamos trabajando en esa opcion");
    } 
    public void mostarmenu(){
        do{  
            System.out.println("*******************************");
            System.out.println("*            Menu             *");
            System.out.println("*******************************");
            System.out.println("* 1-Introducir Cliente        *");
            System.out.println("* 2-Datos del Cliente         *");
            System.out.println("* 3-Mostar Datos              *");
            System.out.println("* 4-Modificar Datos           *");
            System.out.println("* 5-Salir                     *");
            System.out.println("*******************************");
            System.out.println("Digite la opcion que desea: ");
            opcion= leer.nextInt();
            switch(opcion){
                case 1 -> Nombre_de_cliente();
                case 2 -> Datos_Cliente();
                case 3 -> Mostar_Datos();
                case 4 -> Modificar_Datos();
                case 5 -> {
                }
                default -> {
                }
            }
            System.out.println();
            System.out.println();
            System.out.println();
        }while(opcion !=5);
    }
    public static void main(String[]args){
        Mantenimiento_Clientes menu=new Mantenimiento_Clientes();
        menu.mostarmenu();
    }
}

