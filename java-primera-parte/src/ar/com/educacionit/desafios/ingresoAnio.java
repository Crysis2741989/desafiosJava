package ar.com.educacionit.desafios;

import java.util.Scanner;

public class ingresoAnio {
	
	public int anio(){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese año");
		int aaaa = teclado.nextInt();
		if (aaaa <= 2099 && aaaa>=1900){
			return aaaa;
		}else {
			return 0;
		}	
		
	}
	
	public int mes() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese mes");
		int mm = teclado.nextInt();
		if(mm >= 1 && mm <=12) {
			return mm;
		}else {
			return 0;
		}
		
	}
	
	public int dia() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese dia");
		int dd = teclado.nextInt();
		if (dd >= 1 && dd <= 31) {
			return dd;
		}else {
			return 0;
		}
		
	}
	
	
	
	
	void bisiesto(int aaaa, int mm, int dd) {
		
		int[] mesMax = {1,3,5,7,8,10,12};
		int[] mesMed = {4,6,9,11};
		
		if(dd == 0 || mm == 0 || aaaa ==0 ) {
			System.out.println("Fecha incorrecta");
		}
		
		
		else if((aaaa%4==0 && aaaa%100!=0)|| (aaaa%400==0)) {
			if(dd ==29 && mm == 2) {
				System.out.println("Fecha correcta y año bisiesto");
				return;
				}
		
			}else if(dd == 31){
					for(int i=0; i <= mesMax.length;i++) {
						if(mm == mesMax[i]) {
							System.out.println("fecha incorrecta");
							return;
						}else {
							System.out.println("fecha incorrecta");
							return;
						}
					}
			}else if(dd == 30) {
					for(int i=0; i<=mesMed.length;i++) {
						if(mm == mesMed[i]) {
							System.out.println("fecha correcta");
							return;
						}else {
							System.out.println("fecha Incorecta");
							return;
						}
					}
				}else {
					System.out.println("fecha correcta");
					return;
	}
	}
	
}