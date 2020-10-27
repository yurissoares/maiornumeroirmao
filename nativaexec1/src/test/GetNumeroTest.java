package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import nativaexec1.GetNumero;

public class GetNumeroTest {

	@Test
	public void testDesafio() {
		
		String v = "123";
		String vEsperado = "321";
		String retorno = GetNumero.maiorNumeroIrmao(v);
		
		assertEquals(vEsperado, retorno);
		
		String v2 = "553";
		String vEsperado2 = "553";
		String retorno2 = GetNumero.maiorNumeroIrmao(v2);
		
		assertEquals(vEsperado2, retorno2);
		
	}
}
