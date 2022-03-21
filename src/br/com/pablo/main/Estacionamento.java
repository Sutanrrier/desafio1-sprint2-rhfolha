package br.com.pablo.main;

import br.com.pablo.entities.Carro;

public class Estacionamento {

	public static void main(String[] args) {
		//Carros
		Carro carro1 = new Carro("Vermelho", "HYS-1816", 300);
		Carro carro2 = new Carro("Azul", "HUY-0038", 320);
		Carro carro3 = new Carro("Amarelo", "HUW-6164", 340);
		Carro carro4 = new Carro("Verde", "HWE-2856", 360);
		Carro carro5 = new Carro("Preto", "HUT-3400", 380);
		Carro carro6 = new Carro("Prata", "HXU-3764", 340);
		Carro carro7 = new Carro("Laranja", "HUF-0797", 300);
		
		//Listagem de carros
		System.out.println("Listagem de Carros no Estacionamento");
		System.out.println(carro1);
		System.out.println(carro2);
		System.out.println(carro3);
		System.out.println(carro4);
		System.out.println(carro5);
		System.out.println(carro6);
		System.out.println(carro7);
	}

}
