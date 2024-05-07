package com.example;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class CalculadoraColores {
    private static final Map<String, Integer> colorMap = new HashMap<>();
    
     static{
        colorMap.put("negro", 0);
        colorMap.put("cafe", 1);
        colorMap.put("rojo", 2);
        colorMap.put("naranja", 3);
        colorMap.put("amarillo", 4);
        colorMap.put("verde", 5);
        colorMap.put("azul", 6);
        colorMap.put("violeta", 7);
        colorMap.put("gris", 8);
        colorMap.put("blanco", 9);

        Map<String, Double> toleranceMap = new HashMap<>();

        toleranceMap.put("marrón", 1.0);
        toleranceMap.put("rojo", 2.0);
        toleranceMap.put("verde", 0.5);
        toleranceMap.put("azul", 0.25);
        toleranceMap.put("violeta", 0.1);
        toleranceMap.put("gris", 0.05);
        toleranceMap.put("dorado", 5.0);
        toleranceMap.put("plateado", 10.0);}
        
       
        
    


public class Main {
    private static Map<String, Integer> toleranciaMap;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de código de colores para resistencias eléctricas de 4 bandas");

        System.out.println("Ingresa el color de la primera banda:");
        String color1 = scanner.nextLine().toLowerCase();

        System.out.println("Ingresa el color de la segunda banda:");
        String color2 = scanner.nextLine().toLowerCase();

        System.out.println("Ingresa el color de la tercera banda o multiplicador:");
        String color3 = scanner.nextLine().toLowerCase();

        System.out.println("Ingresa el color de la tolerancia:");
        String color4 = scanner.nextLine().toLowerCase();

        int valor1 = colorMap.get(color1);
        int valor2 = colorMap.get(color2);
        int multiplicador = (int) Math.pow(10, colorMap.get(color3));
        double tolerancia = toleranciaMap.get(color4);

        int resistencia = (valor1 * 10 + valor2 ) * multiplicador;
        

        System.out.println("El valor de la resistencia es: " + resistencia + " Ohms, con una tolerancia de " + tolerancia + "%.");
    }
} public static void Tolerancia(String[] args) {

}
    }
