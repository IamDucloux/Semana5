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
public class Pares {
    public static void main(String[] args) {
        Scanner Teclado= new Scanner(System.in);
        System.out.println("Ingrese un numero par");
        int Entrada = Teclado.nextInt();
        do{
        System.out.println("Su numero es par");
        }while((Entrada/2%)==0);
        
        
        
        
    }
}
