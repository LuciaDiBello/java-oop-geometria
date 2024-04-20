package org.lessons.java.geometria;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
        	//Acquisisce da tastiera la base e l'altezza del rettangolo
		System.out.println("Inserire la base del rettangolo");
		int b = input.nextInt();
		System.out.println("La base del rettangolo è " + b);
				
		System.out.println("Inserire l'altezza del rettangolo");
		int h = input.nextInt();
		System.out.println("L'altezza del rettangolo è " + h);
		
	//Invoca il costruttore
	//Si inizializza l'oggetto r con i valori acquisiti da tastiera
        Rettangolo r = new Rettangolo(b,h);
       
        //Si invocano i metodi per calcolare l'area e il perimetro del rettangolo
        int a = r.calcolaArea();
        System.out.println("L'area del rettangolo è " + a);
        int p = r.calcolaPerimetro();
        System.out.println("Il perimetro del rettangolo è " + p);
        //Si invoca il metodo disegna per visualizzare il rettangolo in console
        r.disegna();
	}
}
