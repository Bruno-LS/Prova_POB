package Loja;

import java.util.ArrayList;
import java.util.List;

public class Produto {
    private int id;
    private String codigoBarras;
    private String nome;
    private String descricao;
    private String categoria;
    private double preco;
    private double peso;
    private String fabricante;

    
    // Construtora
    public Produto(int id, String codigoBarras, String nome, String descricao, String categoria, double preco, double peso, String fabricante) {
        this.id = id;
        this.codigoBarras = codigoBarras;
        this.nome = nome;
        this.descricao = descricao;
        this.categoria = categoria;
        this.preco = preco;
        this.peso = peso;
        this.fabricante = fabricante;
    }


	public int getId() {
		return id;
	}


	public String getCodigoBarras() {
		return codigoBarras;
	}


	public String getNome() {
		return nome;
	}


	public String getDescricao() {
		return descricao;
	}


	public String getCategoria() {
		return categoria;
	}


	public double getPreco() {
		return preco;
	}


	public double getPeso() {
		return peso;
	}


	public String getFabricante() {
		return fabricante;
	}
    
    
}
    
    