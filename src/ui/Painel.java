package ui;

import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

import lib.Gerencia;
import lib.Item;
import lib.Livro;
import lib.Usuario;

public class Painel extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;
	private static Gerencia gerenciador;
	private static Item itemCarregado;
	

	private javax.swing.JPanel Cadastra_itens;
	private javax.swing.JPanel Cadastro;
	private javax.swing.JButton EditarInformacoesUsuario;
	private javax.swing.JButton HistoricoLivro;
	private javax.swing.JButton HistoricoUsuario;
	private javax.swing.JPanel ItensDoUsuario;
	private javax.swing.JButton ItensUsuario;
	private javax.swing.JScrollPane ItensUsuarioScrollPainel;
	private javax.swing.JLabel Itens_usuario;
	private javax.swing.JPanel Logado;
	private javax.swing.JPanel Login;
	private javax.swing.JButton Mudar_senha;
	private static javax.swing.JPanel Painel;
	private javax.swing.JPanel Pesquisa;
	private javax.swing.JScrollPane PesquisaScrollPainel;
	private javax.swing.JLabel Rank_Titulo;
	private javax.swing.JButton RankingButton;
	private javax.swing.JButton SalvarInformacoesUsuario;
	private javax.swing.JLabel Titulo_Pesquisar;
	private javax.swing.JLabel Usuarios_Titulo;
	private javax.swing.JPanel Visualiza_Rank;
	private javax.swing.JPanel Visualizar_Itens_Sistema;
	private javax.swing.JPanel Visualizar_Perfil;
	private javax.swing.JPanel Visualizar_Perfil_Livro;
	private javax.swing.JButton jButtonBotaoLogar;
	private javax.swing.JButton jButtonCadastrar;
	private javax.swing.JButton jButtonCadastrar_item;
	private javax.swing.JButton jButtonCadastrar_itens;
	private javax.swing.JButton jButtonDisponivel;
	private javax.swing.JButton jButtonExcluir_Conta;
	private javax.swing.JButton jButtonFavoritarItem;
	private javax.swing.JButton jButtonFinalizar_Cadastro;
	private javax.swing.JButton jButtonPegarEmprestado;
	private javax.swing.JButton jButtonPesquisar;
	private javax.swing.JButton jButtonSair;
	private javax.swing.JButton jButtonUsuarios_Sistema;
	private javax.swing.JButton jButtonVisualizar_itens;
	private javax.swing.JButton jButtonVisualizar_perfil1;
	private javax.swing.JButton jButtonVoltar;
	private javax.swing.JButton jButtonVoltar2;
	private javax.swing.JButton jButtonVoltar3;
	private javax.swing.JButton jButtonVoltar4;
	private javax.swing.JButton jButtonVoltar5;
	private javax.swing.JButton jButtonVoltar6;
	private javax.swing.JButton jButtonVoltar7;
	private javax.swing.JButton jButtonVoltar8;
	private javax.swing.JButton jButtonVoltar9;
	@SuppressWarnings("rawtypes")
	private javax.swing.JComboBox jComboBox1;
	private javax.swing.JLabel jLabelBem_vindo;
	private javax.swing.JLabel jLabelCadastra_itens_Autor;
	private javax.swing.JLabel jLabelCadastra_itens_Editora;
	private javax.swing.JLabel jLabelCadastra_itens_Genero;
	private javax.swing.JLabel jLabelCadastra_itens_NomeItem;
	private javax.swing.JLabel jLabelCadastra_itens_Titulo;
	private javax.swing.JLabel jLabelCadastra_itens_Versao2;
	private javax.swing.JLabel jLabelCadastroTitulo;
	private javax.swing.JLabel jLabelCadastro_Endereco;
	private javax.swing.JLabel jLabelCadastro_Senha;
	private javax.swing.JLabel jLabelConfirmaEmail;
	private javax.swing.JLabel jLabelConfirmaSenha;
	private javax.swing.JLabel jLabelEmail;
	private javax.swing.JLabel jLabelFoto_Item;
	private javax.swing.JLabel jLabelFoto_Item_Perfil;
	private javax.swing.JLabel jLabelFoto_User;
	private javax.swing.JLabel jLabelFoto_User1;
	private javax.swing.JLabel jLabelImagem_Tela;
	private javax.swing.JLabel jLabelImagem_Tela1;
	private javax.swing.JLabel jLabelImagem_Tela10;
	private javax.swing.JLabel jLabelImagem_Tela11;
	private javax.swing.JLabel jLabelImagem_Tela12;
	private javax.swing.JLabel jLabelImagem_Tela13;
	private javax.swing.JLabel jLabelImagem_Tela2;
	private javax.swing.JLabel jLabelImagem_Tela3;
	private javax.swing.JLabel jLabelImagem_Tela5;
	private javax.swing.JLabel jLabelImagem_Tela6;
	private javax.swing.JLabel jLabelImagem_Tela7;
	private javax.swing.JLabel jLabelLivro_Autor;
	private javax.swing.JLabel jLabelLivro_Editora;
	private javax.swing.JLabel jLabelLivro_Genero;
	private javax.swing.JLabel jLabelLivro_Titulo;
	private javax.swing.JLabel jLabelLivro_Versao;
	private javax.swing.JLabel jLabelLogin;
	private javax.swing.JLabel jLabelNaoCadastrado;
	private javax.swing.JLabel jLabelNome;
	private javax.swing.JLabel jLabelSenha;
	private javax.swing.JLabel jLabelTitulo_Perfil;
	private javax.swing.JLabel jLabelUser_Email;
	private javax.swing.JLabel jLabelUser_Name;
	private javax.swing.JLabel jLabelUser_Name3;
	private javax.swing.JLabel jLabelVisualizarLivro_Titulo;
	private javax.swing.JLabel jLabelVisualizar_Itens_Sistema_Titulo;
	@SuppressWarnings("rawtypes")
	private javax.swing.JList jListTOPItens;
	@SuppressWarnings("rawtypes")
	private javax.swing.JList jListTOPUsuarios;
	private javax.swing.JPasswordField jPasswordFieldCadastro_ConfirmaSenha;
	private javax.swing.JPasswordField jPasswordFieldCadastro_Senha;
	private javax.swing.JPasswordField jPasswordFieldSenha;
	private javax.swing.JScrollPane jScrollPanePainelDeItensNoSistema;
	private javax.swing.JScrollPane jScrollPanePainelDeItensNoSistema1;
	private javax.swing.JTextField jTextFieldCadastro_ConfirmaEmail;
	private javax.swing.JTextField jTextFieldCadastro_Email;
	private javax.swing.JTextField jTextFieldCadastro_Endereco;
	private javax.swing.JTextField jTextFieldLogin;
	private javax.swing.JTextField jTextFieldNome;
	private static javax.swing.JTextField jTextFieldPerfil_Email;
	private static javax.swing.JTextField jTextFieldPerfil_Endereco;
	private static javax.swing.JTextField jTextFieldPerfil_Nome;
	private javax.swing.JTextField jTextFieldPesquisar;
	private javax.swing.JTextField jTextField_Cadastra_Editora;
	private javax.swing.JTextField jTextField_Cadastra_Genero;
	private javax.swing.JTextField jTextField_Cadastra_NomeAutor;
	private javax.swing.JTextField jTextField_Cadastra_NomeItem;
	private javax.swing.JTextField jTextField_Cadastra_Versao1;
	private static javax.swing.JTextField jTextField_Livro_Autor;
	private static javax.swing.JTextField jTextField_Livro_Editora;
	private static javax.swing.JTextField jTextField_Livro_Genero;
	private static javax.swing.JTextField jTextField_Livro_Versao;
	private static javax.swing.JTextField jTextField_Media_Item;
	private static javax.swing.JTextField jTextField_Titulo_Livro;
	private javax.swing.JPanel usuarios_sistema;

	public Painel() throws Exception {
		initComponents();
		gerenciador = new Gerencia();
		gerenciador.deserializar();
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void initComponents() {

		Painel = new javax.swing.JPanel();
		Login = new javax.swing.JPanel();
		jButtonCadastrar = new javax.swing.JButton();
		jLabelBem_vindo = new javax.swing.JLabel();
		jLabelSenha = new javax.swing.JLabel();
		jLabelLogin = new javax.swing.JLabel();
		jTextFieldLogin = new javax.swing.JTextField();
		jPasswordFieldSenha = new javax.swing.JPasswordField();
		jLabelNaoCadastrado = new javax.swing.JLabel();
		jButtonBotaoLogar = new javax.swing.JButton();
		jLabelImagem_Tela = new javax.swing.JLabel();
		Cadastro = new javax.swing.JPanel();
		jButtonFinalizar_Cadastro = new javax.swing.JButton();
		jLabelCadastroTitulo = new javax.swing.JLabel();
		jLabelNome = new javax.swing.JLabel();
		jLabelCadastro_Senha = new javax.swing.JLabel();
		jLabelConfirmaSenha = new javax.swing.JLabel();
		jLabelEmail = new javax.swing.JLabel();
		jLabelConfirmaEmail = new javax.swing.JLabel();
		jButtonVoltar = new javax.swing.JButton();
		jTextFieldNome = new javax.swing.JTextField();
		jTextFieldCadastro_Email = new javax.swing.JTextField();
		jTextFieldCadastro_ConfirmaEmail = new javax.swing.JTextField();
		jPasswordFieldCadastro_Senha = new javax.swing.JPasswordField();
		jPasswordFieldCadastro_ConfirmaSenha = new javax.swing.JPasswordField();
		jLabelCadastro_Endereco = new javax.swing.JLabel();
		jTextFieldCadastro_Endereco = new javax.swing.JTextField();
		jLabelImagem_Tela1 = new javax.swing.JLabel();
		Logado = new javax.swing.JPanel();
		jButtonCadastrar_itens = new javax.swing.JButton();
		jButtonVisualizar_perfil1 = new javax.swing.JButton();
		jButtonVisualizar_itens = new javax.swing.JButton();
		jButtonSair = new javax.swing.JButton();
		jButtonPesquisar = new javax.swing.JButton();
		jTextFieldPesquisar = new javax.swing.JTextField();
		jLabelFoto_User1 = new javax.swing.JLabel();
		jButtonExcluir_Conta = new javax.swing.JButton();
		jComboBox1 = new javax.swing.JComboBox();
		RankingButton = new javax.swing.JButton();
		jButtonUsuarios_Sistema = new javax.swing.JButton();
		jLabelImagem_Tela13 = new javax.swing.JLabel();
		Visualizar_Perfil = new javax.swing.JPanel();
		jLabelFoto_User = new javax.swing.JLabel();
		jButtonVoltar2 = new javax.swing.JButton();
		jLabelUser_Name = new javax.swing.JLabel();
		jLabelUser_Email = new javax.swing.JLabel();
		jLabelUser_Name3 = new javax.swing.JLabel();
		jTextFieldPerfil_Email = new javax.swing.JTextField();
		jTextFieldPerfil_Endereco = new javax.swing.JTextField();
		jTextFieldPerfil_Nome = new javax.swing.JTextField();
		jLabelTitulo_Perfil = new javax.swing.JLabel();
		ItensUsuario = new javax.swing.JButton();
		EditarInformacoesUsuario = new javax.swing.JButton();
		SalvarInformacoesUsuario = new javax.swing.JButton();
		Mudar_senha = new javax.swing.JButton();
		HistoricoUsuario = new javax.swing.JButton();
		jLabelImagem_Tela2 = new javax.swing.JLabel();
		Cadastra_itens = new javax.swing.JPanel();
		jLabelCadastra_itens_Titulo = new javax.swing.JLabel();
		jLabelCadastra_itens_Autor = new javax.swing.JLabel();
		jLabelCadastra_itens_NomeItem = new javax.swing.JLabel();
		jLabelCadastra_itens_Editora = new javax.swing.JLabel();
		jLabelCadastra_itens_Genero = new javax.swing.JLabel();
		jTextField_Cadastra_NomeItem = new javax.swing.JTextField();
		jTextField_Cadastra_NomeAutor = new javax.swing.JTextField();
		jTextField_Cadastra_Editora = new javax.swing.JTextField();
		jTextField_Cadastra_Genero = new javax.swing.JTextField();
		jLabelFoto_Item = new javax.swing.JLabel();
		jButtonCadastrar_item = new javax.swing.JButton();
		jButtonVoltar3 = new javax.swing.JButton();
		jLabelCadastra_itens_Versao2 = new javax.swing.JLabel();
		jTextField_Cadastra_Versao1 = new javax.swing.JTextField();
		jLabelImagem_Tela5 = new javax.swing.JLabel();
		Visualizar_Perfil_Livro = new javax.swing.JPanel();
		jLabelVisualizarLivro_Titulo = new javax.swing.JLabel();
		jButtonVoltar5 = new javax.swing.JButton();
		jLabelFoto_Item_Perfil = new javax.swing.JLabel();
		jLabelLivro_Titulo = new javax.swing.JLabel();
		jTextField_Titulo_Livro = new javax.swing.JTextField();
		jLabelLivro_Autor = new javax.swing.JLabel();
		jTextField_Livro_Autor = new javax.swing.JTextField();
		jLabelLivro_Editora = new javax.swing.JLabel();
		jTextField_Livro_Editora = new javax.swing.JTextField();
		jLabelLivro_Versao = new javax.swing.JLabel();
		jTextField_Livro_Versao = new javax.swing.JTextField();
		jLabelLivro_Genero = new javax.swing.JLabel();
		jTextField_Livro_Genero = new javax.swing.JTextField();
		jButtonFavoritarItem = new javax.swing.JButton();
		jButtonPegarEmprestado = new javax.swing.JButton();
		HistoricoLivro = new javax.swing.JButton();
		jTextField_Media_Item = new javax.swing.JTextField();
		jButtonDisponivel = new javax.swing.JButton();
		jLabelImagem_Tela3 = new javax.swing.JLabel();
		Visualizar_Itens_Sistema = new javax.swing.JPanel();
		jLabelVisualizar_Itens_Sistema_Titulo = new javax.swing.JLabel();
		jButtonVoltar4 = new javax.swing.JButton();
		jScrollPanePainelDeItensNoSistema = new javax.swing.JScrollPane();
		jLabelImagem_Tela6 = new javax.swing.JLabel();
		ItensDoUsuario = new javax.swing.JPanel();
		Itens_usuario = new javax.swing.JLabel();
		jButtonVoltar6 = new javax.swing.JButton();
		ItensUsuarioScrollPainel = new javax.swing.JScrollPane();
		jLabelImagem_Tela7 = new javax.swing.JLabel();
		Pesquisa = new javax.swing.JPanel();
		Titulo_Pesquisar = new javax.swing.JLabel();
		jButtonVoltar7 = new javax.swing.JButton();
		PesquisaScrollPainel = new javax.swing.JScrollPane();
		jLabelImagem_Tela10 = new javax.swing.JLabel();
		Visualiza_Rank = new javax.swing.JPanel();
		jLabelImagem_Tela11 = new javax.swing.JLabel();
		Rank_Titulo = new javax.swing.JLabel();
		jListTOPItens = new javax.swing.JList();
		jListTOPUsuarios = new javax.swing.JList();
		jButtonVoltar8 = new javax.swing.JButton();
		usuarios_sistema = new javax.swing.JPanel();
		jScrollPanePainelDeItensNoSistema1 = new javax.swing.JScrollPane();
		Usuarios_Titulo = new javax.swing.JLabel();
		jButtonVoltar9 = new javax.swing.JButton();
		jLabelImagem_Tela12 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent evt) {
				formWindowClosing(evt);
			}
		});

		Painel.setLayout(new java.awt.CardLayout());

		Login.setBackground(new java.awt.Color(-1, true));
		Login.setLayout(null);

		jButtonCadastrar.setIcon(new javax.swing.ImageIcon(getClass()
				.getResource("/Imagens/botao_cadastro.png"))); // NOI18N
		jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonCadastrarActionPerformed(evt);
			}
		});
		Login.add(jButtonCadastrar);
		jButtonCadastrar.setBounds(250, 330, 120, 30);

		jLabelBem_vindo.setFont(new java.awt.Font("Dialog", 0, 36));
		jLabelBem_vindo.setText("Bem vindo!");
		Login.add(jLabelBem_vindo);
		jLabelBem_vindo.setBounds(200, 20, 250, 40);

		jLabelSenha.setText("Senha");
		Login.add(jLabelSenha);
		jLabelSenha.setBounds(30, 170, 80, 40);

		jLabelLogin.setText("Login");
		Login.add(jLabelLogin);
		jLabelLogin.setBounds(30, 130, 80, 40);

		jTextFieldLogin.setText("exemplo@gmail.com");
		Login.add(jTextFieldLogin);
		jTextFieldLogin.setBounds(90, 130, 260, 30);
		Login.add(jPasswordFieldSenha);
		jPasswordFieldSenha.setBounds(90, 180, 260, 30);

		jLabelNaoCadastrado.setText("Ainda não cadastrado?");
		Login.add(jLabelNaoCadastrado);
		jLabelNaoCadastrado.setBounds(60, 330, 210, 30);

		jButtonBotaoLogar.setIcon(new javax.swing.ImageIcon(getClass()
				.getResource("/Imagens/botao_logar.jpg"))); // NOI18N
		jButtonBotaoLogar
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						jButtonBotaoLogarActionPerformed(evt);
					}
				});
		Login.add(jButtonBotaoLogar);
		jButtonBotaoLogar.setBounds(160, 230, 110, 30);

		jLabelImagem_Tela.setIcon(new javax.swing.ImageIcon(getClass()
				.getResource("/Imagens/LoginScreenGrandeModificado.jpg"))); // NOI18N
		Login.add(jLabelImagem_Tela);
		jLabelImagem_Tela.setBounds(0, 0, 630, 420);

		Painel.add(Login, "login");

		Cadastro.setBackground(new java.awt.Color(-1, true));
		Cadastro.setLayout(null);

		jButtonFinalizar_Cadastro.setIcon(new javax.swing.ImageIcon(getClass()
				.getResource("/Imagens/botao_finalizar.jpg"))); // NOI18N
		jButtonFinalizar_Cadastro.setText("Finalizar");
		jButtonFinalizar_Cadastro.setToolTipText("Finalizar cadastro");
		jButtonFinalizar_Cadastro
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						jButtonFinalizar_CadastroActionPerformed(evt);
					}
				});
		Cadastro.add(jButtonFinalizar_Cadastro);
		jButtonFinalizar_Cadastro.setBounds(220, 340, 110, 30);

		jLabelCadastroTitulo.setFont(new java.awt.Font("Dialog", 0, 36));
		jLabelCadastroTitulo.setText("Cadastro");
		Cadastro.add(jLabelCadastroTitulo);
		jLabelCadastroTitulo.setBounds(170, 10, 170, 50);

		jLabelNome.setText("Nome");
		Cadastro.add(jLabelNome);
		jLabelNome.setBounds(20, 70, 80, 30);

		jLabelCadastro_Senha.setText("Senha");
		Cadastro.add(jLabelCadastro_Senha);
		jLabelCadastro_Senha.setBounds(20, 110, 70, 30);

		jLabelConfirmaSenha.setText("Confirme sua senha");
		Cadastro.add(jLabelConfirmaSenha);
		jLabelConfirmaSenha.setBounds(20, 150, 170, 30);

		jLabelEmail.setText("Email");
		Cadastro.add(jLabelEmail);
		jLabelEmail.setBounds(20, 190, 80, 30);

		jLabelConfirmaEmail.setText("Confirme seu email");
		Cadastro.add(jLabelConfirmaEmail);
		jLabelConfirmaEmail.setBounds(20, 230, 150, 30);

		jButtonVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/Imagens/botao_voltar.gif"))); // NOI18N
		jButtonVoltar.setToolTipText("Voltar para Login");
		jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonVoltarActionPerformed(evt);
			}
		});
		Cadastro.add(jButtonVoltar);
		jButtonVoltar.setBounds(10, 10, 40, 50);
		Cadastro.add(jTextFieldNome);
		jTextFieldNome.setBounds(90, 70, 340, 30);
		Cadastro.add(jTextFieldCadastro_Email);
		jTextFieldCadastro_Email.setBounds(90, 190, 340, 30);
		Cadastro.add(jTextFieldCadastro_ConfirmaEmail);
		jTextFieldCadastro_ConfirmaEmail.setBounds(170, 230, 260, 30);
		Cadastro.add(jPasswordFieldCadastro_Senha);
		jPasswordFieldCadastro_Senha.setBounds(90, 110, 340, 30);

		jPasswordFieldCadastro_ConfirmaSenha
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						jPasswordFieldCadastro_ConfirmaSenhaActionPerformed(evt);
					}
				});
		Cadastro.add(jPasswordFieldCadastro_ConfirmaSenha);
		jPasswordFieldCadastro_ConfirmaSenha.setBounds(170, 150, 260, 30);

		jLabelCadastro_Endereco.setText("Endereço");
		Cadastro.add(jLabelCadastro_Endereco);
		jLabelCadastro_Endereco.setBounds(20, 270, 130, 30);
		Cadastro.add(jTextFieldCadastro_Endereco);
		jTextFieldCadastro_Endereco.setBounds(170, 270, 260, 30);

		jLabelImagem_Tela1.setIcon(new javax.swing.ImageIcon(getClass()
				.getResource("/Imagens/LoginScreenGrandeModificado.jpg"))); // NOI18N
		Cadastro.add(jLabelImagem_Tela1);
		jLabelImagem_Tela1.setBounds(0, 0, 630, 420);

		Painel.add(Cadastro, "cadastro");
		Cadastro.getAccessibleContext().setAccessibleName("");

		Logado.setLayout(null);

		jButtonCadastrar_itens.setText("Cadastrar Itens");
		jButtonCadastrar_itens
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						jButtonCadastrar_itensActionPerformed(evt);
					}
				});
		Logado.add(jButtonCadastrar_itens);
		jButtonCadastrar_itens.setBounds(190, 230, 150, 40);

		jButtonVisualizar_perfil1.setText("Visualizar Perfil");
		jButtonVisualizar_perfil1
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						jButtonVisualizar_perfil1ActionPerformed(evt);
					}
				});
		Logado.add(jButtonVisualizar_perfil1);
		jButtonVisualizar_perfil1.setBounds(20, 230, 150, 40);

		jButtonVisualizar_itens.setText("Visualizar Itens");
		jButtonVisualizar_itens
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						jButtonVisualizar_itensActionPerformed(evt);
					}
				});
		Logado.add(jButtonVisualizar_itens);
		jButtonVisualizar_itens.setBounds(360, 230, 150, 40);

		jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/Imagens/botao_sair.jpeg"))); // NOI18N
		jButtonSair.setToolTipText("Voltar para Login");
		jButtonSair.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonSairActionPerformed(evt);
			}
		});
		Logado.add(jButtonSair);
		jButtonSair.setBounds(10, 10, 80, 40);

		jButtonPesquisar.setIcon(new javax.swing.ImageIcon(getClass()
				.getResource("/Imagens/botao_pesquisar.gif"))); // NOI18N
		jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonPesquisarActionPerformed(evt);
			}
		});
		Logado.add(jButtonPesquisar);
		jButtonPesquisar.setBounds(310, 50, 120, 20);

		jTextFieldPesquisar.setText("Pesquise aqui");
		Logado.add(jTextFieldPesquisar);
		jTextFieldPesquisar.setBounds(280, 9, 170, 30);

		jLabelFoto_User1.setIcon(new javax.swing.ImageIcon(getClass()
				.getResource("/Imagens/user_Modificado.png"))); // NOI18N
		jLabelFoto_User1.setText("Foto_User");
		jLabelFoto_User1.setBorder(new javax.swing.border.MatteBorder(null));
		Logado.add(jLabelFoto_User1);
		jLabelFoto_User1.setBounds(30, 70, 130, 130);

		jButtonExcluir_Conta.setText("Excluir Conta");
		jButtonExcluir_Conta
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						jButtonExcluir_ContaActionPerformed(evt);
					}
				});
		Logado.add(jButtonExcluir_Conta);
		jButtonExcluir_Conta.setBounds(190, 340, 150, 40);

		jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"Titulo", "Autor", "Editora", "Genero", "Usuario_Nome",
				"Usuario_Email" }));
		Logado.add(jComboBox1);
		jComboBox1.setBounds(460, 10, 129, 24);

		RankingButton.setText("Rank");
		RankingButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				RankingButtonActionPerformed(evt);
			}
		});
		Logado.add(RankingButton);
		RankingButton.setBounds(130, 20, 94, 25);

		jButtonUsuarios_Sistema.setText("Visualizar usuarios");
		jButtonUsuarios_Sistema
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						jButtonUsuarios_SistemaActionPerformed(evt);
					}
				});
		Logado.add(jButtonUsuarios_Sistema);
		jButtonUsuarios_Sistema.setBounds(340, 170, 190, 40);

		jLabelImagem_Tela13.setIcon(new javax.swing.ImageIcon(getClass()
				.getResource("/Imagens/LoginScreenGrandeModificado.jpg"))); // NOI18N
		Logado.add(jLabelImagem_Tela13);
		jLabelImagem_Tela13.setBounds(0, 0, 680, 425);

		Painel.add(Logado, "logado");

		Visualizar_Perfil.setBackground(new java.awt.Color(-1, true));
		Visualizar_Perfil.setLayout(null);

		jLabelFoto_User.setIcon(new javax.swing.ImageIcon(getClass()
				.getResource("/Imagens/user_Modificado.png"))); // NOI18N
		jLabelFoto_User.setText("Foto_User");
		jLabelFoto_User.setBorder(new javax.swing.border.MatteBorder(null));
		Visualizar_Perfil.add(jLabelFoto_User);
		jLabelFoto_User.setBounds(30, 110, 130, 130);

		jButtonVoltar2.setIcon(new javax.swing.ImageIcon(getClass()
				.getResource("/Imagens/botao_voltar.gif"))); // NOI18N
		jButtonVoltar2.setToolTipText("Voltar para Login");
		jButtonVoltar2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonVoltar2ActionPerformed(evt);
			}
		});
		Visualizar_Perfil.add(jButtonVoltar2);
		jButtonVoltar2.setBounds(10, 10, 40, 50);

		jLabelUser_Name.setText("Nome");
		Visualizar_Perfil.add(jLabelUser_Name);
		jLabelUser_Name.setBounds(200, 90, 60, 30);

		jLabelUser_Email.setText("E-mail");
		Visualizar_Perfil.add(jLabelUser_Email);
		jLabelUser_Email.setBounds(200, 140, 80, 30);

		jLabelUser_Name3.setText("Endereço");
		Visualizar_Perfil.add(jLabelUser_Name3);
		jLabelUser_Name3.setBounds(200, 190, 100, 30);

		jTextFieldPerfil_Email.setEditable(false);
		jTextFieldPerfil_Email.setOpaque(false);
		Visualizar_Perfil.add(jTextFieldPerfil_Email);
		jTextFieldPerfil_Email.setBounds(290, 140, 190, 30);

		jTextFieldPerfil_Endereco.setEditable(false);
		Visualizar_Perfil.add(jTextFieldPerfil_Endereco);
		jTextFieldPerfil_Endereco.setBounds(290, 190, 190, 30);

		jTextFieldPerfil_Nome.setEditable(false);
		Visualizar_Perfil.add(jTextFieldPerfil_Nome);
		jTextFieldPerfil_Nome.setBounds(290, 90, 190, 30);

		jLabelTitulo_Perfil.setFont(new java.awt.Font("Dialog", 0, 36));
		jLabelTitulo_Perfil.setText("Perfil");
		Visualizar_Perfil.add(jLabelTitulo_Perfil);
		jLabelTitulo_Perfil.setBounds(240, 20, 120, 40);

		ItensUsuario.setText("Seus Itens");
		ItensUsuario.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ItensUsuarioActionPerformed(evt);
			}
		});
		Visualizar_Perfil.add(ItensUsuario);
		ItensUsuario.setBounds(30, 340, 130, 30);

		EditarInformacoesUsuario.setText("Editar informações");
		EditarInformacoesUsuario
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						EditarInformacoesUsuarioActionPerformed(evt);
					}
				});
		Visualizar_Perfil.add(EditarInformacoesUsuario);
		EditarInformacoesUsuario.setBounds(200, 340, 180, 30);

		SalvarInformacoesUsuario.setText("Salvar");
		SalvarInformacoesUsuario.setEnabled(false);
		SalvarInformacoesUsuario
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						SalvarInformacoesUsuarioActionPerformed(evt);
					}
				});
		Visualizar_Perfil.add(SalvarInformacoesUsuario);
		SalvarInformacoesUsuario.setBounds(420, 340, 140, 30);

		Mudar_senha.setText("Mudar Senha");
		Mudar_senha.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Mudar_senhaActionPerformed(evt);
			}
		});
		Visualizar_Perfil.add(Mudar_senha);
		Mudar_senha.setBounds(170, 250, 150, 30);

		HistoricoUsuario.setText("Historico");
		HistoricoUsuario.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				HistoricoUsuarioActionPerformed(evt);
			}
		});
		Visualizar_Perfil.add(HistoricoUsuario);
		HistoricoUsuario.setBounds(340, 250, 140, 30);

		jLabelImagem_Tela2.setIcon(new javax.swing.ImageIcon(getClass()
				.getResource("/Imagens/LoginScreenGrandeModificado.jpg"))); // NOI18N
		Visualizar_Perfil.add(jLabelImagem_Tela2);
		jLabelImagem_Tela2.setBounds(0, 0, 630, 420);

		Painel.add(Visualizar_Perfil, "visualizar_perfil");

		Cadastra_itens.setLayout(null);

		jLabelCadastra_itens_Titulo.setFont(new java.awt.Font("Dialog", 0, 36));
		jLabelCadastra_itens_Titulo.setText("Cadastra Itens");
		Cadastra_itens.add(jLabelCadastra_itens_Titulo);
		jLabelCadastra_itens_Titulo.setBounds(150, 10, 280, 70);

		jLabelCadastra_itens_Autor.setText("Autor");
		Cadastra_itens.add(jLabelCadastra_itens_Autor);
		jLabelCadastra_itens_Autor.setBounds(160, 130, 60, 30);

		jLabelCadastra_itens_NomeItem.setText("Titulo");
		Cadastra_itens.add(jLabelCadastra_itens_NomeItem);
		jLabelCadastra_itens_NomeItem.setBounds(160, 90, 60, 30);

		jLabelCadastra_itens_Editora.setText("Editora");
		Cadastra_itens.add(jLabelCadastra_itens_Editora);
		jLabelCadastra_itens_Editora.setBounds(160, 170, 60, 30);

		jLabelCadastra_itens_Genero.setText("Genero");
		Cadastra_itens.add(jLabelCadastra_itens_Genero);
		jLabelCadastra_itens_Genero.setBounds(160, 210, 60, 30);

		jTextField_Cadastra_NomeItem
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						jTextField_Cadastra_NomeItemActionPerformed(evt);
					}
				});
		Cadastra_itens.add(jTextField_Cadastra_NomeItem);
		jTextField_Cadastra_NomeItem.setBounds(240, 90, 220, 30);
		Cadastra_itens.add(jTextField_Cadastra_NomeAutor);
		jTextField_Cadastra_NomeAutor.setBounds(240, 130, 220, 30);
		Cadastra_itens.add(jTextField_Cadastra_Editora);
		jTextField_Cadastra_Editora.setBounds(240, 170, 220, 30);
		Cadastra_itens.add(jTextField_Cadastra_Genero);
		jTextField_Cadastra_Genero.setBounds(240, 210, 220, 30);

		jLabelFoto_Item.setIcon(new javax.swing.ImageIcon(getClass()
				.getResource("/Imagens/user_Modificado.png"))); // NOI18N
		jLabelFoto_Item.setText("Foto_User");
		jLabelFoto_Item.setBorder(new javax.swing.border.MatteBorder(null));
		Cadastra_itens.add(jLabelFoto_Item);
		jLabelFoto_Item.setBounds(10, 110, 110, 120);

		jButtonCadastrar_item.setText("Cadastrar Item");
		jButtonCadastrar_item
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						jButtonCadastrar_itemActionPerformed(evt);
					}
				});
		Cadastra_itens.add(jButtonCadastrar_item);
		jButtonCadastrar_item.setBounds(200, 330, 140, 30);

		jButtonVoltar3.setIcon(new javax.swing.ImageIcon(getClass()
				.getResource("/Imagens/botao_voltar.gif"))); // NOI18N
		jButtonVoltar3.setToolTipText("Voltar para Login");
		jButtonVoltar3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonVoltar3ActionPerformed(evt);
			}
		});
		Cadastra_itens.add(jButtonVoltar3);
		jButtonVoltar3.setBounds(10, 10, 40, 50);

		jLabelCadastra_itens_Versao2.setText("Versao");
		Cadastra_itens.add(jLabelCadastra_itens_Versao2);
		jLabelCadastra_itens_Versao2.setBounds(160, 250, 60, 30);
		Cadastra_itens.add(jTextField_Cadastra_Versao1);
		jTextField_Cadastra_Versao1.setBounds(240, 250, 220, 30);

		jLabelImagem_Tela5.setIcon(new javax.swing.ImageIcon(getClass()
				.getResource("/Imagens/LoginScreenGrandeModificado.jpg"))); // NOI18N
		Cadastra_itens.add(jLabelImagem_Tela5);
		jLabelImagem_Tela5.setBounds(0, 0, 630, 420);

		Painel.add(Cadastra_itens, "cadastra_item");

		Visualizar_Perfil_Livro.setLayout(null);

		jLabelVisualizarLivro_Titulo
				.setFont(new java.awt.Font("Dialog", 0, 36));
		jLabelVisualizarLivro_Titulo.setText("Informações do Livro");
		Visualizar_Perfil_Livro.add(jLabelVisualizarLivro_Titulo);
		jLabelVisualizarLivro_Titulo.setBounds(110, 10, 400, 60);

		jButtonVoltar5.setIcon(new javax.swing.ImageIcon(getClass()
				.getResource("/Imagens/botao_voltar.gif"))); // NOI18N
		jButtonVoltar5.setToolTipText("Voltar para Login");
		jButtonVoltar5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonVoltar5ActionPerformed(evt);
			}
		});
		Visualizar_Perfil_Livro.add(jButtonVoltar5);
		jButtonVoltar5.setBounds(10, 10, 40, 50);

		jLabelFoto_Item_Perfil.setIcon(new javax.swing.ImageIcon(getClass()
				.getResource("/Imagens/user_Modificado.png"))); // NOI18N
		jLabelFoto_Item_Perfil.setBorder(new javax.swing.border.MatteBorder(
				null));
		jLabelFoto_Item_Perfil
				.addMouseListener(new java.awt.event.MouseAdapter() {
					public void mouseClicked(java.awt.event.MouseEvent evt) {
						jLabelFoto_Item_PerfilMouseClicked(evt);
					}
				});
		Visualizar_Perfil_Livro.add(jLabelFoto_Item_Perfil);
		jLabelFoto_Item_Perfil.setBounds(10, 110, 110, 120);

		jLabelLivro_Titulo.setText("Titulo");
		Visualizar_Perfil_Livro.add(jLabelLivro_Titulo);
		jLabelLivro_Titulo.setBounds(160, 90, 60, 30);

		jTextField_Titulo_Livro.setEditable(false);
		jTextField_Titulo_Livro.setBorder(null);
		jTextField_Titulo_Livro.setOpaque(false);
		jTextField_Titulo_Livro
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						jTextField_Titulo_LivroActionPerformed(evt);
					}
				});
		Visualizar_Perfil_Livro.add(jTextField_Titulo_Livro);
		jTextField_Titulo_Livro.setBounds(240, 90, 250, 30);

		jLabelLivro_Autor.setText("Autor");
		Visualizar_Perfil_Livro.add(jLabelLivro_Autor);
		jLabelLivro_Autor.setBounds(160, 130, 60, 30);

		jTextField_Livro_Autor.setEditable(false);
		jTextField_Livro_Autor.setBorder(null);
		jTextField_Livro_Autor.setOpaque(false);
		Visualizar_Perfil_Livro.add(jTextField_Livro_Autor);
		jTextField_Livro_Autor.setBounds(240, 130, 250, 30);

		jLabelLivro_Editora.setText("Editora");
		Visualizar_Perfil_Livro.add(jLabelLivro_Editora);
		jLabelLivro_Editora.setBounds(160, 170, 60, 30);

		jTextField_Livro_Editora.setEditable(false);
		jTextField_Livro_Editora.setBorder(null);
		jTextField_Livro_Editora.setOpaque(false);
		Visualizar_Perfil_Livro.add(jTextField_Livro_Editora);
		jTextField_Livro_Editora.setBounds(240, 170, 250, 30);

		jLabelLivro_Versao.setText("Versao");
		Visualizar_Perfil_Livro.add(jLabelLivro_Versao);
		jLabelLivro_Versao.setBounds(160, 250, 60, 30);

		jTextField_Livro_Versao.setEditable(false);
		jTextField_Livro_Versao.setBorder(null);
		jTextField_Livro_Versao.setOpaque(false);
		Visualizar_Perfil_Livro.add(jTextField_Livro_Versao);
		jTextField_Livro_Versao.setBounds(240, 250, 250, 30);

		jLabelLivro_Genero.setText("Genero");
		Visualizar_Perfil_Livro.add(jLabelLivro_Genero);
		jLabelLivro_Genero.setBounds(160, 210, 60, 30);

		jTextField_Livro_Genero.setEditable(false);
		jTextField_Livro_Genero.setBorder(null);
		jTextField_Livro_Genero.setOpaque(false);
		Visualizar_Perfil_Livro.add(jTextField_Livro_Genero);
		jTextField_Livro_Genero.setBounds(240, 210, 250, 30);

		jButtonFavoritarItem.setText("Favoritar");
		jButtonFavoritarItem
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						jButtonFavoritarItemActionPerformed(evt);
					}
				});
		Visualizar_Perfil_Livro.add(jButtonFavoritarItem);
		jButtonFavoritarItem.setBounds(400, 340, 120, 30);

		jButtonPegarEmprestado.setText("Pegar Emprestado");
		jButtonPegarEmprestado
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						jButtonPegarEmprestadoActionPerformed(evt);
					}
				});
		Visualizar_Perfil_Livro.add(jButtonPegarEmprestado);
		jButtonPegarEmprestado.setBounds(10, 340, 180, 30);

		HistoricoLivro.setText("Historico");
		HistoricoLivro.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				HistoricoLivroActionPerformed(evt);
			}
		});
		Visualizar_Perfil_Livro.add(HistoricoLivro);
		HistoricoLivro.setBounds(230, 340, 130, 30);

		jTextField_Media_Item.setEditable(false);
		jTextField_Media_Item.setFont(new java.awt.Font("Dialog", 1, 14));
		jTextField_Media_Item.setBorder(null);
		Visualizar_Perfil_Livro.add(jTextField_Media_Item);
		jTextField_Media_Item.setBounds(20, 240, 100, 30);

		jButtonDisponivel.setText("Tornar disponível");
		jButtonDisponivel
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						jButtonDisponivelActionPerformed(evt);
					}
				});
		Visualizar_Perfil_Livro.add(jButtonDisponivel);
		jButtonDisponivel.setBounds(20, 290, 160, 30);

		jLabelImagem_Tela3.setIcon(new javax.swing.ImageIcon(getClass()
				.getResource("/Imagens/LoginScreenGrandeModificado.jpg"))); // NOI18N
		Visualizar_Perfil_Livro.add(jLabelImagem_Tela3);
		jLabelImagem_Tela3.setBounds(0, 0, 630, 420);

		Painel.add(Visualizar_Perfil_Livro, "visualizar_perfil_livro");

		Visualizar_Itens_Sistema.setLayout(null);

		jLabelVisualizar_Itens_Sistema_Titulo.setFont(new java.awt.Font(
				"Dialog", 0, 36));
		jLabelVisualizar_Itens_Sistema_Titulo.setText("Itens no sistema");
		Visualizar_Itens_Sistema.add(jLabelVisualizar_Itens_Sistema_Titulo);
		jLabelVisualizar_Itens_Sistema_Titulo.setBounds(170, 10, 320, 80);

		jButtonVoltar4.setIcon(new javax.swing.ImageIcon(getClass()
				.getResource("/Imagens/botao_voltar.gif"))); // NOI18N
		jButtonVoltar4.setToolTipText("Voltar para Login");
		jButtonVoltar4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonVoltar4ActionPerformed(evt);
			}
		});
		Visualizar_Itens_Sistema.add(jButtonVoltar4);
		jButtonVoltar4.setBounds(10, 10, 40, 50);

		jScrollPanePainelDeItensNoSistema.setBackground(new java.awt.Color(-1,
				true));
		jScrollPanePainelDeItensNoSistema
				.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		jScrollPanePainelDeItensNoSistema.setAutoscrolls(true);
		jScrollPanePainelDeItensNoSistema.setOpaque(false);
		Visualizar_Itens_Sistema.add(jScrollPanePainelDeItensNoSistema);
		jScrollPanePainelDeItensNoSistema.setBounds(0, 80, 610, 330);

		jLabelImagem_Tela6.setIcon(new javax.swing.ImageIcon(getClass()
				.getResource("/Imagens/LoginScreenGrandeModificado.jpg"))); // NOI18N
		Visualizar_Itens_Sistema.add(jLabelImagem_Tela6);
		jLabelImagem_Tela6.setBounds(0, 0, 630, 420);

		Painel.add(Visualizar_Itens_Sistema, "itens_sistema");

		ItensDoUsuario.setLayout(null);

		Itens_usuario.setFont(new java.awt.Font("Dialog", 0, 36));
		Itens_usuario.setText("Seus Itens");
		ItensDoUsuario.add(Itens_usuario);
		Itens_usuario.setBounds(200, 40, 280, 40);

		jButtonVoltar6.setIcon(new javax.swing.ImageIcon(getClass()
				.getResource("/Imagens/botao_voltar.gif"))); // NOI18N
		jButtonVoltar6.setToolTipText("Voltar para Login");
		jButtonVoltar6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonVoltar6ActionPerformed(evt);
			}
		});
		ItensDoUsuario.add(jButtonVoltar6);
		jButtonVoltar6.setBounds(10, 10, 40, 50);

		ItensUsuarioScrollPainel
				.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		ItensDoUsuario.add(ItensUsuarioScrollPainel);
		ItensUsuarioScrollPainel.setBounds(0, 110, 610, 300);

		jLabelImagem_Tela7.setIcon(new javax.swing.ImageIcon(getClass()
				.getResource("/Imagens/LoginScreenGrandeModificado.jpg"))); // NOI18N
		ItensDoUsuario.add(jLabelImagem_Tela7);
		jLabelImagem_Tela7.setBounds(0, 0, 630, 420);

		Painel.add(ItensDoUsuario, "ItensDoUsuario");

		Pesquisa.setMaximumSize(null);
		Pesquisa.setLayout(null);

		Titulo_Pesquisar.setFont(new java.awt.Font("Dialog", 0, 36));
		Titulo_Pesquisar.setText("Pesquisa");
		Pesquisa.add(Titulo_Pesquisar);
		Titulo_Pesquisar.setBounds(210, 30, 193, 48);

		jButtonVoltar7.setIcon(new javax.swing.ImageIcon(getClass()
				.getResource("/Imagens/botao_voltar.gif"))); // NOI18N
		jButtonVoltar7.setToolTipText("Voltar para Login");
		jButtonVoltar7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonVoltar7ActionPerformed(evt);
			}
		});
		Pesquisa.add(jButtonVoltar7);
		jButtonVoltar7.setBounds(10, 10, 40, 50);

		PesquisaScrollPainel
				.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		Pesquisa.add(PesquisaScrollPainel);
		PesquisaScrollPainel.setBounds(0, 110, 610, 300);

		jLabelImagem_Tela10.setIcon(new javax.swing.ImageIcon(getClass()
				.getResource("/Imagens/LoginScreenGrandeModificado.jpg"))); // NOI18N
		Pesquisa.add(jLabelImagem_Tela10);
		jLabelImagem_Tela10.setBounds(0, 0, 630, 420);

		Painel.add(Pesquisa, "Pesquisa");

		jLabelImagem_Tela11.setIcon(new javax.swing.ImageIcon(getClass()
				.getResource("/Imagens/LoginScreenGrandeModificado.jpg"))); // NOI18N

		Rank_Titulo.setFont(new java.awt.Font("Dialog", 0, 36));
		Rank_Titulo.setText("Rank TOP 5");

		jButtonVoltar8.setIcon(new javax.swing.ImageIcon(getClass()
				.getResource("/Imagens/botao_voltar.gif"))); // NOI18N
		jButtonVoltar8.setToolTipText("Voltar para Login");
		jButtonVoltar8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonVoltar8ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout Visualiza_RankLayout = new javax.swing.GroupLayout(
				Visualiza_Rank);
		Visualiza_Rank.setLayout(Visualiza_RankLayout);
		Visualiza_RankLayout
				.setHorizontalGroup(Visualiza_RankLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								Visualiza_RankLayout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												Visualiza_RankLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																Visualiza_RankLayout
																		.createSequentialGroup()
																		.addGroup(
																				Visualiza_RankLayout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jListTOPUsuarios,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								574,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jListTOPItens,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								574,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addContainerGap(
																				44,
																				Short.MAX_VALUE))
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																Visualiza_RankLayout
																		.createSequentialGroup()
																		.addComponent(
																				jButtonVoltar8,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				40,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				130,
																				Short.MAX_VALUE)
																		.addComponent(
																				Rank_Titulo,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				244,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(235,
																				235,
																				235))))
						.addGroup(
								Visualiza_RankLayout
										.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(
												Visualiza_RankLayout
														.createSequentialGroup()
														.addGap(0, 0,
																Short.MAX_VALUE)
														.addComponent(
																jLabelImagem_Tela11,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																630,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(0, 0,
																Short.MAX_VALUE))));
		Visualiza_RankLayout
				.setVerticalGroup(Visualiza_RankLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								Visualiza_RankLayout
										.createSequentialGroup()
										.addGroup(
												Visualiza_RankLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																Visualiza_RankLayout
																		.createSequentialGroup()
																		.addGap(24,
																				24,
																				24)
																		.addComponent(
																				Rank_Titulo,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																Visualiza_RankLayout
																		.createSequentialGroup()
																		.addContainerGap()
																		.addComponent(
																				jButtonVoltar8,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				50,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addGap(33, 33, 33)
										.addComponent(
												jListTOPUsuarios,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												128,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												44, Short.MAX_VALUE)
										.addComponent(
												jListTOPItens,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												119,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(30, 30, 30))
						.addGroup(
								Visualiza_RankLayout
										.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(
												Visualiza_RankLayout
														.createSequentialGroup()
														.addGap(0, 0,
																Short.MAX_VALUE)
														.addComponent(
																jLabelImagem_Tela11,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																420,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(0, 0,
																Short.MAX_VALUE))));

		Painel.add(Visualiza_Rank, "Visualiza_Top5");

		usuarios_sistema.setLayout(null);

		jScrollPanePainelDeItensNoSistema1.setBackground(new java.awt.Color(-1,
				true));
		jScrollPanePainelDeItensNoSistema1
				.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		jScrollPanePainelDeItensNoSistema1.setAutoscrolls(true);
		jScrollPanePainelDeItensNoSistema1.setOpaque(false);
		usuarios_sistema.add(jScrollPanePainelDeItensNoSistema1);
		jScrollPanePainelDeItensNoSistema1.setBounds(0, 80, 610, 330);

		Usuarios_Titulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
		Usuarios_Titulo.setText("Usuarios Cadastrados");
		usuarios_sistema.add(Usuarios_Titulo);
		Usuarios_Titulo.setBounds(122, 12, 304, 39);

		jButtonVoltar9.setIcon(new javax.swing.ImageIcon(getClass()
				.getResource("/Imagens/botao_voltar.gif"))); // NOI18N
		jButtonVoltar9.setToolTipText("Voltar para Login");
		jButtonVoltar9.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonVoltar9ActionPerformed(evt);
			}
		});
		usuarios_sistema.add(jButtonVoltar9);
		jButtonVoltar9.setBounds(10, 10, 40, 50);

		jLabelImagem_Tela12.setIcon(new javax.swing.ImageIcon(getClass()
				.getResource("/Imagens/LoginScreenGrandeModificado.jpg"))); // NOI18N
		usuarios_sistema.add(jLabelImagem_Tela12);
		jLabelImagem_Tela12.setBounds(0, 0, 680, 425);

		Painel.add(usuarios_sistema, "usuarios_sistema");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(Painel,
				javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(Painel,
				javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit()
				.getScreenSize();
		setBounds((screenSize.width - 611) / 2, (screenSize.height - 448) / 2,
				611, 448);
	}

	private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {
		CardLayout card = (CardLayout) Painel.getLayout();
		card.show(Painel, "cadastro");
		limpaTelaLogin();
	}

	@SuppressWarnings("deprecation")
	private void jButtonFinalizar_CadastroActionPerformed(
			java.awt.event.ActionEvent evt) {
		if (!(jTextFieldNome.getText().matches("[A-Za-zç-ú\\s]*+"))) {
			JOptionPane.showMessageDialog(rootPane, "Nome invalido!");
		} else if (!(jPasswordFieldCadastro_Senha.getText()
				.equals(jPasswordFieldCadastro_ConfirmaSenha.getText()))) {
			JOptionPane.showMessageDialog(rootPane, "Senha invalida!");
		}

		else if (!(jTextFieldCadastro_Email.getText()
				.matches("^[\\w-]+(\\.[\\w-]+)*@([\\w-]+\\.)+[a-zA-Z]{2,7}$"))) {
			JOptionPane.showMessageDialog(rootPane,
					"Dominio do Email invalido!");
		} else if (!(jTextFieldCadastro_Email.getText()
				.equals(jTextFieldCadastro_ConfirmaEmail.getText()))) {
			JOptionPane
					.showMessageDialog(rootPane, "Email não estão iguais!");
		} else if (gerenciador.getCadastros().containsKey(
				jTextFieldCadastro_Email.getText())) {
			JOptionPane.showMessageDialog(rootPane,
					"Email já cadastrado no sistema!");
		} else {

			try {
				Usuario u = new Usuario(jTextFieldNome.getText(),
						jPasswordFieldCadastro_Senha.getText(),
						jTextFieldCadastro_Email.getText(),
						jTextFieldCadastro_Endereco.getText());
				gerenciador.cadastraUsuario(u);
				limpaTelaCadastroUsuario();
				JOptionPane.showMessageDialog(rootPane,
						"Usuario cadastrado com sucesso!");
				CardLayout card = (CardLayout) Painel.getLayout();
				card.show(Painel, "login");

			} catch (Exception e) {
				JOptionPane.showMessageDialog(this, e.getMessage(), "Erro", -1);
			}
		}

	}

	private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {
		limpaTelaCadastroUsuario();
		CardLayout card = (CardLayout) Painel.getLayout();
		card.show(Painel, "login");
	}

	private void jPasswordFieldCadastro_ConfirmaSenhaActionPerformed(
			java.awt.event.ActionEvent evt) {
	}

	@SuppressWarnings("deprecation")
	private void jButtonBotaoLogarActionPerformed(java.awt.event.ActionEvent evt) {
		if (gerenciador.login(jTextFieldLogin.getText(),
				jPasswordFieldSenha.getText())) {
			CardLayout card = (CardLayout) Painel.getLayout();
			card.show(Painel, "logado");
			gerenciador.setLogado(gerenciador.getCadastros().get(
					jTextFieldLogin.getText()));

		} else {
			JOptionPane
					.showMessageDialog(rootPane, "Login ou senha invalidos!");
		}
	}

	private void jButtonCadastrar_itensActionPerformed(
			java.awt.event.ActionEvent evt) {
		limpaTelaCadastraItem();
		CardLayout card = (CardLayout) Painel.getLayout();
		card.show(Painel, "cadastra_item");
	}

	private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {
		CardLayout card = (CardLayout) Painel.getLayout();
		card.show(Painel, "login");
		JOptionPane.showMessageDialog(rootPane, "Voce saiu do sistema.");
		limpaTelaLogin();
		gerenciador.setLogado(null);
	}

	private void jButtonVoltar2ActionPerformed(java.awt.event.ActionEvent evt) {
		CardLayout card = (CardLayout) Painel.getLayout();
		card.show(Painel, "logado");
	}

	private void jButtonVisualizar_perfil1ActionPerformed(
			java.awt.event.ActionEvent evt) {
		CardLayout card = (CardLayout) Painel.getLayout();
		card.show(Painel, "visualizar_perfil");
		jTextFieldPerfil_Nome.setText(Gerencia.getLogado().getNome());
		jTextFieldPerfil_Email.setText(Gerencia.getLogado().getEmail());
		jTextFieldPerfil_Endereco
				.setText(Gerencia.getLogado().getEndereco());
		System.out.println(Gerencia.getLogado().getListaDeItens());
	}

	private void jTextField_Cadastra_NomeItemActionPerformed(
			java.awt.event.ActionEvent evt) {
	}

	private void jButtonVoltar3ActionPerformed(java.awt.event.ActionEvent evt) {
		CardLayout card = (CardLayout) Painel.getLayout();
		card.show(Painel, "logado");
	}

	private void jButtonVoltar4ActionPerformed(java.awt.event.ActionEvent evt) {
		CardLayout card = (CardLayout) Painel.getLayout();
		card.show(Painel, "logado");
	}

	private void jButtonVisualizar_itensActionPerformed(
			java.awt.event.ActionEvent evt) {
		CardLayout card = (CardLayout) Painel.getLayout();
		card.show(Painel, "itens_sistema");

		Livro outroLivro = null;

		javax.swing.JPanel jPanelPainelDeItensNoSistema1 = new javax.swing.JPanel();
		jPanelPainelDeItensNoSistema1.setLayout(new java.awt.GridLayout(1, 0));
		jScrollPanePainelDeItensNoSistema
				.setViewportView(jPanelPainelDeItensNoSistema1);
		
		for (String chave : gerenciador.getItens().keySet()) {
			Item c = gerenciador.getItens().get(chave);
			System.out.println(c.toString());
			jPanelPainelDeItensNoSistema1.setLayout(new java.awt.GridLayout(
					gerenciador.getItens().size(), WIDTH));

			if (c instanceof Livro) {

				outroLivro = (Livro) c;
			}

			jPanelPainelDeItensNoSistema1.add(new Livros(outroLivro));
		}

	}

	@SuppressWarnings("unused")
	private void jButtonItemActionPerformed(java.awt.event.ActionEvent evt) {
		CardLayout card = (CardLayout) Painel.getLayout();
		card.show(Painel, "visualizar_perfil_livro");
	}

	private void jButtonVoltar5ActionPerformed(java.awt.event.ActionEvent evt) {
		CardLayout card = (CardLayout) Painel.getLayout();
		card.show(Painel, "logado");
	}

	private void jTextField_Titulo_LivroActionPerformed(
			java.awt.event.ActionEvent evt) {
	}

	private void jButtonCadastrar_itemActionPerformed(
			java.awt.event.ActionEvent evt) {

		try {
			Livro novoLivro = new Livro(jTextField_Cadastra_NomeItem.getText(),
					jTextField_Cadastra_NomeAutor.getText(),
					jTextField_Cadastra_Editora.getText(),
					jTextField_Cadastra_Genero.getText(),
					jTextField_Cadastra_Versao1.getText());
			novoLivro.setUsuarioAtual(Gerencia.getLogado());
			if (gerenciador.adicionaLivro(novoLivro)) {
				JOptionPane.showMessageDialog(rootPane,
						"Livro cadastrado com sucesso!");
				CardLayout card = (CardLayout) Painel.getLayout();
				card.show(Painel, "logado");
			} else {
				JOptionPane.showMessageDialog(rootPane,
						"Livro já cadastrado no sistema!");
			}

		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, e.getMessage(), "Erro", -1);
		}
	}

	private void formWindowClosing(java.awt.event.WindowEvent evt) {
		gerenciador.serializar();
		System.out.print("ok");
	}

	private void jLabelFoto_Item_PerfilMouseClicked(
			java.awt.event.MouseEvent evt) {

		JFileChooser escolheImagem = new JFileChooser();
		escolheImagem.showOpenDialog(this);
		jLabelFoto_Item_Perfil.setIcon(new ImageIcon(escolheImagem
				.getSelectedFile().getAbsolutePath()));

	}

	private void jButtonFavoritarItemActionPerformed(
			java.awt.event.ActionEvent evt) {

		String valorFavorito = JOptionPane
				.showInputDialog("Favorite este item entre 1 e 5.");
		try {
			itemCarregado.favoritar(Integer.parseInt(valorFavorito));
			jTextField_Media_Item.setText("Media: "
					+ itemCarregado.getEstrelas());
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(this, ex.getMessage(), "Erro", -1);
		}

	}

	private void jButtonVoltar6ActionPerformed(java.awt.event.ActionEvent evt) {
		CardLayout card = (CardLayout) Painel.getLayout();
		card.show(Painel, "visualizar_perfil");
	}

	private void ItensUsuarioActionPerformed(java.awt.event.ActionEvent evt) {
		CardLayout card = (CardLayout) Painel.getLayout();
		card.show(Painel, "ItensDoUsuario");

		Livro outroLivro = null;
		
		javax.swing.JPanel jPanelItensDoUsuario = new javax.swing.JPanel();
		jPanelItensDoUsuario.setLayout(new java.awt.GridLayout(1, 0));
		ItensUsuarioScrollPainel.setViewportView(jPanelItensDoUsuario);

		for (String chave : Gerencia.getLogado().getListaDeItens()) {
			Item c = gerenciador.getItens().get(chave);

			jPanelItensDoUsuario.setLayout(new java.awt.GridLayout(Gerencia
					.getLogado().getListaDeItens().size(), WIDTH));

			if (c instanceof Livro) {
				outroLivro = (Livro) c;
			}

			jPanelItensDoUsuario.add(new Livros(outroLivro));
		}
	}

	private void EditarInformacoesUsuarioActionPerformed(
			java.awt.event.ActionEvent evt) {
		SalvarInformacoesUsuario.setEnabled(true);
		jTextFieldPerfil_Endereco.setEditable(true);
		jTextFieldPerfil_Nome.setEditable(true);
	}

	private void Mudar_senhaActionPerformed(java.awt.event.ActionEvent evt) {
		JPasswordField novaSenha = new JPasswordField();
		JOptionPane.showConfirmDialog(null, novaSenha,
				"Digite sua nova senha", JOptionPane.OK_CANCEL_OPTION,
				JOptionPane.PLAIN_MESSAGE);
		String password = new String(novaSenha.getPassword());

		try {
			Gerencia.getLogado().setSenha(password);
			JOptionPane.showMessageDialog(rootPane,
					"Senha alterada com sucesso!");
		} catch (Exception ex) {

			password = JOptionPane
					.showInputDialog("Senha invalida, digite novamente");

			JOptionPane.showMessageDialog(this, ex.getMessage(), "Erro", -1);
		}
	}

	private void HistoricoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {
		JOptionPane.showMessageDialog(rootPane, Gerencia.getLogado()
				.getHistorico());

	}

	private void SalvarInformacoesUsuarioActionPerformed(
			java.awt.event.ActionEvent evt) {
		try {

			Gerencia.getLogado().setEndereco(
					jTextFieldPerfil_Endereco.getText());
			Gerencia.getLogado().setNome(jTextFieldPerfil_Nome.getText());
			JOptionPane.showMessageDialog(rootPane,
					"Alteracoes realizadas com sucesso!");
		} catch (Exception ex) {

			JOptionPane.showMessageDialog(this, ex.getMessage(), "Erro", -1);
		}
		jTextFieldPerfil_Nome.setEditable(false);
		jTextFieldPerfil_Endereco.setEditable(false);
		SalvarInformacoesUsuario.setEnabled(false);

	}

	private void jButtonVoltar7ActionPerformed(java.awt.event.ActionEvent evt) {
		CardLayout card = (CardLayout) Painel.getLayout();
		card.show(Painel, "logado");
	}

	private void HistoricoLivroActionPerformed(java.awt.event.ActionEvent evt) {
		JOptionPane.showMessageDialog(rootPane,
				itemCarregado.getHistoricoItem());
	}

	private void jButtonPegarEmprestadoActionPerformed(
			java.awt.event.ActionEvent evt) {

		if (itemCarregado.isDisponivel()) {
			try {
				gerenciador.pegarItem(itemCarregado.getNome());
				JOptionPane.showMessageDialog(rootPane,
						"Item emprestado com sucesso!");
				itemCarregado.setDisponivel(false, Gerencia.getLogado());
			} catch (Exception ex) {
				JOptionPane
						.showMessageDialog(this, ex.getMessage(), "Erro", -1);
			}
		} else {
			JOptionPane.showMessageDialog(rootPane,
					"Item não disponível para emprestimo!");
		}

	}

	private void jButtonExcluir_ContaActionPerformed(
			java.awt.event.ActionEvent evt) {
		if (gerenciador.deletarConta()) {
			JOptionPane.showMessageDialog(rootPane,
					"Conta Deletada com sucesso!");
			CardLayout card = (CardLayout) Painel.getLayout();
			card.show(Painel, "login");
			limpaTelaLogin();
			gerenciador.setLogado(null);
		} else {
			String email = JOptionPane
					.showInputDialog("Voce n�o pode deletar sua conta se tiver itens \n informe um e-mail para doar os seus itens!");
			try {
				gerenciador.doarTodosOsItens(email);
			} catch (Exception ex) {
				Logger.getLogger(Painel.class.getName()).log(Level.SEVERE,
						null, ex);
			}
		}
	}

	private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {
		CardLayout card = (CardLayout) Painel.getLayout();
		card.show(Painel, "Pesquisa");
		String nomePesquisar = jTextFieldPesquisar.getText();
		List<Livro> listaPesquisa = new ArrayList<>();

		int tipo = jComboBox1.getSelectedIndex();

		if (tipo == 0) {
			listaPesquisa = gerenciador.pesquisaLivrosPorNome(nomePesquisar);
		}
		if (tipo == 1) {
			listaPesquisa = gerenciador.pesquisaLivrosPorAutor(nomePesquisar);
		}
		if (tipo == 2) {
			listaPesquisa = gerenciador.pesquisaLivrosPorEditora(nomePesquisar);
		}
		if (tipo == 3) {
			listaPesquisa = gerenciador.pesquisaLivrosPorGenero(nomePesquisar);
		}

		Livro outroLivro = null;

		javax.swing.JPanel jPanelItensPesquisa = new javax.swing.JPanel();
		jPanelItensPesquisa.setLayout(new java.awt.GridLayout(1, 0));
		PesquisaScrollPainel.setViewportView(jPanelItensPesquisa);

		for (Item livro : listaPesquisa) {
			Item c = livro;

			jPanelItensPesquisa.setLayout(new java.awt.GridLayout(listaPesquisa
					.size(), WIDTH));

			if (c instanceof Livro) {

				outroLivro = (Livro) c;
			}

			jPanelItensPesquisa.add(new Livros(outroLivro));

		}

		if (tipo == 4) {

			List<Usuario> listadeUsuario = new ArrayList<>();

			listadeUsuario = gerenciador
					.pesquisaUsuariosPeloNome(nomePesquisar);
			javax.swing.JPanel jPanelItensPesquisa2 = new javax.swing.JPanel();
			jPanelItensPesquisa2.setLayout(new java.awt.GridLayout(1, 0));
			PesquisaScrollPainel.setViewportView(jPanelItensPesquisa2);

			for (Usuario usuario : listadeUsuario) {
				Usuario c = usuario;
				jPanelItensPesquisa2.setLayout(new java.awt.GridLayout(
						listadeUsuario.size(), WIDTH));

				jPanelItensPesquisa2.add(new Usuarios(c));

			}

		}

		if (tipo == 5) {
			List<Usuario> listadeUsuario = new ArrayList<>();

			listadeUsuario = gerenciador
					.pesquisaUsuariosPeloEmail(nomePesquisar);

			javax.swing.JPanel jPanelItensPesquisa1 = new javax.swing.JPanel();
			jPanelItensPesquisa1.setLayout(new java.awt.GridLayout(1, 0));
			PesquisaScrollPainel.setViewportView(jPanelItensPesquisa1);

			for (Usuario usuario : listadeUsuario) {
				Usuario c = usuario;
				jPanelItensPesquisa1.setLayout(new java.awt.GridLayout(
						listadeUsuario.size(), WIDTH));
				jPanelItensPesquisa1.add(new Usuarios(c));
			}
		}
	}

	private void RankingButtonActionPerformed(java.awt.event.ActionEvent evt) {
		CardLayout card = (CardLayout) Painel.getLayout();
		card.show(Painel, "Visualiza_Top5");

		preencheListaTOP5Itens();
		preencheListaTOP5Usuarios();
	}

	private void jButtonVoltar8ActionPerformed(java.awt.event.ActionEvent evt) {
		CardLayout card = (CardLayout) Painel.getLayout();
		card.show(Painel, "logado");
	}

	private void jButtonDisponivelActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			itemCarregado.setDisponivel(true, Gerencia.getLogado());
			JOptionPane.showMessageDialog(rootPane, "Item disponível!");
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(this, ex.getMessage(), "Erro", -1);
		}
	}

	private void jButtonUsuarios_SistemaActionPerformed(
			java.awt.event.ActionEvent evt) {
		CardLayout card = (CardLayout) Painel.getLayout();
		card.show(Painel, "usuarios_sistema");

		javax.swing.JPanel jPanelPainelDeUsuarios = new javax.swing.JPanel();
		jPanelPainelDeUsuarios.setLayout(new java.awt.GridLayout(1, 0));
		jScrollPanePainelDeItensNoSistema1
				.setViewportView(jPanelPainelDeUsuarios);
		// exibe itens do sistema
		for (String chave : gerenciador.getCadastros().keySet()) {
			Usuario c = gerenciador.getCadastros().get(chave);
			jPanelPainelDeUsuarios.setLayout(new java.awt.GridLayout(
					gerenciador.getCadastros().size(), WIDTH));

			jPanelPainelDeUsuarios.add(new Usuarios(c));
		}

	}

	private void jButtonVoltar9ActionPerformed(java.awt.event.ActionEvent evt) {
		CardLayout card = (CardLayout) Painel.getLayout();
		card.show(Painel, "logado");
	}

	public static void main(String args[]) {

		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
					.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Painel.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Painel.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Painel.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Painel.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		}
		
		java.awt.EventQueue.invokeLater(new Runnable() {

			public void run() {
				try {
					new Painel().setVisible(true);
				} catch (Exception ex) {
					ex.printStackTrace();
				}

			}
		});
	}

	public static void mudarTela(Livro l) {
		jTextField_Livro_Autor.setText(l.getAutor());
		jTextField_Livro_Editora.setText(l.getEditora());
		jTextField_Livro_Genero.setText(l.getGenero());
		jTextField_Livro_Versao.setText(l.getVersao());
		jTextField_Titulo_Livro.setText(l.getNome());
		jTextField_Media_Item.setText("Media: " + l.getEstrelas());
		jTextField_Media_Item.setOpaque(false);
		CardLayout card = (CardLayout) Painel.getLayout();
		card.show(Painel, "visualizar_perfil_livro");

		setItemCarregado(l);

	}

	public static void mudarTela(Usuario usuario) {
		jTextFieldPerfil_Nome.setText(usuario.getNome());
		jTextFieldPerfil_Email.setText(usuario.getEmail());
		jTextFieldPerfil_Endereco.setText(usuario.getEndereco());
		CardLayout card = (CardLayout) Painel.getLayout();
		card.show(Painel, "visualizar_perfil");

	}

	public static CardLayout getCardLayout() {
		return card;
	}

	public static CardLayout card;

	public static Item getItemCarregado() {
		return itemCarregado;
	}

	public static void setItemCarregado(Livro novoItemCarregado) {
		itemCarregado = novoItemCarregado;
	}

	public void limpaTelaLogin() {

		jTextFieldLogin.setText("exemplo@gmail.com");
		jPasswordFieldSenha.setText(null);

	}

	public void limpaTelaCadastroUsuario() {

		jTextFieldNome.setText(null);
		jPasswordFieldCadastro_Senha.setText(null);
		jPasswordFieldCadastro_ConfirmaSenha.setText(null);
		jTextFieldCadastro_Email.setText(null);
		jTextFieldCadastro_ConfirmaEmail.setText(null);
		jTextFieldCadastro_Endereco.setText(null);

	}

	public void limpaTelaCadastraItem() {

		jTextField_Cadastra_NomeItem.setText(null);
		jTextField_Cadastra_NomeAutor.setText(null);
		jTextField_Cadastra_Editora.setText(null);
		jTextField_Cadastra_Genero.setText(null);
		jTextField_Cadastra_Versao1.setText(null);

	}

	public static Gerencia getGerenciador() {
		return gerenciador;
	}

	@SuppressWarnings("unchecked")
	public void preencheListaTOP5Itens() {

		DefaultListModel<String> model = new DefaultListModel<>();

		for (int i = 0; i < gerenciador.getRelatorios()
				.imprimeTop5ItensFavoritos(gerenciador.getItens()).size(); i++) {

			model.addElement(gerenciador.getRelatorios()
					.imprimeTop5ItensFavoritos(gerenciador.getItens()).get(i));

		}

		jListTOPItens.setModel(model);

	}

	@SuppressWarnings("unchecked")
	public void preencheListaTOP5Usuarios() {

		DefaultListModel<String> model = new DefaultListModel<>();

		for (int i = 0; i < gerenciador.getRelatorios()
				.imprimeTop5Usuarios(gerenciador.getCadastros()).size(); i++) {

			model.addElement(gerenciador.getRelatorios()
					.imprimeTop5Usuarios(gerenciador.getCadastros()).get(i));

		}

		jListTOPUsuarios.setModel(model);

	}

}