package com.company;

import java.util.Scanner;

public class Main {
    public static double validarRadio(Scanner sc){
        double radioValidado;
        while (!sc.hasNextDouble()){
            System.out.print("¡Introduce un valor numérico para el radio! ");
            sc.next();
        }
        radioValidado = sc.nextDouble();
        return radioValidado;
    }
    public static double calcularArea(double radio){
        return Math.PI * Math.pow(radio, 2);
    }
    public static void main(String[] args) {
	    double radio,area;
        Scanner sc = new Scanner(System.in);
        System.out.println("¡Hola!,vamos a calcular el área de una circunferencia.");
        System.out.print("Introduce el radio: ");
        radio = validarRadio(sc);
        while (radio < 0){
            System.out.print("El valor del radio debe ser positivo.Introduce otro valor: ");
            radio = validarRadio(sc);
        }
        sc.close();
        area = calcularArea(radio);
        System.out.printf("El área de la circunferencia es: %f\n", area);
    }
}
