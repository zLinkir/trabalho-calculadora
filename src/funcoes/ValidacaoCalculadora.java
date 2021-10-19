package funcoes;

import java.math.BigDecimal;

import operacoes.OperacoesMatematicasUtil;

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
		var textoAuxiliar = new StringBuilder();
		textoAuxiliar.append(textoSemZerosIniciaisFormatado);
		
		while (textoSemZerosIniciais.length() >= 4) {
			textoAuxiliar.insert(0, "."+textoSemZerosIniciais.substring(textoSemZerosIniciais.length()-3,textoSemZerosIniciais.length()) +
								textoAuxiliar.toString());
			textoSemZerosIniciais = textoSemZerosIniciais.substring(0,textoSemZerosIniciais.length()-3);
		}
		
		if(textoSemZerosIniciais.length() > 0) {
			textoSemZerosIniciaisFormatado = textoSemZerosIniciais + textoSemZerosIniciaisFormatado;
		}
		return textoSemZerosIniciaisFormatado; 
	}
	
	public static void verificarAtribuicaoValorAtual(BigDecimal valorAtual) {
		if(OperacoesMatematicasUtil.getValorAtual() == null) {
			OperacoesMatematicasUtil.setValorAtual(valorAtual);
		}
	}
	
}
