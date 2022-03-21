package br.com.pablo.entities;

public class Carro {
	private String cor, placa;
	private int velocidade_maxima;
	
	public Carro(String cor, String marca, int velocidade_maxima) {
		this.cor = cor;
		this.placa = marca;
		this.velocidade_maxima = velocidade_maxima;
	}
	
	public String toString() {
		return "Placa: " + placa
				+ " | Cor: " + cor
				+ " | Velocidade Máxima: " + velocidade_maxima;
	}
	
}
