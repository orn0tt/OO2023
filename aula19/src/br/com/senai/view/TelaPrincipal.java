package br.com.senai.view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
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
	public TelaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 721, 513);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		final JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(10, 11, 685, 452);
		contentPane.add(desktopPane);

		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCadastrar tc = new TelaCadastrar();
				desktopPane.add(tc);
				tc.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 16));
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Rooli\\Downloads\\add_FILL0_wght400_GRAD0_opsz48.png"));
		btnNewButton.setBounds(33, 74, 271, 82);
		desktopPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Consultas");
		btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 16));
		btnNewButton_1
				.setIcon(new ImageIcon("C:\\Users\\Rooli\\Downloads\\query_stats_FILL0_wght400_GRAD0_opsz48.png"));
		btnNewButton_1.setBounds(33, 269, 271, 82);
		desktopPane.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Relatórios");
		btnNewButton_2.setFont(new Font("Arial", Font.PLAIN, 16));
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\Rooli\\Downloads\\print_FILL0_wght400_GRAD0_opsz48.png"));
		btnNewButton_2.setBounds(362, 74, 285, 83);
		desktopPane.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("Sair");
		btnNewButton_3.setFont(new Font("Arial", Font.PLAIN, 16));
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\Rooli\\Downloads\\logout_FILL0_wght400_GRAD0_opsz48.png"));
		btnNewButton_3.setBounds(362, 269, 285, 82);
		desktopPane.add(btnNewButton_3);
	}
}
