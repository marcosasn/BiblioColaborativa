package ui;

import lib.Gerencia;

public class Sistema2 {

	public static Painel painel;
	private static Gerencia gerenciador;

	public static void main(String[] args) throws Exception {
		gerenciador = new Gerencia();
		gerenciador.deserializar();
		painel = new Painel();
		painel.setVisible(true);
	}

	public static Painel getPainel() {
		return painel;
	}
}
