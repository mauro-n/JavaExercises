/*
 Faça um algoritmo que receba o preço de custo e o preço de venda de 40 produtos.
  Mostre como resultado se houve lucro, prejuízo ou empate para cada produto. 
  Informe o valor de custo de cada produto, o valor de venda de cada produto, a 
  média de preço de custo e do preço de venda;
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
