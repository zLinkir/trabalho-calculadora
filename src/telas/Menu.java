package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Menu extends JFrame {

	private static final long serialVersionUID = 8585683151277643617L;
	
	private JPanel panelPlanoFundo;
	private JButton btnCalculadoraConversao;

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
		setBounds(100, 100, 450, 300);
		panelPlanoFundo = new JPanel();
		panelPlanoFundo.setBackground(new Color(26, 26, 26));
		panelPlanoFundo.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panelPlanoFundo);
		panelPlanoFundo.setLayout(null);
		
		btnCalculadoraConversao = new JButton("Convers\u00E3o");
		btnCalculadoraConversao.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnCalculadoraConversao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				var calculadoraConversao = new CalculadoraConversao();
				calculadoraConversao.setVisible(true);
				setVisible(false);
			}
		});
		btnCalculadoraConversao.setBackground(Color.GREEN);
		btnCalculadoraConversao.setBounds(73, 111, 138, 23);
		panelPlanoFundo.add(btnCalculadoraConversao);
		
		var btnCalculadoraTabelaVerdade = new JButton("Tabela Verdade");
		btnCalculadoraTabelaVerdade.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnCalculadoraTabelaVerdade.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				var calculadoraTabelaVerdade = new CalculadoraTabelaVerdade();
				calculadoraTabelaVerdade.setVisible(true);
				setVisible(false);
			}
		});
		btnCalculadoraTabelaVerdade.setBackground(Color.GREEN);
		btnCalculadoraTabelaVerdade.setBounds(221, 111, 138, 23);
		panelPlanoFundo.add(btnCalculadoraTabelaVerdade);
	}
	
}
