package br.com.pablo.model;

import java.util.ArrayList;
import java.util.List;

public class Estacionamento {
	private String nome_estacionamento;
	private List<Carro> lista_carros;
	
	public Estacionamento(String nome_estacionamento) {
		this.nome_estacionamento = nome_estacionamento;
		this.lista_carros = new ArrayList<>();
	}

	public String getNome_estacionamente() {
		return nome_estacionamento;
	}

	public void adicionaCarro(String cor_carro, String placa_carro, Integer velocidade_carro) {
		Carro carro = new Carro(cor_carro, placa_carro, velocidade_carro);
		lista_carros.add(carro);
	}
	
	public void exibirListaDeCarros() {
		for(Carro carro : lista_carros) {
			System.out.println(carro);
		}
	}
}
