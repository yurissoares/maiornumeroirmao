package nativaexec1;

public class VerificaNumero {

	public static Boolean ehValido(String valor) {
		Integer v = Integer.parseInt(valor);
		
		if(v == null || v < 0 || v > 100000000 ) {
			return Boolean.FALSE;
		}
		
		return Boolean.TRUE;
	}
}
