package com.company;

import java.util.Scanner;

public class Main {
    public static double validador(int opcion){
        double validado = 0;
        Scanner sc = new Scanner(System.in);
        switch (opcion){
            case  0:{
                while(!sc.hasNextInt()){
                    System.out.print("¡Por favor introduce un número entero! ");
                    sc.next();
                }
                validado = sc.nextDouble();
            }
            break;
            case 1:{
                while(!sc.hasNextDouble()){
                    System.out.print("¡Por favor introduce un número decimal! ");
                    sc.next();
                }
                validado = sc.nextDouble();
            }
            break;
        }
        return  validado;
    }
    public static boolean validarRadio(double radio){
        boolean validado = false;
        while (radio < 0){
            System.out.print("El valor del radio debe ser positivo.Introduce otro valor: ");
            radio = validador(1);
            validado = true;
        }
        return validado;
    }
    public static double calcularArea(double radio){
        return Math.PI * Math.pow(radio, 2);
    }
    public static void main(String[] args) {
	    double radio,area;
        Scanner sc = new Scanner(System.in);
        System.out.println("¡Hola!,vamos a calcular el área de una circunferencia.");
        System.out.print("Introduce el radio: ");
        radio = validador(1);
        if (validarRadio(radio)){
            sc.close();
            area = calcularArea(radio);
            System.out.printf("El área de la circunferencia es: %f\n", area);
        }
    }
}
