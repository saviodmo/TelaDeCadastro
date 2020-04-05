package telacadastro;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import teladecadastro.model.Clientes; 

public class TelaCadastro {
	
	

	private JFrame frmTelaDeCadastro;
	private JTextField txtNome;
	private JTextField txtEndereco;
	private JTextField txtNumero;

	private List<Clientes> cliente = new ArrayList<>();
		
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastro window = new TelaCadastro();
					window.frmTelaDeCadastro.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaCadastro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTelaDeCadastro = new JFrame();
		frmTelaDeCadastro.setTitle("Tela de Cadastro");
		frmTelaDeCadastro.setBounds(100, 100, 317, 170);
		frmTelaDeCadastro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTelaDeCadastro.getContentPane().setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNome.setBounds(13, 14, 56, 14);
		frmTelaDeCadastro.getContentPane().add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(79, 11, 205, 20);
		frmTelaDeCadastro.getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblEndereco = new JLabel("Endere\u00E7o");
		lblEndereco.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEndereco.setBounds(-6, 39, 75, 14);
		frmTelaDeCadastro.getContentPane().add(lblEndereco);
		
		txtEndereco = new JTextField();
		txtEndereco.setBounds(79, 36, 205, 20);
		frmTelaDeCadastro.getContentPane().add(txtEndereco);
		txtEndereco.setColumns(10);
		
		JLabel lblNumero = new JLabel("N\u00FAmero");
		lblNumero.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNumero.setBounds(-6, 64, 75, 14);
		frmTelaDeCadastro.getContentPane().add(lblNumero);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(79, 61, 101, 20);
		frmTelaDeCadastro.getContentPane().add(txtNumero);
		txtNumero.setColumns(10);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nome = txtNome.getText();
				String endereco = txtEndereco.getText();
				int numero = Integer.parseInt(txtNumero.getText());
				
				Clientes clientes = new Clientes(nome, endereco, numero);
				
				cliente.add(clientes);
				
				System.out.println("Item Salvo com sucesso!");
				
				System.out.println("Quantidade de clientes cadastrados é de: "+cliente.size());
				
			}
		});
		btnSalvar.setBounds(79, 97, 101, 23);
		frmTelaDeCadastro.getContentPane().add(btnSalvar);
		
		JButton btnVisualizar = new JButton("Visualizar");
		btnVisualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				JTable table = new JTable();
				JOptionPane.showMessageDialog(null, table);
				
			}
		});
		btnVisualizar.setBounds(183, 97, 101, 23);
		frmTelaDeCadastro.getContentPane().add(btnVisualizar);
	}
}
