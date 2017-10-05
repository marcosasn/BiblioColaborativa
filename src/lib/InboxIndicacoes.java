package lib;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe desenvolvida para gerenciar o sistema de indicacao de item.
 * 
 * @author Icaro Forte, Marcos Antonio, Rayssa Naianny, Wandson Allys
 * 
 */
public class InboxIndicacoes implements Serializable {

	private static final long serialVersionUID = 1L;
	private List<SistemaDeIndicacao> inbox;

	/**
	 * Construtor das indicacoes do sistema.
	 */
	public InboxIndicacoes() {
		inbox = new ArrayList<SistemaDeIndicacao>();
	}

	/**
	 * Recebe uma indicacao correspondente a um item.
	 * 
	 * @param indicacao
	 *            A indicacao que compreende o usuario que ira indicar, o item e
	 *            a mensagem.
	 * @throws Exception
	 *             Se a indicacao for vazia ou nula.
	 */
	public void recebeIndicacao(SistemaDeIndicacao indicacao) throws Exception {
		isIndicacaoValida(indicacao);
		inbox.add(indicacao);
	}

	/**
	 * Remove a indicacao correspondente a um item.
	 * 
	 * @param indicacao
	 *            A indicacao que compreende o usuario que ira indicar, o item e
	 *            a mensagem.
	 * @throws Exception
	 *             Se a indicacao for vazia ou nula.
	 */
	public void removeIndicacao(SistemaDeIndicacao indicacao) throws Exception {
		isIndicacaoValida(indicacao);
		inbox.remove(indicacao);
	}

	/**
	 * Verifica se a indicacao tem informacoes validas.
	 * 
	 * @param indicacao
	 *            A indicacao que compreende o usuario que ira indicar, o item e
	 *            a mensagem.
	 * @throws Exception
	 *             Se a indicacao for vazia ou nula.
	 */
	private void isIndicacaoValida(SistemaDeIndicacao indicacao)
			throws Exception {
		if (indicacao == null)
			throw new Exception("Indicacao nao pode ser vazia o nula");
	}

	/**
	 * Gera o relatorio das indicacoes realizadas no sistema.
	 * 
	 * @return O string referente as indicacoes realizadas no sistema.
	 */
	private String relatorioDeIndicacoes() {
		String relatorio = "";
		for (SistemaDeIndicacao indicacao : inbox) {
			relatorio += indicacao.getINDICADOR() + " indicou o item "
					+ indicacao.getITEM().getNome() + "\n";
		}
		return relatorio;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return relatorioDeIndicacoes();
	}

}