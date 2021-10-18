package operacoes;

import java.math.BigDecimal;

public class OperacoesMatematicasUtil {

	public static final String SOMA = "SOMA";
	public static final String SUBTRACAO = "SUBTRACAO";
	public static final String MULTIPLICACAO = "MULTIPLICACAO";
	public static final String BINARIO = "BINARIO";
	public static final String DECIMAL = "DECIMAL";
	public static final String HEXADECIMAL = "HEXADECIMAL";

	private static BigDecimal valorAtual = null;
	private static String operacao = "";
	public static String tipoNum1 = "";
	public static String tipoNum2 = "";

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
		switch (OperacoesMatematicasUtil.operacao) {

		case OperacoesMatematicasUtil.SOMA: {
			OperacoesMatematicasUtil.somar(numeroDigitado);
			break;
		}
		case OperacoesMatematicasUtil.SUBTRACAO: {
			OperacoesMatematicasUtil.subtracao(numeroDigitado);
			break;
		}
		case OperacoesMatematicasUtil.MULTIPLICACAO: {
			OperacoesMatematicasUtil.multiplicacao(numeroDigitado);
			break;
		}
		default:
			throw new IllegalArgumentException("Operação inválida: " + OperacoesMatematicasUtil.operacao);
		}
	}

	public static BigDecimal getValorAtual() {
		return valorAtual;
	}

	public static void setValorAtual(BigDecimal valorAtual) {
		OperacoesMatematicasUtil.valorAtual = valorAtual;
	}

	public static String getOperacao() {
		return operacao;
	}

	public static void setOperacao(String operacao) {
		OperacoesMatematicasUtil.operacao = operacao;
	}

	private OperacoesMatematicasUtil() {
		throw new IllegalStateException("Classe Utilitária");
	}

}
