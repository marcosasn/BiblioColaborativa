package ui;

import lib.Usuario;

/**
 * 
 * @author icaro
 */
public class Usuarios extends javax.swing.JPanel {

	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unused")
	private Usuario usuario;

	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JTextField jTextFieldEmail;
	private javax.swing.JTextField jTextFieldEndereco;
	private javax.swing.JTextField jTextFieldNome;

	public Usuarios(Usuario u) {
		this.usuario = u;
		initComponents();

		jTextFieldNome.setText(u.getNome());
		jTextFieldEmail.setText(u.getEmail());
		jTextFieldEndereco.setText(u.getEndereco());
	}

	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jTextFieldNome = new javax.swing.JTextField();
		jTextFieldEmail = new javax.swing.JTextField();
		jTextFieldEndereco = new javax.swing.JTextField();

		setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(-16777216, true)));
		addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				formMouseClicked(evt);
			}
		});

		jLabel1.setText("Nome:");

		jLabel2.setText("Email:");

		jLabel3.setText("Endereço:");

		jTextFieldNome.setBackground(new java.awt.Color(-1, true));
		jTextFieldNome.setEditable(false);
		jTextFieldNome.setOpaque(false);

		jTextFieldEmail.setBackground(new java.awt.Color(-1, true));
		jTextFieldEmail.setEditable(false);
		jTextFieldEmail.setOpaque(false);

		jTextFieldEndereco.setBackground(new java.awt.Color(-1, true));
		jTextFieldEndereco.setEditable(false);
		jTextFieldEndereco.setOpaque(false);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jLabel3)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		jTextFieldEndereco,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		458,
																		Short.MAX_VALUE))
												.addGroup(
														layout.createSequentialGroup()
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING,
																				false)
																				.addComponent(
																						jLabel2,
																						javax.swing.GroupLayout.Alignment.LEADING,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						Short.MAX_VALUE)
																				.addComponent(
																						jLabel1,
																						javax.swing.GroupLayout.Alignment.LEADING,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						Short.MAX_VALUE))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING)
																				.addComponent(
																						jTextFieldNome,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						484,
																						Short.MAX_VALUE)
																				.addComponent(
																						jTextFieldEmail,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						484,
																						Short.MAX_VALUE))))
								.addContainerGap()));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														jLabel1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														26,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jTextFieldNome,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														22,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(
														jLabel2,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														26,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jTextFieldEmail,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														22,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(
														jLabel3,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														26,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jTextFieldEndereco,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														22,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addContainerGap(
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)));
	}

	private void formMouseClicked(java.awt.event.MouseEvent evt) {
	}

}
