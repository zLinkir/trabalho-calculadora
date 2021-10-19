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
		setBounds(100, 100, 602, 634);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(38, 38, 38));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		var panel1 = new JPanel();
		panel1.setBackground(new Color(26, 26, 26));
		panel1.setBounds(0, 130, 592, 465);
		contentPane.add(panel1);
		panel1.setLayout(null);

		var btnMultiplicacao = new JButton("X");
		btnMultiplicacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OperacoesMatematicasUtil.setOperacao(OperacoesMatematicasUtil.MULTIPLICACAO);
				String valorSemPonto = tpDigitacao.getText().replace(".", "");
				if(!valorSemPonto.equals("")) {
					ValidacaoCalculadora.verificarAtribuicaoValorAtual(new BigDecimal(valorSemPonto));
				}
				tpDigitacao.setText("");
			}
		});
		
		JLabel lblImgGamakichi = new JLabel("");
		lblImgGamakichi.setIcon(new ImageIcon(CalculadoraConversao.class.getResource("/imagens/gamakichi=.png")));
		lblImgGamakichi.setHorizontalAlignment(SwingConstants.CENTER);
		lblImgGamakichi.setBounds(365, 297, 62, 53);
		panel1.add(lblImgGamakichi);
		
		JLabel lblImgItachi9 = new JLabel("");
		lblImgItachi9.setHorizontalAlignment(SwingConstants.CENTER);
		lblImgItachi9.setIcon(new ImageIcon(CalculadoraConversao.class.getResource("/imagens/itachi9.png")));
		lblImgItachi9.setBounds(293, 258, 57, 87);
		panel1.add(lblImgItachi9);
		
		JLabel lblImgKisame8 = new JLabel("");
		lblImgKisame8.setHorizontalAlignment(SwingConstants.CENTER);
		lblImgKisame8.setIcon(new ImageIcon(CalculadoraConversao.class.getResource("/imagens/kisame8.png")));
		lblImgKisame8.setBounds(194, 258, 57, 87);
		panel1.add(lblImgKisame8);
		
		JLabel lblImgSasori7 = new JLabel("");
		lblImgSasori7.setHorizontalAlignment(SwingConstants.CENTER);
		lblImgSasori7.setIcon(new ImageIcon(CalculadoraConversao.class.getResource("/imagens/sasori7.png")));
		lblImgSasori7.setBounds(45, 258, 54, 87);
		panel1.add(lblImgSasori7);
		
		JLabel lblImgPain6 = new JLabel("");
		lblImgPain6.setHorizontalAlignment(SwingConstants.CENTER);
		lblImgPain6.setIcon(new ImageIcon(CalculadoraConversao.class.getResource("/imagens/pain6.png")));
		lblImgPain6.setBounds(293, 165, 57, 87);
		panel1.add(lblImgPain6);
		
		JLabel lblImgDeidara4 = new JLabel("");
		lblImgDeidara4.setHorizontalAlignment(SwingConstants.CENTER);
		lblImgDeidara4.setIcon(new ImageIcon(CalculadoraConversao.class.getResource("/imagens/deidara4.png")));
		lblImgDeidara4.setBounds(96, 165, 54, 87);
		panel1.add(lblImgDeidara4);
		
		JLabel lblImgKakuzu5 = new JLabel("");
		lblImgKakuzu5.setHorizontalAlignment(SwingConstants.CENTER);
		lblImgKakuzu5.setVerticalAlignment(SwingConstants.CENTER);
		lblImgKakuzu5.setIcon(new ImageIcon(CalculadoraConversao.class.getResource("/imagens/kakuzu5.png")));
		lblImgKakuzu5.setBounds(184, 165, 73, 87);
		panel1.add(lblImgKakuzu5);
		
		JLabel lblImgZetsu2 = new JLabel("");
		lblImgZetsu2.setIcon(new ImageIcon(CalculadoraConversao.class.getResource("/imagens/zetsu2.png")));
		lblImgZetsu2.setBounds(143, 72, 57, 87);
		panel1.add(lblImgZetsu2);
		
		JLabel lblImgKonan3 = new JLabel("");
		lblImgKonan3.setHorizontalAlignment(SwingConstants.CENTER);
		lblImgKonan3.setIcon(new ImageIcon(CalculadoraConversao.class.getResource("/imagens/konan3.png")));
		lblImgKonan3.setBounds(254, 72, 57, 87);
		panel1.add(lblImgKonan3);
		
		JLabel lblImgHidan0 = new JLabel("");
		lblImgHidan0.setHorizontalAlignment(SwingConstants.CENTER);
		lblImgHidan0.setIcon(new ImageIcon(CalculadoraConversao.class.getResource("/imagens/hidan0.png")));
		lblImgHidan0.setBounds(153, 352, 57, 80);
		panel1.add(lblImgHidan0);
		
		JLabel lblImgObito1 = new JLabel("");
		lblImgObito1.setHorizontalAlignment(SwingConstants.CENTER);
		lblImgObito1.setIcon(new ImageIcon(CalculadoraConversao.class.getResource("/imagens/tobi1.png")));
		lblImgObito1.setBounds(35, 67, 66, 85);
		panel1.add(lblImgObito1);
		
		JLabel lblImgSakura = new JLabel("");
		lblImgSakura.setHorizontalAlignment(SwingConstants.CENTER);
		lblImgSakura.setIcon(new ImageIcon(CalculadoraConversao.class.getResource("/imagens/sakura.png")));
		lblImgSakura.setBounds(390, 11, 32, 45);
		panel1.add(lblImgSakura);
		
		JLabel lblImgSasuke = new JLabel("");
		lblImgSasuke.setHorizontalAlignment(SwingConstants.CENTER);
		lblImgSasuke.setIcon(new ImageIcon(CalculadoraConversao.class.getResource("/imagens/sasuke.png")));
		lblImgSasuke.setBounds(57, 11, 32, 45);
		panel1.add(lblImgSasuke);
		btnMultiplicacao.setForeground(Color.WHITE);
		btnMultiplicacao.setBackground(Color.DARK_GRAY);
		btnMultiplicacao.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnMultiplicacao.setBounds(360, 182, 73, 53);
		panel1.add(btnMultiplicacao);

		var btnAdicao = new JButton("+");
		btnAdicao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OperacoesMatematicasUtil.setOperacao(OperacoesMatematicasUtil.SOMA);
				String valorSemPonto = tpDigitacao.getText().replace(".", "");
				if(!valorSemPonto.equals("")) {
					ValidacaoCalculadora.verificarAtribuicaoValorAtual(new BigDecimal(valorSemPonto));
				}
				tpDigitacao.setText("");
			}
		});
		btnAdicao.setForeground(Color.WHITE);
		btnAdicao.setBackground(Color.DARK_GRAY);
		btnAdicao.setFont(new Font("Dialog", Font.PLAIN, 20));
		btnAdicao.setBounds(360, 127, 73, 53);
		panel1.add(btnAdicao);

		var btnSubtracao = new JButton("-");
		btnSubtracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OperacoesMatematicasUtil.setOperacao(OperacoesMatematicasUtil.SUBTRACAO);
				String valorSemPonto = tpDigitacao.getText().replace(".", "");
				if(!valorSemPonto.equals("")) {
					ValidacaoCalculadora.verificarAtribuicaoValorAtual(new BigDecimal(valorSemPonto));
				}
				tpDigitacao.setText("");
			}
		});
		btnSubtracao.setForeground(Color.WHITE);
		btnSubtracao.setBackground(Color.DARK_GRAY);
		btnSubtracao.setFont(new Font("Dialog", Font.PLAIN, 20));
		btnSubtracao.setBounds(360, 72, 73, 53);
		panel1.add(btnSubtracao);

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
			}
		}); 
		btnCalcularResultado.setForeground(Color.WHITE);
		btnCalcularResultado.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnCalcularResultado.setBackground(SystemColor.activeCaption);
		btnCalcularResultado.setBounds(360, 238, 73, 107);
		panel1.add(btnCalcularResultado);

		var btnNum3 = new JButton("3");
		btnNum3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tpDigitacao.setText(tpDigitacao.getText() + "3");
				tpDigitacao.setText(ValidacaoCalculadora.adicionarPontuacaoMilhar(tpDigitacao.getText()));
				
			}
		});
		btnNum3.setForeground(Color.WHITE);
		btnNum3.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnNum3.setBackground(SystemColor.desktop);
		btnNum3.setBounds(256, 72, 94, 87);
		panel1.add(btnNum3);

		var btnNum5 = new JButton("5");
		btnNum5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tpDigitacao.setText(tpDigitacao.getText() + "5");
				tpDigitacao.setText(ValidacaoCalculadora.adicionarPontuacaoMilhar(tpDigitacao.getText()));
			}
		});
		btnNum5.setForeground(Color.WHITE);
		btnNum5.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnNum5.setBackground(SystemColor.desktop);
		btnNum5.setBounds(154, 165, 93, 87);
		panel1.add(btnNum5);

		var btnNum7 = new JButton("7");
		btnNum7.setEnabled(true);
		btnNum7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tpDigitacao.setText(tpDigitacao.getText() + "7");
				tpDigitacao.setText(ValidacaoCalculadora.adicionarPontuacaoMilhar(tpDigitacao.getText()));
			}
		});
		btnNum7.setForeground(Color.WHITE);
		btnNum7.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnNum7.setBackground(SystemColor.desktop);
		btnNum7.setBounds(50, 258, 94, 87);
		panel1.add(btnNum7);
		
		var btnNum9 = new JButton("9");
		btnNum9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tpDigitacao.setText(tpDigitacao.getText() + "9");
				tpDigitacao.setText(ValidacaoCalculadora.adicionarPontuacaoMilhar(tpDigitacao.getText()));
			}
		});
		btnNum9.setForeground(Color.WHITE);
		btnNum9.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnNum9.setBackground(SystemColor.desktop);
		btnNum9.setBounds(256, 258, 94, 87);
		panel1.add(btnNum9);

		var btnNum6 = new JButton("6");
		btnNum6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tpDigitacao.setText(tpDigitacao.getText() + "6");
				tpDigitacao.setText(ValidacaoCalculadora.adicionarPontuacaoMilhar(tpDigitacao.getText()));
			}
		});
		btnNum6.setForeground(Color.WHITE);
		btnNum6.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnNum6.setBackground(SystemColor.desktop);
		btnNum6.setBounds(256, 165, 94, 87);
		panel1.add(btnNum6);

		var btnNum8 = new JButton("8");
		btnNum8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tpDigitacao.setText(tpDigitacao.getText() + "8");
				tpDigitacao.setText(ValidacaoCalculadora.adicionarPontuacaoMilhar(tpDigitacao.getText()));
			}
		});
		btnNum8.setForeground(Color.WHITE);
		btnNum8.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnNum8.setBackground(SystemColor.desktop);
		btnNum8.setBounds(154, 258, 94, 87);
		panel1.add(btnNum8);

		var btnNum4 = new JButton("4");
		btnNum4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tpDigitacao.setText(tpDigitacao.getText() + "4");
				tpDigitacao.setText(ValidacaoCalculadora.adicionarPontuacaoMilhar(tpDigitacao.getText()));
			}
		});
		btnNum4.setForeground(Color.WHITE);
		btnNum4.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnNum4.setBackground(SystemColor.desktop);
		btnNum4.setBounds(50, 165, 94, 87);
		panel1.add(btnNum4);

		var btnNum1 = new JButton("1");
		btnNum1.setIcon(new ImageIcon(CalculadoraConversao.class.getResource("/imagens/tobi1.png")));
		btnNum1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
			}
		});
		btnNum1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tpDigitacao.setText(tpDigitacao.getText() + "1");
				tpDigitacao.setText(ValidacaoCalculadora.adicionarPontuacaoMilhar(tpDigitacao.getText()));
			}
		});
		btnNum1.setForeground(Color.WHITE);
		btnNum1.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnNum1.setBackground(SystemColor.desktop);
		btnNum1.setBounds(50, 72, 94, 87);
		panel1.add(btnNum1);

		var btnNum2 = new JButton("2");
		btnNum2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tpDigitacao.setText(tpDigitacao.getText() + "2");
				tpDigitacao.setText(ValidacaoCalculadora.adicionarPontuacaoMilhar(tpDigitacao.getText()));
			}
		});
		btnNum2.setForeground(Color.WHITE);
		btnNum2.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnNum2.setBackground(SystemColor.desktop);
		btnNum2.setBounds(154, 72, 94, 87);
		panel1.add(btnNum2);

		var rdbEntradaBinario = new JRadioButton("Bin\u00E1ria");
		rdbEntradaBinario.setBounds(449, 146, 109, 23);
		panel1.add(rdbEntradaBinario);
		
		var rdbEntradaDecimal = new JRadioButton("Decimal");
		rdbEntradaDecimal.setBounds(449, 72, 109, 23);
		panel1.add(rdbEntradaDecimal);
		
		var rdbEntradaHexadecimal = new JRadioButton("Hexadecimal");
		rdbEntradaHexadecimal.setBounds(449, 107, 109, 23);
		panel1.add(rdbEntradaHexadecimal);
		
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
		btnNum0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tpDigitacao.setText(tpDigitacao.getText() + "0");
				tpDigitacao.setText(ValidacaoCalculadora.adicionarPontuacaoMilhar(tpDigitacao.getText()));
			}
		});
		btnNum0.setForeground(Color.WHITE);
		btnNum0.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnNum0.setBackground(Color.BLACK);
		btnNum0.setBounds(154, 352, 94, 87);
		panel1.add(btnNum0);

		var btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tpDigitacao.setText("");
			}
		});
		btnLimpar.setForeground(Color.WHITE);
		btnLimpar.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnLimpar.setBackground(Color.BLACK);
		btnLimpar.setBounds(50, 11, 383, 45);
		panel1.add(btnLimpar);
		

		var lblImgNarutinho = new JLabel("");
		lblImgNarutinho.setHorizontalAlignment(SwingConstants.CENTER);
		lblImgNarutinho.setHorizontalTextPosition(SwingConstants.CENTER);
		lblImgNarutinho.setIcon(new ImageIcon(CalculadoraConversao.class.getResource("/imagens/narutinho.png")));
		lblImgNarutinho.setBounds(474, 182, 57, 53);
		panel1.add(lblImgNarutinho);

		var lblNarutinho = new JLabel("");
		lblNarutinho.setHorizontalAlignment(SwingConstants.CENTER);
		lblNarutinho.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNarutinho.setIcon(new ImageIcon(CalculadoraConversao.class.getResource("/imagens/narutinho.png")));
		lblNarutinho.setBounds(474, 182, 57, 53);
		panel1.add(lblNarutinho);
		
		var rdbSaidaDecimal = new JRadioButton("Decimal");
		rdbSaidaDecimal.setBounds(449, 248, 109, 23);
		panel1.add(rdbSaidaDecimal);
		
		var rdbSaidaHexadecimal = new JRadioButton("Hexadecimal");
		rdbSaidaHexadecimal.setBounds(449, 283, 109, 23);
		panel1.add(rdbSaidaHexadecimal);
		
		var rdbSaidaBinario = new JRadioButton("Bin\u00E1ria");
		rdbSaidaBinario.setBounds(449, 322, 109, 23);
		panel1.add(rdbSaidaBinario);
		
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
		pVisor.setBounds(10, 56, 566, 63);
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
		tpDigitacao.setBounds(0, 0, 566, 62);
		pVisor.add(tpDigitacao);
		
		var btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				var menu = new Menu();
				menu.setVisible(true);
				setVisible(false);
			}
		});
		btnVoltar.setForeground(Color.WHITE);
		btnVoltar.setFont(new Font("Dialog", Font.PLAIN, 12));
		btnVoltar.setBackground(Color.BLACK);
		btnVoltar.setBounds(10, 11, 94, 23);
		contentPane.add(btnVoltar);
	}
}
