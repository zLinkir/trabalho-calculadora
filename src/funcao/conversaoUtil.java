package funcao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class conversaoUtil {
	public static void decimalParaBinarios(int a) {
	    
	    List<Integer> list = new ArrayList<Integer>();
	    while(a > 0) {
	        list.add(a % 2);
	        a = a / 2;
	    }
	    Collections.reverse(list);
	    for (Integer integer : list) {
	        System.out.print(integer);
	    }
	}
	
	public static void binarioParaDecimal(String binario) {
	    int soma = 0;
	    int pow  = 0;
	    for(int i = binario.length() - 1; i >= 0; i--) {
	    soma = (int) (soma + Math.pow(2, pow) * Character.getNumericValue(binario.charAt(i)));
	    pow ++;
	    }
	    
	System.out.println(soma);
	}
	 
}
