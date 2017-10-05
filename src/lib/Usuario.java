package lib;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe desenvolvida para criacao de um usuario e que implementa as interfaces
 * Comparable e Serializable.
 * 
 * @author Icaro Forte, Marcos Antonio, Rayssa Naianny, Wandson Allys
 */
public class Usuario implements Comparable<Usuario>, Serializable {

	private static final long serialVersionUID = 1L;

	private String nome;
	private String senha;
	private String email;
	private String endereco;
	private String historico;
	private int qtdDeItens = 0;
	private List<String> listaDeItens;
	private InboxIndicacoes inbox;

	/**
	 * Construtor de um usuario a partir de argumentos como nome, senha, email e
	 * endereco.
	 * 
	 * @param nome
	 *            O nome do usuario.
	 * @param senha
	 *            A senha do usuario.
	 * @param email
	 *            O email do usuario.
	 * @param endereco
	 *            O endereÃ§o do usuario.
	 * @throws Exception
	 *             Se o qualquer um dos paramentros forem iguais a null ou
	 *             vazio, nome possuir valores que não sejam letras, senha ter
	 *             tamanho inferior a 6 termos e email possuir um dominio
	 *             invalido.
	 * 
	 */
	public Usuario(String nome, String senha, String email, String endereco)
			throws Exception {
		isNomeValido(nome);
		isSenhaValida(senha);
		isEmailValido(email);
		isEnderecoValido(endereco);
		listaDeItens = new ArrayList<String>();
		inbox = new InboxIndicacoes();
		historico = "";
	}

	/**
	 * Verifica se o nome do usuario e valido.
	 * 
	 * @param nome
	 *            O nome do usuario.
	 * @throws Exception
	 *             Se o nome for igual a vazio ou null, possuir valores
	 *             diferentes de letras.
	 */
	private void isNomeValido(String nome) throws Exception {
		if (nome == null || nome.trim().equals(""))
			throw new Exception("nome nao pode ser vazio ou nulo");
		if (!(nome.matches("[A-Za-zÇ-ú\\s]*+")))
			throw new Exception("paramentros incorretos");
		this.nome = nome;
	}

	/**
	 * Verifica se o endereco do usuario e valido.
	 * 
	 * @param endereco
	 *            O endereco do usuario.
	 * @throws Exception
	 *             Se o endereco for igual a vazio ou null.
	 */
	private void isEnderecoValido(String endereco) throws Exception {
		if (endereco == null || endereco.trim().equals(""))
			throw new Exception("endereco nao pode ser vazio ou nulo");
		this.endereco = endereco;
	}

	/**
	 * Verifica se a senha do usuario e valida.
	 * 
	 * @param senha
	 *            A senha do cadastro do usuario.
	 * @throws Exception
	 *             Se a senha for vazia ou ter tamanho menor que 6.
	 */
	private void isSenhaValida(String senha) throws Exception {
		if (senha == null || senha.trim().equals("")) {
			throw new Exception("senha nao pode ser vazio ou nulo");
		}
		if (senha.length() < 6) {
			throw new Exception("senha nao pode ter tamanho menor que 6");
		}
		this.senha = senha;
	}

	/**
	 * Verifica se o email do usuario e valido.
	 * 
	 * @param email
	 *            O email do usuario.
	 * @throws Exception
	 *             Se o email e vazio ou null, possuir dominio invalido.
	 */
	private void isEmailValido(String email) throws Exception {
		if (email == null || email.trim().equals(""))
			throw new Exception("email nao pode ser vazio ou nulo");
		if (!(email
				.matches("^[\\w-]+(\\.[\\w-]+)*@([\\w-]+\\.)+[a-zA-Z]{2,7}$") || email
				.matches("[\\w_.]+@\\w+[..](com|com[.-.]br)")))
			throw new Exception("dominio do email eh invalido");
		this.email = email;
	}

	/**
	 * Recupera a quantidade de itens.
	 * 
	 * @return int - inteiro que correspondente a quantidade de itens do
	 *         historico do usuario.
	 */
	public int getQtdDeItens() {
		return qtdDeItens;
	}

	/**
	 * Recupera o historico do usuario.
	 * 
	 * @return String - O historico do usuario.
	 */
	public String getHistorico() {
		return historico;
	}

	/**
	 * Recupera o enedereco do usuario.
	 * 
	 * @return String - O endereco do usuario.
	 */
	public String getEndereco() {
		return endereco;
	}

	/**
	 * Recupera uma lista de itens.
	 * 
	 * @return List<String> - lista de itens.
	 */
	public List<String> getListaDeItens() {
		return listaDeItens;
	}

	/**
	 * Recupera o nome do usuario.
	 * 
	 * @return String - nome do usuario.
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Altera o nome do usuario.
	 * 
	 * @param nome
	 *            - novo nome do usuario.
	 * @throws Exception
	 *             - lanca exceção para nome vazio ou nulo e também possuir
	 *             valores diferentes de letras. Ex: Maria13, JoséDeSouza25,
	 *             Luana :*
	 */

	public void setNome(String nome) throws Exception {
		isNomeValido(nome);
	}

	/**
	 * Recupera o email do usuario.
	 * 
	 * @return String - email do usuario.
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Recupera a senha do usuario.
	 * 
	 * @return String - senha do usuario.
	 */
	public String getSenha() {
		return senha;
	}

	/**
	 * Modifica a senha de cadastro do usuario.
	 * 
	 * @param senha
	 *            A senha do cadastro.
	 * @throws Exception
	 *             lança excecao caso a senha seja vazia ou nula, e também
	 *             possuir tamanho menor que 6.
	 */
	public void setSenha(String senha) throws Exception {
		isSenhaValida(senha);
	}

	/**
	 * Modifica o endereco do usuario.
	 * 
	 * @param endereco
	 *            O endereco do usuario.
	 * @throws Exception
	 *             Se o endereco for igual a vazio ou null.
	 */
	public void setEndereco(String endereco) throws Exception {
		isEnderecoValido(endereco);
	}

	/**
	 * Remove item da lista de itens.
	 * 
	 * @param nome
	 *            O string com o nome do item.
	 */
	public void removeItem(String nome) {
		if (listaDeItens.contains(nome)) {
			listaDeItens.remove(nome);
		}
	}

	/**
	 * Adiciona item a lista de itens.
	 * 
	 * @param nome
	 *            O nome do item.
	 * @throws Exception - lanca excecao caso o Objeto Item seja null
	 */
	public void adicionaItem(Item item) throws Exception {
		if (item == null) {
			throw new Exception("item nao pode ser nulo");
		}
		listaDeItens.add(item.getNome());
		geraHistoricoUsuario(item);
		qtdDeItens++;
	}

	/**
	 * Gera o historico do item que o usuario possui.
	 * 
	 * @param item
	 *            O item do sistema.
	 */
	public void geraHistoricoUsuario(Item item) {
		historico += "Nome = " + item.getNome() + " Data = "
				+ item.dataFormatada() + "\n";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Usuario [Nome = " + getNome() + ", Email = " + getEmail()
				+ ", Endereco = " + getEndereco() + "]";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Usuario) {
			Usuario objeto = (Usuario) obj;
			return getEmail().equals(objeto.getEmail());
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Usuario user) {
		if (getQtdDeItens() > user.getQtdDeItens())
			return 1;
		else if (getQtdDeItens() < user.getQtdDeItens())
			return -1;
		return 0;
	}

	/**
	 * Recupera o Inbox do usuario.
	 * 
	 * @return InboxIndicacoes - indicações de itens feita por outros usuarios.
	 */

	public InboxIndicacoes getInbox() {
		return inbox;
	}

}
