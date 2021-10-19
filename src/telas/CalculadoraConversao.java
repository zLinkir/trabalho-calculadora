package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

import funcoes.ValidacaoCalculadora;
import operacoes.OperacoesMatematicasUtil;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import java.awt.ComponentOrientation;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.awt.Toolkit;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CalculadoraConversao extends JFrame {

	private static final long serialVersionUID = 8585683151277643617L;

	private JPanel contentPane;
	private JTextPane tpDigitacao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					var frame = new CalculadoraConversao();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalculadoraConversao() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(CalculadoraConversao.class.getResource("/imagens/akatsuki.png")));
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setBounds(100, 100, 715, 634);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(38, 38, 38));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		var planoFundo = new JPanel();
		planoFundo.setBackground(new Color(26, 26, 26));
		planoFundo.setBounds(0, 130, 710, 465);
		contentPane.add(planoFundo);
		planoFundo.setLayout(null);
		
		var rdbEntradaBinario = new JRadioButton("Bin\u00E1ria");
		rdbEntradaBinario.setBounds(578, 147, 109, 23);
		planoFundo.add(rdbEntradaBinario);
		
		var rdbEntradaDecimal = new JRadioButton("Decimal");
		rdbEntradaDecimal.setBounds(578, 73, 109, 23);
		planoFundo.add(rdbEntradaDecimal);
		
		var rdbEntradaHexadecimal = new JRadioButton("Hexadecimal");
		rdbEntradaHexadecimal.setBounds(578, 108, 109, 23);
		planoFundo.add(rdbEntradaHexadecimal);
		
		var rdbSaidaDecimal = new JRadioButton("Decimal");
		rdbSaidaDecimal.setBounds(578, 249, 109, 23);
		planoFundo.add(rdbSaidaDecimal);
		
		var rdbSaidaHexadecimal = new JRadioButton("Hexadecimal");
		rdbSaidaHexadecimal.setBounds(578, 284, 109, 23);
		planoFundo.add(rdbSaidaHexadecimal);
		
		var rdbSaidaBinario = new JRadioButton("Bin\u00E1ria");
		rdbSaidaBinario.setBounds(578, 323, 109, 23);
		planoFundo.add(rdbSaidaBinario);
		
		var btnMultiplicacao = new JButton("X");
		btnMultiplicacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OperacoesMatematicasUtil.setOperacao(OperacoesMatematicasUtil.MULTIPLICACAO);
				String valorSemPonto = tpDigitacao.getText().replace(".", "");
				if(!valorSemPonto.equals("")) {
					ValidacaoCalculadora.verificarAtribuicaoValorAtual(new BigDecimal(valorSemPonto));
					verificarSelecaoTipoDado(rdbEntradaDecimal, rdbEntradaHexadecimal, true);
				}
				tpDigitacao.setText("");
				planoFundo.requestFocusInWindow();
			}
		});
		btnMultiplicacao.setForeground(Color.WHITE);
		btnMultiplicacao.setBackground(Color.DARK_GRAY);
		btnMultiplicacao.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnMultiplicacao.setBounds(493, 183, 73, 53);
		planoFundo.add(btnMultiplicacao);

		var btnAdicao = new JButton("+");
		btnAdicao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OperacoesMatematicasUtil.setOperacao(OperacoesMatematicasUtil.SOMA);
				String valorSemPonto = tpDigitacao.getText().replace(".", "");
				if(!valorSemPonto.equals("")) {
					ValidacaoCalculadora.verificarAtribuicaoValorAtual(new BigDecimal(valorSemPonto));
					verificarSelecaoTipoDado(rdbEntradaDecimal, rdbEntradaHexadecimal, true);

				}
				tpDigitacao.setText("");
				planoFundo.requestFocusInWindow();
			}
		});
		btnAdicao.setForeground(Color.WHITE);
		btnAdicao.setBackground(Color.DARK_GRAY);
		btnAdicao.setFont(new Font("Dialog", Font.PLAIN, 20));
		btnAdicao.setBounds(493, 128, 73, 53);
		planoFundo.add(btnAdicao);

		var btnSubtracao = new JButton("-");
		btnSubtracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OperacoesMatematicasUtil.setOperacao(OperacoesMatematicasUtil.SUBTRACAO);
				String valorSemPonto = tpDigitacao.getText().replace(".", "");
				if(!valorSemPonto.equals("")) {
					ValidacaoCalculadora.verificarAtribuicaoValorAtual(new BigDecimal(valorSemPonto));
					verificarSelecaoTipoDado(rdbEntradaDecimal, rdbEntradaHexadecimal, true);

				}
				tpDigitacao.setText("");
				planoFundo.requestFocusInWindow();
			}
		});
		btnSubtracao.setForeground(Color.WHITE);
		btnSubtracao.setBackground(Color.DARK_GRAY);
		btnSubtracao.setFont(new Font("Dialog", Font.PLAIN, 20));
		btnSubtracao.setBounds(493, 73, 73, 53);
		planoFundo.add(btnSubtracao);

		var btnCalcularResultado = new JButton("=");
		btnCalcularResultado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(OperacoesMatematicasUtil.getOperacao() != null && OperacoesMatematicasUtil.getValorAtual() != null) {
					String valorSemPonto = tpDigitacao.getText().replace(".", "");
					OperacoesMatematicasUtil.calcular(new BigDecimal(valorSemPonto));
					tpDigitacao.setText(String.valueOf(OperacoesMatematicasUtil.getValorAtual()));
					OperacoesMatematicasUtil.setOperacao("");
					OperacoesMatematicasUtil.setValorAtual(null);
				}
				planoFundo.requestFocusInWindow();
			}
		}); 
		btnCalcularResultado.setForeground(Color.WHITE);
		btnCalcularResultado.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnCalcularResultado.setBackground(SystemColor.activeCaption);
		btnCalcularResultado.setBounds(493, 239, 73, 107);
		planoFundo.add(btnCalcularResultado);

		var btnNum3 = new JButton("3");
		btnNum3.setHorizontalAlignment(SwingConstants.LEFT);
		btnNum3.setIcon(new ImageIcon(CalculadoraConversao.class.getResource("/imagens/konan3.png")));
		btnNum3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tpDigitacao.setText(tpDigitacao.getText() + "3");
				tpDigitacao.setText(ValidacaoCalculadora.adicionarPontuacaoMilhar(tpDigitacao.getText()));
				planoFundo.requestFocusInWindow();
			}
		});
		btnNum3.setForeground(Color.WHITE);
		btnNum3.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnNum3.setBackground(SystemColor.desktop);
		btnNum3.setBounds(330, 73, 157, 87);
		planoFundo.add(btnNum3);

		var btnNum5 = new JButton("5");
		btnNum5.setHorizontalAlignment(SwingConstants.LEFT);
		btnNum5.setIcon(new ImageIcon(CalculadoraConversao.class.getResource("/imagens/kakuzu5.png")));
		btnNum5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tpDigitacao.setText(tpDigitacao.getText() + "5");
				tpDigitacao.setText(ValidacaoCalculadora.adicionarPontuacaoMilhar(tpDigitacao.getText()));
				planoFundo.requestFocusInWindow();
			}
		});
		btnNum5.setForeground(Color.WHITE);
		btnNum5.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnNum5.setBackground(SystemColor.desktop);
		btnNum5.setBounds(170, 166, 150, 87);
		planoFundo.add(btnNum5);

		var btnNum7 = new JButton("7");
		btnNum7.setHorizontalAlignment(SwingConstants.LEFT);
		btnNum7.setIcon(new ImageIcon(CalculadoraConversao.class.getResource("/imagens/sasori7.png")));
		btnNum7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tpDigitacao.setText(tpDigitacao.getText() + "7");
				tpDigitacao.setText(ValidacaoCalculadora.adicionarPontuacaoMilhar(tpDigitacao.getText()));
				planoFundo.requestFocusInWindow();
			}
		});
		btnNum7.setForeground(Color.WHITE);
		btnNum7.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnNum7.setBackground(SystemColor.desktop);
		btnNum7.setBounds(10, 259, 150, 87);
		planoFundo.add(btnNum7);

		var btnNum9 = new JButton("9");
		btnNum9.setHorizontalAlignment(SwingConstants.LEFT);
		btnNum9.setIcon(new ImageIcon(CalculadoraConversao.class.getResource("/imagens/itachi9.png")));
		btnNum9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tpDigitacao.setText(tpDigitacao.getText() + "9");
				tpDigitacao.setText(ValidacaoCalculadora.adicionarPontuacaoMilhar(tpDigitacao.getText()));
				planoFundo.requestFocusInWindow();
			}
		});
		btnNum9.setForeground(Color.WHITE);
		btnNum9.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnNum9.setBackground(SystemColor.desktop);
		btnNum9.setBounds(330, 259, 157, 87);
		planoFundo.add(btnNum9);

		var btnNum6 = new JButton("6");
		btnNum6.setIcon(new ImageIcon(CalculadoraConversao.class.getResource("/imagens/pain6.png")));
		btnNum6.setHorizontalAlignment(SwingConstants.LEFT);
		btnNum6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tpDigitacao.setText(tpDigitacao.getText() + "6");
				tpDigitacao.setText(ValidacaoCalculadora.adicionarPontuacaoMilhar(tpDigitacao.getText()));
				planoFundo.requestFocusInWindow();
			}
		});
		btnNum6.setForeground(Color.WHITE);
		btnNum6.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnNum6.setBackground(SystemColor.desktop);
		btnNum6.setBounds(330, 166, 157, 87);
		planoFundo.add(btnNum6);

		var btnNum8 = new JButton("8");
		btnNum8.setIcon(new ImageIcon(CalculadoraConversao.class.getResource("/imagens/kisame8.png")));
		btnNum8.setHorizontalAlignment(SwingConstants.LEFT);
		btnNum8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tpDigitacao.setText(tpDigitacao.getText() + "8");
				tpDigitacao.setText(ValidacaoCalculadora.adicionarPontuacaoMilhar(tpDigitacao.getText()));
				planoFundo.requestFocusInWindow();
			}
		});
		btnNum8.setForeground(Color.WHITE);
		btnNum8.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnNum8.setBackground(SystemColor.desktop);
		btnNum8.setBounds(170, 259, 150, 87);
		planoFundo.add(btnNum8);

		var btnNum4 = new JButton("4");
		btnNum4.setHorizontalAlignment(SwingConstants.LEFT);
		btnNum4.setIcon(new ImageIcon(CalculadoraConversao.class.getResource("/imagens/deidara4.png")));
		btnNum4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tpDigitacao.setText(tpDigitacao.getText() + "4");
				tpDigitacao.setText(ValidacaoCalculadora.adicionarPontuacaoMilhar(tpDigitacao.getText()));
				planoFundo.requestFocusInWindow();
			}
		});
		btnNum4.setForeground(Color.WHITE);
		btnNum4.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnNum4.setBackground(SystemColor.desktop);
		btnNum4.setBounds(10, 166, 150, 87);
		planoFundo.add(btnNum4);

		var btnNum1 = new JButton("1");
		btnNum1.setHorizontalAlignment(SwingConstants.LEFT);
		btnNum1.setIcon(new ImageIcon(CalculadoraConversao.class.getResource("/imagens/tobi1.png")));
		btnNum1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNum1.setIcon(new ImageIcon(CalculadoraConversao.class.getResource("/imagens/fotoBranco.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNum1.setIcon(new ImageIcon(CalculadoraConversao.class.getResource("/imagens/tobi1.png")));
			}
		});
		btnNum1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tpDigitacao.setText(tpDigitacao.getText() + "1");
				tpDigitacao.setText(ValidacaoCalculadora.adicionarPontuacaoMilhar(tpDigitacao.getText()));
				planoFundo.requestFocusInWindow(); 
			}
		});
		btnNum1.setForeground(Color.WHITE);
		btnNum1.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnNum1.setBackground(SystemColor.desktop);
		btnNum1.setBounds(10, 73, 150, 87);
		planoFundo.add(btnNum1);

		var btnNum2 = new JButton("2");
		btnNum2.setHorizontalAlignment(SwingConstants.LEFT);
		btnNum2.setIcon(new ImageIcon(CalculadoraConversao.class.getResource("/imagens/zetsu2.png")));
		btnNum2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tpDigitacao.setText(tpDigitacao.getText() + "2");
				tpDigitacao.setText(ValidacaoCalculadora.adicionarPontuacaoMilhar(tpDigitacao.getText()));
				planoFundo.requestFocusInWindow();
			}
		});
		btnNum2.setForeground(Color.WHITE);
		btnNum2.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnNum2.setBackground(SystemColor.desktop);
		btnNum2.setBounds(170, 73, 150, 87);
		planoFundo.add(btnNum2);
		
		rdbEntradaDecimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbEntradaDecimal.setSelected(true);
				rdbEntradaBinario.setSelected(false);
				rdbEntradaHexadecimal.setSelected(false);
			}
		});
		
		rdbEntradaHexadecimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbEntradaDecimal.setSelected(false);
				rdbEntradaBinario.setSelected(false);
				rdbEntradaHexadecimal.setSelected(true);
			}
		});
		
		rdbEntradaBinario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbEntradaDecimal.setSelected(false);
				rdbEntradaBinario.setSelected(true);
				rdbEntradaHexadecimal.setSelected(false);
			}
		});

		var btnNum0 = new JButton("0");
		btnNum0.setHorizontalAlignment(SwingConstants.LEFT);
		btnNum0.setIcon(new ImageIcon(CalculadoraConversao.class.getResource("/imagens/hidan0.png")));
		btnNum0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tpDigitacao.setText(tpDigitacao.getText() + "0");
				tpDigitacao.setText(ValidacaoCalculadora.adicionarPontuacaoMilhar(tpDigitacao.getText()));
				planoFundo.requestFocusInWindow();
			}
		});
		btnNum0.setForeground(Color.WHITE);
		btnNum0.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnNum0.setBackground(Color.BLACK);
		btnNum0.setBounds(170, 353, 150, 87);
		planoFundo.add(btnNum0);

		var btnLimpar = new JButton("Limpar");
		btnLimpar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				btnLimpar.setIcon(new ImageIcon(CalculadoraConversao.class.getResource("/imagens/sasuke.png")));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnLimpar.setIcon(new ImageIcon(CalculadoraConversao.class.getResource("/imagens/sakura.png")));
			}
		});
		btnLimpar.setSelectedIcon(new ImageIcon(CalculadoraConversao.class.getResource("/imagens/sakura.png")));
		btnLimpar.setHorizontalAlignment(SwingConstants.LEFT);
		btnLimpar.setIcon(new ImageIcon(CalculadoraConversao.class.getResource("/imagens/sasuke.png")));
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tpDigitacao.setText("");
				planoFundo.requestFocusInWindow();
			}
		});
		btnLimpar.setForeground(Color.WHITE);
		btnLimpar.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnLimpar.setBackground(Color.BLACK);
		btnLimpar.setBounds(10, 11, 477, 53);
		planoFundo.add(btnLimpar);
		
		var lblNarutinho = new JLabel("");
		lblNarutinho.setHorizontalAlignment(SwingConstants.CENTER);
		lblNarutinho.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNarutinho.setIcon(new ImageIcon(CalculadoraConversao.class.getResource("/imagens/narutinho.png")));
		lblNarutinho.setBounds(603, 183, 57, 53);
		planoFundo.add(lblNarutinho);
		
		
		rdbSaidaDecimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbSaidaDecimal.setSelected(true);
				rdbSaidaBinario.setSelected(false);
				rdbSaidaHexadecimal.setSelected(false);
			}
		});
		
		rdbSaidaHexadecimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbSaidaDecimal.setSelected(false);
				rdbSaidaBinario.setSelected(false);
				rdbSaidaHexadecimal.setSelected(true);
			}
		});
		
		rdbSaidaBinario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbSaidaDecimal.setSelected(false);
				rdbSaidaBinario.setSelected(true);
				rdbSaidaHexadecimal.setSelected(false);
			}
		});

		var pVisor = new JPanel();
		pVisor.setBackground(new Color(38, 38, 38));
		pVisor.setBounds(10, 56, 679, 63);
		contentPane.add(pVisor);
		pVisor.setLayout(null);
		tpDigitacao = new JTextPane();
		tpDigitacao.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				tpDigitacao.setText(ValidacaoCalculadora.adicionarPontuacaoMilhar(tpDigitacao.getText()));
			}
		});
		tpDigitacao.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		tpDigitacao.setForeground(UIManager.getColor("ScrollBar.thumbHighlight"));
		tpDigitacao.setFont(new Font("Tahoma", Font.PLAIN, 40));
		tpDigitacao.setBackground(UIManager.getColor("ScrollBar.trackHighlightForeground"));
		tpDigitacao.setBounds(0, 0, 679, 62);
		pVisor.add(tpDigitacao);
		
		var btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				var menu = new Menu();
				menu.setVisible(true);
				setVisible(false);
				planoFundo.requestFocusInWindow();
			}
		});
		btnVoltar.setForeground(Color.WHITE);
		btnVoltar.setFont(new Font("Dialog", Font.PLAIN, 12));
		btnVoltar.setBackground(Color.BLACK);
		btnVoltar.setBounds(10, 11, 94, 23);
		contentPane.add(btnVoltar);
	}
	public void verificarSelecaoTipoDado(JRadioButton rdbDecimal, JRadioButton rdbHexadecimal,
			Boolean numeroTipo) {
		String tipoDado = "";
		if (rdbDecimal.isSelected()) {
			tipoDado = OperacoesMatematicasUtil.DECIMAL;
		} else if (rdbHexadecimal.isSelected()) {
			tipoDado = OperacoesMatematicasUtil.HEXADECIMAL;
		} else {
			tipoDado= OperacoesMatematicasUtil.BINARIO;
		}
		if (numeroTipo) {
			OperacoesMatematicasUtil.tipoNum1 = tipoDado;
		}else {
			OperacoesMatematicasUtil.tipoNum2 = tipoDado;
		}
	}
	public void realizarValidacaoDeConversao() {
		if(OperacoesMatematicasUtil.tipoNum1.equals(OperacoesMatematicasUtil.tipoNum2)) {
			switch(OperacoesMatematicasUtil.tipoNum1) {
			case OperacoesMatematicasUtil.DECIMAL:{
				
			}
			case OperacoesMatematicasUtil.HEXADECIMAL:{
				
			}
			case OperacoesMatematicasUtil.BINARIO:{
				
			}
			}
		}
	}
}
