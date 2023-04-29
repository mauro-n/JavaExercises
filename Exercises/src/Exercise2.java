/*
 Fa�a um algoritmo que receba o pre�o de custo e o pre�o de venda de 40 produtos.
  Mostre como resultado se houve lucro, preju�zo ou empate para cada produto. 
  Informe o valor de custo de cada produto, o valor de venda de cada produto, a 
  m�dia de pre�o de custo e do pre�o de venda;
*/
import java.util.Scanner;
public class Exercise2 {
	Scanner strInput = new Scanner(System.in);
	Scanner doubleInput = new Scanner(System.in);
	
	private String produto;
	private double precoCusto;
	private double precoVenda;
	private double totalPrecoCusto = 0;
	private double totalPrecoVenda = 0;
	
	
	public void registerProduct(int qtd) {
		for (int i = 0; i < qtd; i++) {
			
			System.out.println("Insert the product name: ");
			this.produto = strInput.nextLine();
			System.out.println("Insert the product cost: ");
			this.precoCusto = doubleInput.nextDouble();
			System.out.println("Insert the product price: ");
			this.precoVenda = doubleInput.nextDouble();
			
			this.totalPrecoCusto += this.precoCusto;
			this.totalPrecoVenda += this.precoVenda;
			
			System.out.println("Info about the product: ");
			if (this.precoCusto == this.precoVenda) {
				System.out.println("There will be no gain or loss --");
			}
			else
			{
				if (this.precoCusto > this.precoVenda) {
					System.out.println("Should raise selling price, there will be loss --");
			} else
				{
					System.out.println("There will be gain --");
				}
			}	
		}
		
		System.out.printf("A media de custo e: %,.2f%n", this.totalPrecoCusto/qtd);
		System.out.printf("A media de preco de venda e: %,.2f%n", this.totalPrecoVenda/qtd);
		
		
	}
	
}
