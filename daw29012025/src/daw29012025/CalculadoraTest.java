package daw29012025;

public class CalculadoraTest {

	public Integer sumar(Integer valora, Integer valorb) {
		if(valora != null && valora != null ) {
			return valora+valorb;
		}else {
			System.out.println("Valores de entrada no pueden ser cero");
			return 0;
		}
	}
	
	public Integer restar(Integer valora, Integer valorb) {
		if(valora != null && valorb != null ) {
			return valora-valorb;
		}else {
			System.out.println("Valores de entrada no pueden ser cero");
			return 0;
		}
	}
	
	public Integer multiplicar(Integer valora, Integer valorb) {
		if(valora != null && valora != null ) {
			return valora*valorb;
		}else {
			System.out.println("Valores de entrada no pueden ser cero");
			return 0;
		}
	}
	
}
