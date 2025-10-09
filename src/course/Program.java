package course;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalQuantity;
        System.out.println("Quantos produtos você comprou?");
        totalQuantity = sc.nextInt();

        double higherPrice, averagePrice, totalPrice;
        String expensiverProduct = "Nenhum produto foi comprado";
        higherPrice = 0;
        totalPrice = 0;

        for(int i = 0; i<totalQuantity; i++){
            String productName;
            double productPrice;
            int quantity;
            System.out.println("Qual o nome do produto?");
            productName = sc.next();
            System.out.println("Qual o preço unitário do produto?");
            productPrice = sc.nextDouble();
            System.out.println("Quantos produtos você comprou?");
            quantity = sc.nextInt();

            totalPrice += productPrice * quantity;

            if(productPrice > higherPrice){
                higherPrice = productPrice;
                expensiverProduct = productName;
            }
        }

        averagePrice = totalPrice / totalQuantity;

        System.out.printf("Total da compra: R$%.2f%n", totalPrice);
        System.out.printf("Média por produto: R$%.2f%n", averagePrice);
        System.out.printf("Produto mais caro: %s (R$%.2f)%n", expensiverProduct, higherPrice);


        sc.close();
    }
}
