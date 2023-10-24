package br.com.visitor;

public class Main {
	
	public static void main(String[] args) {
		
		Produto produto = new Produto("Teclado Gamer", 535.50, 23, 4);
		
		//Instanciando os visitors concretos 
		ValorLojaVisitor valorLoja = new ValorLojaVisitor();
		ValorEntrega valorEntrega = new ValorEntrega();
		ValorSiteVisitor valorSite = new ValorSiteVisitor();
		
		System.out.println("Preço direto da loja: "+produto.accept(valorLoja));
		System.out.println("Preço com entrega: "+produto.accept(valorEntrega));
		System.out.println("Preço do site: "+produto.accept(valorSite));
		
	}
	
	
	
}
