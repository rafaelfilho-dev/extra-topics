package course;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos produtos diferentes você comprou? ");
        int numProdutos = sc.nextInt();
        sc.nextLine(); // limpar buffer do nextInt

        double totalCompra = 0.0;
        double maiorPreco = 0.0;
        String produtoMaisCaro = "Nenhum";
        int totalUnidades = 0;

        for (int i = 1; i <= numProdutos; i++) {
            System.out.printf("%nProduto %d:%n", i);

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Preço unitário: ");
            double preco = sc.nextDouble();

            System.out.print("Quantidade: ");
            int qtd = sc.nextInt();
            sc.nextLine(); // limpar buffer

            double subtotal = preco * qtd;
            totalCompra += subtotal;
            totalUnidades += qtd;

            if (preco > maiorPreco) {
                maiorPreco = preco;
                produtoMaisCaro = nome;
            }
        }

        double mediaPorProduto = totalCompra / numProdutos;
        double mediaPorUnidade = totalCompra / totalUnidades;

        System.out.println("\n=== RESUMO DA COMPRA ===");
        System.out.printf("Valor total: R$%.2f%n", totalCompra);
        System.out.printf("Média por produto: R$%.2f%n", mediaPorProduto);
        System.out.printf("Média por unidade: R$%.2f%n", mediaPorUnidade);
        System.out.printf("Produto mais caro: %s (R$%.2f)%n", produtoMaisCaro, maiorPreco);

        sc.close();
    }
}
