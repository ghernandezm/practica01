package examen;

import java.util.Scanner;

public class EXAMEN {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        // creamos los objetos a usar
        Punto A = new Punto(1.0,-8.2);
        Punto B = new Punto(0.2,6.6);
        Punto C = new Punto(-5.4,-2.1);
        Punto D = new Punto(4.3,3.7);
        Punto E = new Punto();
        Punto F = new Punto();
        Punto G = new Punto();
        Punto H = new Punto();
        Punto res = new Punto();
        
        // pedimos los datos de los puntos faltantes
        System.out.println("Ingresa los valores del punto E");
        E.setCx(leer.nextDouble());
        E.setCy(leer.nextDouble());

        System.out.println("Ingresa los valores del punto F");
        F.setCx(leer.nextDouble());
        F.setCy(leer.nextDouble());
        
        System.out.println("Ingresa los valores del punto G");
        G.setCx(leer.nextDouble());
        G.setCy(leer.nextDouble());
        
        System.out.println("Ingresa los valores del punto H");
        H.setCx(leer.nextDouble());
        H.setCy(leer.nextDouble());
        
        // Mostrar todos los puntos creados
        System.out.println("___Puntos usados para el ejercicio___");
        System.out.println("A: " + A.toString());
        System.out.println("B: " + B.toString());
        System.out.println("C: " + C.toString());
        System.out.println("D: " + D.toString());
        System.out.println("E: " + E.toString());
        System.out.println("F: " + F.toString());
        System.out.println("G: " + G.toString());
        System.out.println("H: " + H.toString());
        
        // Calcular pendientes AB, CD, EF, GH, AE, BF, CG, DH
        System.out.println("Pendiente Recta AB: "+ res.Pendiente(A, B));
        System.out.println("Pendiente Recta CD: "+ res.Pendiente(C, D));
        System.out.println("Pendiente Recta EF: "+ res.Pendiente(E, F));
        System.out.println("Pendiente Recta GH: "+ res.Pendiente(G, H));
        System.out.println("Pendiente Recta AE: "+ res.Pendiente(A, E));
        System.out.println("Pendiente Recta BF: "+ res.Pendiente(B, F));
        System.out.println("Pendiente Recta CG: "+ res.Pendiente(C, G));
        System.out.println("Pendiente Recta DH: "+ res.Pendiente(D, H));
        
    }

}
