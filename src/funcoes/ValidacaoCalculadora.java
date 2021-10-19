package funcoes;

import java.math.BigDecimal;

import operacoes.OperacoesMatematicasUtil;

public class ValidacaoCalculadora {

	private ValidacaoCalculadora() {
	}

	public static String adicionarPontuacaoMilhar(String textoDigitado) {
		String textoSemZerosIniciais = textoDigitado;
		var textoAuxiliar = new StringBuilder();

		if (textoDigitado.startsWith("0")) {
			while (textoSemZerosIniciais.startsWith("0")) {
				textoSemZerosIniciais = textoSemZerosIniciais.replace("0", "");
			}
		}

		textoSemZerosIniciais = textoSemZerosIniciais.replace(".", "");

		while (textoSemZerosIniciais.length() >= 4) {
			textoAuxiliar.insert(0, "."+textoSemZerosIniciais.substring(textoSemZerosIniciais.length()-3,textoSemZerosIniciais.length()));
			textoSemZerosIniciais = textoSemZerosIniciais.substring(0,textoSemZerosIniciais.length()-3);
		}
		
		if(textoSemZerosIniciais.length() > 0) {
			textoAuxiliar.insert(0, textoSemZerosIniciais);
		}
		return textoAuxiliar.toString(); 
	}
	
	public static void verificarAtribuicaoValorAtual(BigDecimal valorAtual) {
		if(OperacoesMatematicasUtil.getValorAtual() == null) {
			OperacoesMatematicasUtil.setValorAtual(valorAtual);
		}
	}
	
}
