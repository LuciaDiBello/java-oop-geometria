package org.lessons.java.geometria;

//Definizione della classe Rettangolo
//La classe è composta da due campi interi, un costruttore, due metodi per il calcolo 
//dell'area e del perimetro della figura geometrica e un metodo per disegnare il rettangolo in console
public class Rettangolo {
	  //Campi interi
	  int base;
	  int altezza;
	  //Costruttore con due parametri
	  //Non restituisce alcun valore di ritorno e prende lo stesso nome della classe
	  //Permette di inizializzare i campi dell'oggetto
	  public Rettangolo(int b, int h) {
		   base=b;
		   altezza=h;
	  }
	  //Metodi 
	  //Il metodo calcolaArea prende in input i valori della base e dell'altezza del rettangolo e restituisce l'area della figura
	  int calcolaArea() {
		  int area = base*altezza;
		  return area;
	  }
	//Il metodo calcolaPerimetro prende in input i valori della base e dell'altezza del rettangolo e restituisce il perimetro della figura	  
	  int calcolaPerimetro() {
		  int perimetro = 2*(base + altezza);
		  return perimetro;
	  }
	 //BONUS
	 //Metodo disegna
	 //Il metodo disegna permette di visualizzare in console il rettangolo 
	  void disegna() {
		  //indici: contatori del for annidati
		  int i, j;
		  //n = numero di righe da stampare in console, (corrisponde all'altezza del rettangolo)
		  //m = numero di colonne da stampare in console, (corrisponde alla base del rettangolo)
		  int n = altezza;
		  int m = base;
		    // for annidati
		    for (i = 0; i<n; i++)  //for esterno: scorre il rettangolo lungo la direzione verticale
		    { for(j = 0; j<m; j++) //for interno: scorre il rettangolo lungo la direzione orizzontale
		            if(i==0 || i==(n-1)) //bordi orizzontali del rettangolo
		            	System.out.print("0");
		            else if(j==0 || j==(m-1))  //bordi verticali del rettangolo
		                	System.out.print("0");
		                 else System.out.print(" ");
		       System.out.println(" ");
		    }
		   
	  }
}
