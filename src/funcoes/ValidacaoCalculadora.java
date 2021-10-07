package funcoes;

import java.math.BigDecimal;

import operacoes.OperacoesMatematicas;

public class ValidacaoCalculadora {

	private ValidacaoCalculadora() {
	}

	public static String adicionarPontuacaoMilhar(String textoDigitado) {
		String textoSemZerosIniciais = textoDigitado;
		var textoSemZerosIniciaisFormatado = "";

		if (textoDigitado.startsWith("0")) {
			while (textoSemZerosIniciais.startsWith("0")) {
				textoSemZerosIniciais = textoSemZerosIniciais.replace("0", "");
			}
		}

		textoSemZerosIniciais = textoSemZerosIniciais.replace(".", "");
		while (textoSemZerosIniciais.length() >= 4) {
			textoSemZerosIniciaisFormatado = "."+textoSemZerosIniciais.substring(textoSemZerosIniciais.length()-3,
											 textoSemZerosIniciais.length()) + textoSemZerosIniciaisFormatado;
			textoSemZerosIniciais = textoSemZerosIniciais.substring(0,textoSemZerosIniciais.length()-3);
		}
		
		if(textoSemZerosIniciais.length() > 0) {
			textoSemZerosIniciaisFormatado = textoSemZerosIniciais + textoSemZerosIniciaisFormatado;
		}
		return textoSemZerosIniciaisFormatado; 
	}
	
	public static void verificarAtribuicaoValorAtual(BigDecimal valorAtual) {
		if(OperacoesMatematicas.getValorAtual() == null) {
			OperacoesMatematicas.setValorAtual(valorAtual);
		}
	}
	
}
