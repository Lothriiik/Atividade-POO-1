package produtos.principal;


import java.util.Locale;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import produtos.secundarios.Client;
import produtos.secundarios.Order;
import produtos.secundarios.OrderItem;
import produtos.secundarios.Product;
import produtos.secundarios.enums.OrderStatus;

public class data {
    public static void main(String[] args) throws ParseException {
        
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();

		System.out.print("Email: ");
		String email = sc.next();

		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = data.parse(sc.next());

		Client c1 = new Client(name, email, birthDate);

		System.out.println("Enter order data:");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());

		Order o1 = new Order(new Date(), status, c1);

		System.out.print("How many items to this order? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			sc.nextLine();
            
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			
			Product product = new Product(productName, productPrice);
			
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			OrderItem oderItem = new OrderItem(quantity, productPrice, product);
			o1.addItem(oderItem);
		}
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(o1);
		
		sc.close();
    }
    
}
