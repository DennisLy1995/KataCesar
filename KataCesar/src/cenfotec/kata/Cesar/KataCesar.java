package cenfotec.kata.Cesar;

public class KataCesar {

	public static String process(int cantidad, String palabra) {

		String resultadoKata = "";

		if (cantidad < 0 || cantidad > 25) {

			return "El numero no esta dentro del rango.";

		} else {

			for (int i = 0; i < palabra.length(); i++) {

				resultadoKata = resultadoKata + KataCesar.findLetter(palabra.charAt(i) + "", cantidad);

			}

			return resultadoKata;

		}

	}

	public static String findLetter(String letra, int cantidad) {

		String[] alfabeto = new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",

				"N", "Ñ", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };

		int contador = 0;

		String retorno = "";

		String breaker = "";

		while (breaker.equals("")) {

			if (alfabeto[contador].equals(letra)) {

				breaker = "" + contador;

			}

			if (breaker.equals("")) {

				contador++;

			}

		}

		if (breaker.equals("")) {

			// Do nothing

		} else {

			int posicionLetra = contador + cantidad;

			if (posicionLetra >= 27) {

				posicionLetra = posicionLetra - 27;

				retorno = alfabeto[posicionLetra];

			} else {

				retorno = alfabeto[posicionLetra];

			}

		}

		return retorno;

	}

}