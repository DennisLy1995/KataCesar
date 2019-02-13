package test.cenfotec.kata.Cesar;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import cenfotec.kata.Cesar.KataCesar;

public class TestKataCesar {

	@Test

	public void test() {

		int numero1 = 0;

		int numero2 = 25;

		int numero3 = 10;

		String palabra = "CESAR";

		String result1 = KataCesar.process(numero1, palabra);

		String result2 = KataCesar.process(numero2, palabra);

		String result3 = KataCesar.process(numero3, palabra);

		assertEquals("CESAR", result1, "The result should be : CESAR");

		assertEquals("ACQYP", result2, "The result should be : ACQYP");
		
		assertEquals("MÑCKB", result3, "The result should be : MÑCKB");

	}

}