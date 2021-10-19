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
	
	public static int converteHexaParaDecimal(String sNumeroHexa) throws Exception{
		sNumeroHexa = sNumeroHexa.replace("x", "0");
		
		var iBaseCalculo = 1;
		var iVariavelTemporaria = 0;
		
		for (int lIdx = sNumeroHexa.length() - 1; lIdx >= 0; lIdx--){
			
			switch (sNumeroHexa.charAt(lIdx)){
				case '0': iVariavelTemporaria += 0  * iBaseCalculo; break;
				case '1': iVariavelTemporaria += 1  * iBaseCalculo; break;
				case '2': iVariavelTemporaria += 2  * iBaseCalculo; break;
				case '3': iVariavelTemporaria += 3  * iBaseCalculo; break;
				case '4': iVariavelTemporaria += 4  * iBaseCalculo; break;
				case '5': iVariavelTemporaria += 5  * iBaseCalculo; break;
				case '6': iVariavelTemporaria += 6  * iBaseCalculo; break;
				case '7': iVariavelTemporaria += 7  * iBaseCalculo; break;
				case '8': iVariavelTemporaria += 8  * iBaseCalculo; break;
				case '9': iVariavelTemporaria += 9  * iBaseCalculo; break;
				case 'A': iVariavelTemporaria += 10 * iBaseCalculo; break;
				case 'B': iVariavelTemporaria += 11 * iBaseCalculo; break;
				case 'C': iVariavelTemporaria += 12 * iBaseCalculo; break;
				case 'D': iVariavelTemporaria += 13 * iBaseCalculo; break;
				case 'E': iVariavelTemporaria += 14 * iBaseCalculo; break;
				case 'F': iVariavelTemporaria += 15 * iBaseCalculo; break;
				default: iVariavelTemporaria = 0;
			}
			
			if (lIdx == sNumeroHexa.length() - 1)
				iBaseCalculo += 15;
			else
				iBaseCalculo += 16;
		}
		
		return iVariavelTemporaria;
	}
	
	public static String converteDecimalParaHexa(int iEntrada){
		var sTextoSaida = new StringBuilder();
		var sHexChars = "0123456789ABCDEF";  
		
		var iVariavelTemporaria = 0;
		
		while (iEntrada > 0){
			iVariavelTemporaria = iEntrada % 16;
			sTextoSaida.append(sHexChars.charAt(iVariavelTemporaria) + sTextoSaida.toString());
			iEntrada = iEntrada / 16;
		}
		return sTextoSaida.toString();
	}

}
