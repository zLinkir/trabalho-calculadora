package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

import funcoes.ValidacaoCalculadora;

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

public class Menu extends JFrame {

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
					var frame = new Menu();
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
	public Menu() {
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
		
		var btnDivisao = new JButton("%");
		btnDivisao.setForeground(Color.WHITE);
		btnDivisao.setBackground(Color.DARK_GRAY);
		btnDivisao.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnDivisao.setBounds(349, 182, 73, 53);
		panel1.add(btnDivisao);
		
		var btnMultiplicacao = new JButton("x");
		btnMultiplicacao.setForeground(Color.WHITE);
		btnMultiplicacao.setBackground(Color.DARK_GRAY);
		btnMultiplicacao.setFont(new Font("Dialog", Font.PLAIN, 20));
		btnMultiplicacao.setBounds(349, 237, 73, 53);
		panel1.add(btnMultiplicacao);
		
		var btnAdicao = new JButton("+");
		btnAdicao.setForeground(Color.WHITE);
		btnAdicao.setBackground(Color.DARK_GRAY);
		btnAdicao.setFont(new Font("Dialog", Font.PLAIN, 20));
		btnAdicao.setBounds(349, 127, 73, 53);
		panel1.add(btnAdicao);
		
		var btnSubtracao = new JButton("-");
		btnSubtracao.setForeground(Color.WHITE);
		btnSubtracao.setBackground(Color.DARK_GRAY);
		btnSubtracao.setFont(new Font("Dialog", Font.PLAIN, 20));
		btnSubtracao.setBounds(349, 72, 73, 53);
		panel1.add(btnSubtracao);
		
		JButton btnCalcularResultado = new JButton("=");
		btnCalcularResultado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tpDigitacao.getText();
			}
		});
		btnCalcularResultado.setForeground(Color.WHITE);
		btnCalcularResultado.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnCalcularResultado.setBackground(SystemColor.activeCaption);
		btnCalcularResultado.setBounds(349, 292, 73, 53);
		panel1.add(btnCalcularResultado);
		
		JButton btnNum3 = new JButton("3");
		btnNum3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tpDigitacao.setText(tpDigitacao.getText()+"3");
				tpDigitacao.setText(ValidacaoCalculadora.adicionarPontuacaoMilhar(tpDigitacao.getText()));
			}
		});
		btnNum3.setForeground(Color.WHITE);
		btnNum3.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnNum3.setBackground(SystemColor.desktop);
		btnNum3.setBounds(245, 72, 94, 87);
		panel1.add(btnNum3);
		
		JButton btnNum5 = new JButton("5");
		btnNum5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tpDigitacao.setText(tpDigitacao.getText()+"5");
				tpDigitacao.setText(ValidacaoCalculadora.adicionarPontuacaoMilhar(tpDigitacao.getText()));
			}
		});
		btnNum5.setForeground(Color.WHITE);
		btnNum5.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnNum5.setBackground(SystemColor.desktop);
		btnNum5.setBounds(143, 165, 93, 87);
		panel1.add(btnNum5);
		
		JButton btnNum7 = new JButton("7");
		btnNum7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tpDigitacao.setText(tpDigitacao.getText()+"7");
				tpDigitacao.setText(ValidacaoCalculadora.adicionarPontuacaoMilhar(tpDigitacao.getText()));
			}
		});
		btnNum7.setForeground(Color.WHITE);
		btnNum7.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnNum7.setBackground(SystemColor.desktop);
		btnNum7.setBounds(39, 258, 94, 87);
		panel1.add(btnNum7);
		
		JButton btnNum9 = new JButton("9");
		btnNum9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tpDigitacao.setText(tpDigitacao.getText()+"9");
				tpDigitacao.setText(ValidacaoCalculadora.adicionarPontuacaoMilhar(tpDigitacao.getText()));
			}
		});
		btnNum9.setForeground(Color.WHITE);
		btnNum9.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnNum9.setBackground(SystemColor.desktop);
		btnNum9.setBounds(245, 258, 94, 87);
		panel1.add(btnNum9);
		
		JButton btnNum6 = new JButton("6");
		btnNum6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tpDigitacao.setText(tpDigitacao.getText()+"6");
				tpDigitacao.setText(ValidacaoCalculadora.adicionarPontuacaoMilhar(tpDigitacao.getText()));
			}
		});
		btnNum6.setForeground(Color.WHITE);
		btnNum6.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnNum6.setBackground(SystemColor.desktop);
		btnNum6.setBounds(245, 165, 94, 87);
		panel1.add(btnNum6);
		
		JButton btnNum8 = new JButton("8");
		btnNum8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tpDigitacao.setText(tpDigitacao.getText()+"8");
				tpDigitacao.setText(ValidacaoCalculadora.adicionarPontuacaoMilhar(tpDigitacao.getText()));
			}
		});
		btnNum8.setForeground(Color.WHITE);
		btnNum8.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnNum8.setBackground(SystemColor.desktop);
		btnNum8.setBounds(143, 258, 94, 87);
		panel1.add(btnNum8);
		
		JButton btnNum4 = new JButton("4");
		btnNum4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tpDigitacao.setText(tpDigitacao.getText()+"4");
				tpDigitacao.setText(ValidacaoCalculadora.adicionarPontuacaoMilhar(tpDigitacao.getText()));
			}
		});
		btnNum4.setForeground(Color.WHITE);
		btnNum4.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnNum4.setBackground(SystemColor.desktop);
		btnNum4.setBounds(39, 165, 94, 87);
		panel1.add(btnNum4);
		
		JButton btnNum1 = new JButton("1");
		btnNum1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tpDigitacao.setText(tpDigitacao.getText()+"1");
				tpDigitacao.setText(ValidacaoCalculadora.adicionarPontuacaoMilhar(tpDigitacao.getText()));
			}
		});
		btnNum1.setForeground(Color.WHITE);
		btnNum1.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnNum1.setBackground(SystemColor.desktop);
		btnNum1.setBounds(39, 72, 94, 87);
		panel1.add(btnNum1);
		
		JButton btnNum2 = new JButton("2");
		btnNum2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tpDigitacao.setText(tpDigitacao.getText()+"2");
				tpDigitacao.setText(ValidacaoCalculadora.adicionarPontuacaoMilhar(tpDigitacao.getText()));
			}
		});
		btnNum2.setForeground(Color.WHITE);
		btnNum2.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnNum2.setBackground(SystemColor.desktop);
		btnNum2.setBounds(143, 72, 94, 87);
		panel1.add(btnNum2);
		
		JRadioButton rdbEntradaDecimal = new JRadioButton("Decimal");
		rdbEntradaDecimal.setBounds(438, 72, 109, 23);
		panel1.add(rdbEntradaDecimal);
		
		JRadioButton rdbEntradaHexadecimal = new JRadioButton("Hexadecimal");
		rdbEntradaHexadecimal.setBounds(438, 107, 109, 23);
		panel1.add(rdbEntradaHexadecimal);
		
		JLabel lblImagemPergunta = new JLabel("");
		lblImagemPergunta.setBounds(361, 195, 46, 14);
		panel1.add(lblImagemPergunta);
		lblImagemPergunta.setIcon(new ImageIcon("C:\\Users\\us\\Downloads\\ico_pergunta.png"));
		
		JButton btnNum0 = new JButton("0");
		btnNum0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tpDigitacao.setText(tpDigitacao.getText()+"0");
				tpDigitacao.setText(ValidacaoCalculadora.adicionarPontuacaoMilhar(tpDigitacao.getText()));
			}
		});
		btnNum0.setForeground(Color.WHITE);
		btnNum0.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnNum0.setBackground(Color.BLACK);
		btnNum0.setBounds(143, 352, 94, 87);
		panel1.add(btnNum0);
		
		JPanel pVisor = new JPanel();
		pVisor.setBackground(new Color(38, 38, 38));
		pVisor.setBounds(10, 56, 566, 63);
		contentPane.add(pVisor);
		pVisor.setLayout(null);
		
		tpDigitacao = new JTextPane();
		tpDigitacao.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		tpDigitacao.setForeground(UIManager.getColor("ScrollBar.thumbHighlight"));
		tpDigitacao.setFont(new Font("Tahoma", Font.PLAIN, 40));
		tpDigitacao.setBackground(UIManager.getColor("ScrollBar.trackHighlightForeground"));
		tpDigitacao.setBounds(0, 0, 566, 62);
		pVisor.add(tpDigitacao);
	}
}
