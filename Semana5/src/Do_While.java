/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author T-202
 */
public class Do_While {
    public static void main(String[] args) {
        Scanner Entrar = new Scanner(System.in);
        int opcion= 1;
        do{//Mientras que la condicion sea igual a 1, reiniciara el menu
            System.out.println("Bienvenido");
            System.out.println("Que operacion desea realizar: 1.Continuar,2.Salir");
            opcion=Entrar.nextInt();
        }while(opcion==1);
        
        }
    }

