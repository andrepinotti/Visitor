package br.com.visitor;

public class Produto {

	private String nome;
	private double preco, valorFrete, taxa;
	
	
	
	
	
	
	public Produto(String nome, double preco, double valorFrete, double taxa) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.valorFrete = valorFrete;
		this.taxa = taxa;
	}
	
	public Object accept(Visitor visitor) {
		return visitor.visit(this);
	}
	
	
	
	public String getNome() {
		
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public double getValorFrete() {
		return valorFrete;
	}
	public void setValorFrete(double valorFrete) {
		this.valorFrete = valorFrete;
	}
	public double getTaxa() {
		return taxa;
	}
	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	
}
