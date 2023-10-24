package br.com.visitor;

public class ValorLojaVisitor implements Visitor {

	public double visit(Produto produto) {
		return produto.getPreco();
		
	}

	
	
}
