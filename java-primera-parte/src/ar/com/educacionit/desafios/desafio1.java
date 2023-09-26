package ar.com.educacionit.desafios;

public class desafio1 {
	public static void main(String[] args) {
		
		ingresoAnio fecha = new ingresoAnio();
		
		int dia = fecha.dia();
		int mes = fecha.mes();
		int año = fecha.anio();
		
		fecha.bisiesto(año, mes, dia);
		
	}
}
