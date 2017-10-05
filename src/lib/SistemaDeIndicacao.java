package lib;

import java.io.Serializable;

/**
 * Sistema de indicação de itens, onde proporciona iteracao entre usuarios da
 * biblioteca.
 * 
 */

public class SistemaDeIndicacao implements Serializable {

	private static final long serialVersionUID = 1L;

	private final Item ITEM;
	private final String MENSAGEM;
	private final Usuario INDICADOR;

	/**
	 * Construtor de uma indicacao
	 * 
	 * @param indicador
	 *            - Eh o usuario que está enviando a indicacao do item.
	 * @param receptor
	 *            - O usuario que vai receber a indicacao.
	 * @param item
	 *            - Objeto do tipo Item a ser indicado.
	 * @param mensagem
	 *            - Mensagem opcional para a indicao.
	 */

	public SistemaDeIndicacao(Usuario indicador, Item item, String mensagem) {
		this.INDICADOR = indicador;
		this.ITEM = item;
		this.MENSAGEM = mensagem;
	}

	/**
	 * Recupera o usuario que indicou o item
	 * 
	 * @return O Usuario
	 */

	public Usuario getINDICADOR() {
		return INDICADOR;
	}

	/**
	 * Recupera o item indicado
	 * 
	 * @return Objeto do tipo Item
	 */

	public Item getITEM() {
		return ITEM;
	}

	/**
	 * Argumentos expressados pelo indicador, do porque dele estar indicando o
	 * Item
	 * 
	 * @return String - mensagem
	 */

	public String getMENSAGEM() {
		return MENSAGEM;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */

	@Override
	public String toString() {
		return "Sr(a) " + INDICADOR + ", indicou o item " + ITEM
				+ " para voce.\n" + "Mensagem : " + MENSAGEM;
	}

}