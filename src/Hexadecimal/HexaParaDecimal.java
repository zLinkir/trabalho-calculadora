package Hexadecimal_decimal;

public class HexaParaDecimal 
{	
	public static void main(String[] args) 
	{
		String sNumeroHexaDecimal = "0x001F";
		
		int iSaida = ConverteHexaParaDecimal(sNumeroHexaDecimal);
		
		System.out.println("Saida foi: " + iSaida);
		
		System.out.println("Saida foi: " + ConverteDecimalParaHexa(170));
	}
	
	public static int ConverteHexaParaDecimal(String sNumeroHexa)
	{
		sNumeroHexa.replaceAll("x", "0");
		
		int iBaseCalculo        = 1;
		int iVariavelTemporaria = 0;
		
		for (int lIdx = sNumeroHexa.length() - 1; lIdx >= 0; lIdx--)
		{
			switch (sNumeroHexa.charAt(lIdx))
			{
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
			}
			
			if (lIdx == sNumeroHexa.length() - 1)
				iBaseCalculo += 15;
			else
				iBaseCalculo += 16;
		}
		
		return iVariavelTemporaria;
	};
	
	public static String ConverteDecimalParaHexa(int iEntrada)
	{
		String sTextoSaida = "";
		
		String sHexChars = "0123456789ABCDEF";  
		
		int iVariavelTemporaria = 0;
		
		while (iEntrada > 0)
		{
			iVariavelTemporaria = iEntrada % 16;
			sTextoSaida = sHexChars.charAt(iVariavelTemporaria) + sTextoSaida;
			iEntrada = iEntrada / 16;
		}
		
		return sTextoSaida;
	};
}
