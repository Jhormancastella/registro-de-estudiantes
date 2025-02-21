package com.viernes;

import java.util.*;

public class registrodeestudiantes {
    public static void main(String[] args) {
        HashSet<String> estudiantes = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
    // peticion de cuantos estudiantes quiere meter
    System.out.println("cuantos estudiantes quieres ingresar");
    int cantidadestudiantes = scanner.nextInt();
    scanner.nextLine();
    // solicitar los nombres a ingresar

    for (int i = 0; i< cantidadestudiantes; i++){
        System.out.println("ingrese los nombre de los estudiantes #"+(i+1)+":");
        String nombre = scanner.nextLine();
        estudiantes.add(nombre);
    }
    //mostar estudiantes
    System.out.println("\n--- lista de estudiantes registrados---");
    for (String estudiante : estudiantes) {
        System.out.println("--" + estudiante +"--");
    }
    // verificar si un  estudiantes especifico esta en la lista
    System.out.println("\n ingrese el nombre de un estudiante para verificar si se encuentra regitrado: ");
    String estudiantebuscado = scanner.nextLine();
    
    if (estudiantes.contains(estudiantebuscado)){
        System.out.println("el estudiante " + estudiantebuscado + "se encuentra registrado.");
    }else{
        System.out.println("el estduiante " + estudiantebuscado + "no se encuentra registrado.");

    }
    scanner.close();
    }

}

