package br.com.pablo.main;

import br.com.pablo.model.Estacionamento;

public class Program {

	public static void main(String[] args) {
		Estacionamento estacionamento1 = new Estacionamento("Estacionamento Shopping Jockey Club");
		
		estacionamento1.adicionaCarro("Vermelho", "HYS-1816", 300);
		estacionamento1.adicionaCarro("Azul", "HUY-0038", 320);
		estacionamento1.adicionaCarro("Amarelo", "HUW-6164", 340);
		estacionamento1.adicionaCarro("Verde", "HWE-2856", 360);
		estacionamento1.adicionaCarro("Preto", "HUT-3400", 380);
		estacionamento1.adicionaCarro("Prata", "HXU-3764", 340);
		estacionamento1.adicionaCarro("Laranja", "HUF-0797", 300);
		
		estacionamento1.exibirListaDeCarros();
	}

}
