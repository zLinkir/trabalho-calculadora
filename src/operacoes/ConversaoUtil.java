package operacoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConversaoUtil {
	
	private ConversaoUtil(){
	}
	
	public static List<Integer> converterDecimalParaBinarios(int decimal) {
		List<Integer> list = new ArrayList<>();
		while (decimal > 0) {
			list.add(decimal % 2);
			decimal = decimal / 2;
		}
		Collections.reverse(list);
		return list;
	}

	public static int converterBinarioParaDecimal(String binario) {
		var soma = 0;
		var contador = 0;
		for (int i = binario.length() - 1; i >= 0; i--) {
			soma = (int) (soma + Math.pow(2, contador) * Character.getNumericValue(binario.charAt(i)));
			contador++;
		}
		return soma;
	}

}
