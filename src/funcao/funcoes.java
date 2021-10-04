package funcao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class funcoes {
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
	

	 
}
