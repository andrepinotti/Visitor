package br.com.visitor;

public class ValorSiteVisitor implements Visitor {

	public double visit(Produto produto) {
		return produto.getPreco() + produto.getTaxa() + produto.getValorFrete();
	}
	
	
}
