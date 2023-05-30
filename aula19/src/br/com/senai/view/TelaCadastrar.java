package br.com.senai.view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import br.com.senai.dao.ProdutoDAO;
import br.com.senai.entity.Produto;

public class TelaCadastrar extends JInternalFrame {
	private JTextField txtNome;
	private JTextField txtDesc;
	private JTextField txtPreco;
	private JTextField txtQtde;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastrar frame = new TelaCadastrar();
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
	public TelaCadastrar() {
		setClosable(true);
		setBounds(100, 100, 476, 372);
		getContentPane().setLayout(null);

		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(10, 11, 440, 320);
		getContentPane().add(desktopPane);

		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Produto produto = new Produto(null, txtNome.getText(), txtDesc.getText(),
						Double.parseDouble(txtPreco.getText()), Integer.parseInt(txtQtde.getText()));

				ProdutoDAO dao = new ProdutoDAO();

				dao.inserir(produto);

				JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso.", "Cadastro", 1);

				txtNome.setText(null);
				txtDesc.setText(null);
				txtPreco.setText(null);
				txtQtde.setText(null);

				txtNome.requestFocus();

				mostrarDados();
			}

			private void mostrarDados() {

				DefaultTableModel model = new DefaultTableModel();
				try {

					ProdutoDAO produtodao = new ProdutoDAO();
					for (Produto p : produtodao.listar()) {

						model.addRow(new Object[] { p.getCodigo(), p.getNome(), p.getDescricao(), p.getPreco(),
								p.getQuantidadeEstoque() });
					}
					table.setModel(model);
					table.setAutoResizeMode(0);
					table.setVisible(isVisible());
				} catch (Exception e) {

				}
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 16));
		btnNewButton.setBounds(170, 171, 97, 32);
		desktopPane.add(btnNewButton);

		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 11, 72, 32);
		desktopPane.add(lblNewLabel);

		txtNome = new JTextField();
		txtNome.setBounds(55, 18, 146, 20);
		desktopPane.add(txtNome);
		txtNome.setColumns(10);

		JLabel lblDescrio = new JLabel("Desc:");
		lblDescrio.setFont(new Font("Arial", Font.PLAIN, 14));
		lblDescrio.setBounds(10, 49, 72, 32);
		desktopPane.add(lblDescrio);

		JLabel lblPreo = new JLabel("Preço:");
		lblPreo.setFont(new Font("Arial", Font.PLAIN, 14));
		lblPreo.setBounds(10, 92, 72, 32);
		desktopPane.add(lblPreo);

		txtDesc = new JTextField();
		txtDesc.setColumns(10);
		txtDesc.setBounds(55, 56, 146, 20);
		desktopPane.add(txtDesc);

		txtPreco = new JTextField();
		txtPreco.setColumns(10);
		txtPreco.setBounds(55, 99, 78, 20);
		desktopPane.add(txtPreco);

		JLabel lblQtde = new JLabel("Qtde:");
		lblQtde.setFont(new Font("Arial", Font.PLAIN, 14));
		lblQtde.setBounds(10, 135, 72, 32);
		desktopPane.add(lblQtde);

		txtQtde = new JTextField();
		txtQtde.setColumns(10);
		txtQtde.setBounds(55, 142, 78, 20);
		desktopPane.add(txtQtde);

		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "C\u00F3digo", "Nome", "Descri\u00E7\u00E3o", "Pre\u00E7o", "Qtde Estoque" }) {
			Class[] columnTypes = new Class[] { Integer.class, String.class, String.class, Double.class,
					Integer.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.setBounds(10, 214, 420, 95);
		desktopPane.add(table);

	}
}
