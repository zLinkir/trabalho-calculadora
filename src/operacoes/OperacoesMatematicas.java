package operacoes;

import java.math.BigDecimal;

public class OperacoesMatematicas {
	
	public static final String SOMA = "SOMA";
	public static final String SUBTRACAO = "SUBTRACAO";
	public static final String MULTIPLICACAO = "MULTIPLICACAO";
	
	private static BigDecimal valorAtual = null;  
	private static String operacao = "";
	
	private static void somar(BigDecimal numeroDigitado) {
		valorAtual = valorAtual.add(numeroDigitado);
	}
	
	private static void subtracao(BigDecimal numeroDigitado) {
		valorAtual = valorAtual.subtract(numeroDigitado);
	}

	private static void multiplicacao(BigDecimal numeroDigitado) {
		valorAtual = valorAtual.multiply(numeroDigitado);
	}

	public static void calcular(BigDecimal numeroDigitado) {
		switch (OperacoesMatematicas.operacao) {
		
		case OperacoesMatematicas.SOMA: {
			OperacoesMatematicas.somar(numeroDigitado);
			break;
		}
		case OperacoesMatematicas.SUBTRACAO: {
			OperacoesMatematicas.subtracao(numeroDigitado);
			break;
		}
		case OperacoesMatematicas.MULTIPLICACAO: {
			OperacoesMatematicas.multiplicacao(numeroDigitado);
			break;
		}
		default:
			throw new IllegalArgumentException("Operação inválida: " + OperacoesMatematicas.operacao);
		}
	}

	public static BigDecimal getValorAtual() {
		return valorAtual;
	}

	public static void setValorAtual(BigDecimal valorAtual) {
		OperacoesMatematicas.valorAtual = valorAtual;
	}

	public static String getOperacao() {
		return operacao;
	}

	public static void setOperacao(String operacao) {
		OperacoesMatematicas.operacao = operacao;
	}
	
}
