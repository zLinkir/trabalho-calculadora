package funcao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConversaoUtil {
	public static void converterDecimalParaBinarios(int decimal) {

		List<Integer> list = new ArrayList<Integer>();
		while (decimal > 0) {
			list.add(decimal % 2);
			decimal = decimal / 2;
		}
		Collections.reverse(list);
		for (Integer binario : list) {
			System.out.print(binario);
		}
	}

	public static void converterBinarioParaDecimal(String binario) {
		int soma = 0;
		int contador = 0;
		for (int i = binario.length() - 1; i >= 0; i--) {
			soma = (int) (soma + Math.pow(2, contador) * Character.getNumericValue(binario.charAt(i)));
			contador++;
		}

		System.out.println(soma);
	}

}
