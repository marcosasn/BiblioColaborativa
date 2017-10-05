package ui;

import lib.Livro;

public class Livros extends javax.swing.JPanel {

	private static final long serialVersionUID = 1L;
	private javax.swing.JLabel Autor;
	private javax.swing.JLabel Editora1;
	private javax.swing.JLabel Genero;
	private javax.swing.JLabel ImagemItem;
	private javax.swing.JLabel Media;
	private javax.swing.JLabel Titulo;
	private javax.swing.JButton jButtonInformacoes;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JTextField jTextField_Icon_Autor;
	private javax.swing.JTextField jTextField_Icon_Editora;
	private javax.swing.JTextField jTextField_Icon_Genero;
	private javax.swing.JTextField jTextField_Icon_Media;
	private javax.swing.JTextField jTextField_Icon_Titulo;

	private Livro livro;

	public Livros(Livro l) {
		this.livro = l;
		initComponents();
		jTextField_Icon_Titulo.setText(l.getNome());
		jTextField_Icon_Autor.setText(l.getAutor());
		jTextField_Icon_Editora.setText(l.getEditora());
		jTextField_Icon_Genero.setText(l.getGenero());
		jTextField_Icon_Media.setText(String.valueOf(l.getEstrelas()));
	}

	private void initComponents() {

		ImagemItem = new javax.swing.JLabel();
		Titulo = new javax.swing.JLabel();
		Autor = new javax.swing.JLabel();
		Genero = new javax.swing.JLabel();
		Editora1 = new javax.swing.JLabel();
		Media = new javax.swing.JLabel();
		jTextField_Icon_Titulo = new javax.swing.JTextField();
		jTextField_Icon_Autor = new javax.swing.JTextField();
		jTextField_Icon_Editora = new javax.swing.JTextField();
		jTextField_Icon_Genero = new javax.swing.JTextField();
		jTextField_Icon_Media = new javax.swing.JTextField();
		jButtonInformacoes = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();

		setBackground(new java.awt.Color(-1, true));
		setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(-16777216, true)));
		setToolTipText(livro.toString());
		setOpaque(false);
		addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				formMouseClicked(evt);
			}
		});

		ImagemItem.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/Imagens/leather-book-previewasdfghjklç.png"))); // NOI18N
		ImagemItem.setText("Imagem");

		Titulo.setText("Titulo: ");

		Autor.setText("Autor: ");

		Genero.setText("Genero: ");

		Editora1.setText("Editora: ");

		Media.setText("Media:");

		jTextField_Icon_Titulo.setEditable(false);
		jTextField_Icon_Titulo.setBorder(null);
		jTextField_Icon_Titulo.setOpaque(false);

		jTextField_Icon_Autor.setEditable(false);
		jTextField_Icon_Autor.setBorder(null);
		jTextField_Icon_Autor.setOpaque(false);

		jTextField_Icon_Editora.setEditable(false);
		jTextField_Icon_Editora.setBorder(null);
		jTextField_Icon_Editora.setOpaque(false);

		jTextField_Icon_Genero.setEditable(false);
		jTextField_Icon_Genero.setBorder(null);
		jTextField_Icon_Genero.setOpaque(false);

		jTextField_Icon_Media.setEditable(false);
		jTextField_Icon_Media.setBorder(null);
		jTextField_Icon_Media.setOpaque(false);

		jButtonInformacoes.setText("+ Detalhes");
		jButtonInformacoes
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						jButtonInformacoesActionPerformed(evt);
					}
				});

		jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/Imagens/Item_background_4.jpg")));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addGroup(
																						layout.createSequentialGroup()
																								.addGap(173,
																										173,
																										173)
																								.addComponent(
																										Media))
																				.addGroup(
																						layout.createSequentialGroup()
																								.addGap(43,
																										43,
																										43)
																								.addComponent(
																										ImagemItem,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										118,
																										javax.swing.GroupLayout.PREFERRED_SIZE))
																				.addGroup(
																						layout.createSequentialGroup()
																								.addGap(251,
																										251,
																										251)
																								.addComponent(
																										jTextField_Icon_Media,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										34,
																										javax.swing.GroupLayout.PREFERRED_SIZE)))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																		152,
																		Short.MAX_VALUE)
																.addComponent(
																		jButtonInformacoes,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		139,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(251,
																		251,
																		251)
																.addComponent(
																		jTextField_Icon_Titulo,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		179,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(169,
																		169,
																		169)
																.addComponent(
																		Autor,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		60,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addGap(22, 22,
																		22)
																.addComponent(
																		jTextField_Icon_Autor,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		179,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(169,
																		169,
																		169)
																.addComponent(
																		Genero,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		70,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(251,
																		251,
																		251)
																.addComponent(
																		jTextField_Icon_Editora,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		179,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(169,
																		169,
																		169)
																.addComponent(
																		Titulo))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(169,
																		169,
																		169)
																.addComponent(
																		Editora1,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		70,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(251,
																		251,
																		251)
																.addComponent(
																		jTextField_Icon_Genero,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		179,
																		javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addContainerGap())
				.addGroup(
						layout.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										588, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addGap(9, 9, 9)
																.addComponent(
																		jTextField_Icon_Titulo,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addGap(15, 15,
																		15)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						Autor,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						20,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addGroup(
																						layout.createSequentialGroup()
																								.addGap(3,
																										3,
																										3)
																								.addComponent(
																										jTextField_Icon_Autor,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)))
																.addGap(40, 40,
																		40)
																.addComponent(
																		Genero,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		20,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addGap(12, 12,
																		12)
																.addComponent(
																		Media))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(72, 72,
																		72)
																.addComponent(
																		jTextField_Icon_Editora,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(9, 9, 9)
																.addComponent(
																		Titulo))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(69, 69,
																		69)
																.addComponent(
																		Editora1,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		20,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(131,
																		131,
																		131)
																.addComponent(
																		jTextField_Icon_Media,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(
														layout.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																false)
																.addGroup(
																		layout.createSequentialGroup()
																				.addGap(102,
																						102,
																						102)
																				.addComponent(
																						jTextField_Icon_Genero,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addPreferredGap(
																						javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						Short.MAX_VALUE)
																				.addComponent(
																						jButtonInformacoes))
																.addGroup(
																		javax.swing.GroupLayout.Alignment.LEADING,
																		layout.createSequentialGroup()
																				.addGap(13,
																						13,
																						13)
																				.addComponent(
																						ImagemItem,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						149,
																						javax.swing.GroupLayout.PREFERRED_SIZE))))
								.addContainerGap(22, Short.MAX_VALUE))
				.addGroup(
						layout.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										184, Short.MAX_VALUE)));
	}

	private void formMouseClicked(java.awt.event.MouseEvent evt) {
		Painel.mudarTela(livro);
	}

	private void jButtonInformacoesActionPerformed(
			java.awt.event.ActionEvent evt) {
		Painel.mudarTela(livro);
	}

}
