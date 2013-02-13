/* Rodrigo Valladares Santana L1 
 * Programación de Aplicaciones Interactivas Práctica 3
 * 
 * Clase que compara dos números en punto flotante y devuelve true si son iguales.
 * 
 * */
package casiCero;

public class CasiCero {
	
	double epsilon = 0.000000000000000002;
	
	CasiCero() {}
	
	CasiCero(double epsilon) {
		this.epsilon = epsilon;
	}
	
	public boolean comparar(Double a, Double b) {
		Double max = a > b ? a : b;
		Double diferencia = a - b;
		if(diferencia < 0)
			diferencia = -diferencia;
		if(diferencia <= max * epsilon)
			return true;
		else
			return false;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CasiCero casicero = new CasiCero();
		System.out.println("10.0 y 10.000000000000002 son iguales: " + casicero.comparar(10.0, 10.000000000000002));
		System.out.println("10.0 y 10.000000000000000 son iguales: " + casicero.comparar(10.0, 10.000000000000000));

	}

}
