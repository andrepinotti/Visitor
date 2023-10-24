package br.com.visitor;

public class ValorEntrega implements Visitor {
	
	public double visit(Produto produto) {
		return produto.getPreco() + produto.getValorFrete();
	}
	
}
