## Exercicio-POO-1

![JAVA](https://custom-icon-badges.herokuapp.com/badge/Java-C63842?style=for-the-badge&logo=icons8-javaf&logoColor=black)
![GITHUB](https://img.shields.io/badge/Programação_Orientada_a_Objetos-black?style=for-the-badge&logo=GitHub&logoColor=white)

Aluno: Uanderson Henrique Batista da Silva
Matricula: 21110435

### **Exercicio 1:**
Faça um programa para ler a cotação do dólar, e depois leia o valor em dólares a ser comprado. A saída será quantos reais a pessoa pagará pelos dólares, considerando ainda que a pessoa pagará 6% de IOF sobre o valor em dólar. Criar uma classe CurrencyConverter (Conversor de moeda) para ser responsável pelos cálculos.
#### main:
```java
package conversor;
import java.util.Locale;
import java.util.Scanner;


public class programa1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double amount = sc.nextDouble();

        double result = CurrencyConverter.dollarToReal(amount, dollarPrice);
        System.out.printf("Amount to be paid in reais = %.2f%n", result);
                         
        sc.close();
}
  }
```
#### CurrencyConverter:
```java
package conversor;

public class CurrencyConverter {

    public static double dollarToReal(double  a, double b){    
        double dollarToReal = b * (a + (a*0.06));
        return dollarToReal;      
}
  }            
```
### **Exercício 2:** 
Fazer um programa para ler os valores da largura e altura de um retângulo. Em seguida, mostrar na tela o valor de sua área, perímetro e diagonal. Usar uma classe como mostrado no projeto abaixo.

|       **Rectangle**       |
| :-----------------------: |
|    __-__ Width: double    |
|   __-__ Height: double    |
|            ---            |
|   __+__ Area(): double    |
| __+__ Perimeter(): double |
| __+__ Diagonal(): double  |

#### main:

```java
package retangulo;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Rectangle rect = new Rectangle();

        System.out.println("Enter rectangle width and height:");
        double Width = sc.nextDouble();
        double Height = sc.nextDouble();

        rect.getWidth(Width);
        rect.getHeight(Width);

        double result = Rectangle.Area(Width, Height);
        System.out.printf("AREA = %.2f%n", result);
        double result2 = Rectangle.Perimeter(Width, Height);
        System.out.printf("PERIMETER = %.2f%n", result2);
        double result3 = Rectangle.Diagonal(Width, Height);
        System.out.printf("DIAGONAL = %.2f%n", result3);


    }

    
}
```
#### Rectangle:
```java
package retangulo;

import java.lang.Math;

public class Rectangle {
   private double Width;
   private double Height;

   public double getWidth(double Width2){
        this.Width = Width2;
        return this.Width;
   }

   public double getHeight(double Height2){
        this.Height = Height2;
        return this.Height;
    }
   
   public static double Area(double Width, double Height){
    double Area= Width * Height;
    return Area;

    }
    public static double Perimeter(double  Width, double Height){
    double Perimeter= 2*(Width + Height);
    return Perimeter;
    
    }

    public static double Diagonal(double  Width, double Height){
    double Diagonal= Math.sqrt((Math.pow(Width,2)) + (Math.pow(Height,2)));
    return Diagonal;

    }

}
```

### **Exercício 3:** 

Crie um programa para ler os dados de um funcionário (nome, sálario bruto e imposto). Em seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o salário do funcionário com base em uma porcentagem dada (somente o salário bruto é afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe projetada abaixo.

|                  **Employee**                  |
| :---------------------------------------------: |
|               __-__ Name: String                |
|            __-__ GrossSalary: double            |
|                __-__ Tax: double                |
|                       ---                       |
|            __+__ NetSalary(): double            |
| __+__ IncreaseSalary(percentagem: double): void |

#### main:

```java
package empregado;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
    
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();

        System.out.print("Name: ");
        String Name = sc.nextLine();
        
        System.out.print("Gross salary: ");
        double GrossSalary = sc.nextDouble();
        
        System.out.print("Tax: ");
        double Tax = sc.nextDouble();

        emp.setName(Name);
        emp.setGrossSalary(GrossSalary);
        emp.setTax(Tax);
        
        System.out.println();
		System.out.println("Employee: " + emp);
		System.out.println();
        
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		emp.increaseSalary(percentage);
        
		System.out.println();
		System.out.println("Updated data: " + emp);
		sc.close();
        
    }
    
}
```
#### Employee:

```java
package empregado;

public class Employee {
    
    private String Name;
    private double GrossSalary;
    private double Tax;

    public String setName(String Name2) {
        this.Name = Name2;
        return this.Name;
    }

    public double setGrossSalary(double GrossSalary2) {
        this.GrossSalary = GrossSalary2;
        return this.GrossSalary;
    }

    public double setTax(double Tax2) {
        this.Tax = Tax2;
        return this.Tax;
    }

    public double NetSalary(){
        return this.GrossSalary - this.Tax;
    }
   
    public void increaseSalary(double percentage) {
		this.GrossSalary += (this.GrossSalary * percentage / 100.0);
	}
    @Override
	public String toString() {
		return Name + ", $ " + String.format("%.2f", NetSalary());
	}
    }
```


### **Exercício 4:** 
Fazer um programa para ler os dados de N figuras (N fornecido pelo usuário), e depois mostrar as áreas destas figuras na mesma ordem em que foram digitadas.
Obs: Shape é uma classe abstract.
<div>
    <img height="400" width="300" src="./imgs/exerc4.png">
</div>

#### main:

```java
package area;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import area.enums.Color;


public class main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Shape> list = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Shape #" + i + " data:");

            System.out.print("Rectangle or Circle (r/c)? ");

            char chart = sc.next().charAt(0);

            System.out.print("Color (BLACK/BLUE/RED): ");
            Color c1 = Color.valueOf(sc.next());

            if (chart == 'r') {
                System.out.print("Width: ");
                double width = sc.nextDouble();

                System.out.print("Height: ");
                double height = sc.nextDouble();

                list.add(new Rectangle(c1, width, height));

            } else {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();

                list.add(new Circle(c1, radius));
            }
        }

        System.out.println();
        System.out.println("SHAPE AREAS:");
        
        for (Shape shape : list) {
            System.out.println(String.format("%.2f", shape.area()));
        }

        sc.close();
    }
}
```
#### Circle:

```java
package area;

import area.enums.Color;

public class Circle extends Shape{
    private Double radius;

    public Circle() {
        super();
    }

    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
```
#### Rectangle:

```java
package area;

import area.enums.Color;

public class Rectangle extends Shape {
    private Double width;
    private Double height;

    public Rectangle() {
        super();
}

    public Rectangle(Color color, Double width, Double height) {

        super(color);
        this.width = width;
        this.height = height;
}

    public Double getWidth() {
        return width;
        
}

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;


}

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}
```
#### Shape:

```java
package area;

import area.enums.Color;

public abstract class Shape {

    private Color color;

    public Shape() {
    }

    public Shape(Color color) {
        this.color = color;
}

    public Color getColor() {
        return color;
}

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract double area();
}
```
#### Color:

```java
package area.enums;

public enum Color {
    RED,BLACK,BLUE,;
}
```



### **Exercício 5:** 
Faça um programa que ler os dados de um pedido com N itens (N fornecido pelo usuário). Depois, mostrar um sumário do pedido conforme exemplo (próxima página). Nota: o instante do pedido deve ser o instante do sistema: new Date()

Use o *SimpleDateFormat*
```java
SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
```

<div>
    <img height="400" width="800" src="imgs/exerc5.png">
</div>

#### data:

```java
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

```
#### Client:

```java
package produtos.secundarios;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private String name;
	private String email;
	private Date birthDate;

	public Client(String name, String email, Date birthDate) {
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return name + " (" + sdf.format(birthDate) + ") - " + email;
		//return "Client [name=" + name + ", email=" + email + ", birthDate=" + birthDate + "]";
	}
	
	
	
}
```
#### Order:

```java
package produtos.secundarios;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import produtos.secundarios.enums.OrderStatus;


public class Order {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	private Date moment;
	private OrderStatus status;

	private Client client;
	private List<OrderItem> items = new ArrayList<>();

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	public void addItem(OrderItem item) {
		items.add(item);
	}

	public void removeItem(OrderItem item) {
		items.remove(item);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(client + "\n");
		sb.append("Order items:\n");
		for (OrderItem item : items) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}

	// ------------------------- Methods -----------------------------
	public double total() {
		double sum = 0.0;
		for (OrderItem item : items) {
			sum += item.subTotal();
		}
		return sum;
	}

}
```
#### OrderItem:

```java
package produtos.secundarios;

public class OrderItem {

	private Integer quantity;
	private Double price;
	
	private Product product;

	public OrderItem(Integer quantity, Double price, Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}	
	
	public double subTotal() {
		return price * quantity;
	}
	
	@Override
	public String toString() {
		return product.getName() 
				+ ", $" 
				+ String.format("%.2f", price) 
				+ ", Quantity: " 
				+ quantity + 
				", Subtotal: $" 
				+ String.format("%.2f", subTotal());
	}
	
}
```
#### Product:

```java
package produtos.secundarios;

public class Product {

	private String name;
	private Double price;
	
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	
}
```
#### OrderStatus:

```java
package produtos.secundarios.enums;

public enum OrderStatus {
	SHIPPED, PROCESSING, PENDING_PAYMENT, DELIVERED;
}
```



### **Exercício 6:**

Seguindo o diagrama UML abaixo, crie um software para validar dados de pessoa física e jurídica, caracterizados aqui por *CPF* E *CNPJ*, respectivamente. Consulte páginas na internet para saber a fórmula de cálculo para cada um deles. As entradas estarão sempre no formato *XXX.XXX.XXX-XX* para CPF e *XX.XXX. XXX/0001-XX* para CNPJ.

<div>
    <img src="imgs/exerc6.png">
</div>



### **Exercício 7:**

Você foi contratado para desenvolver um Player de Vídeo para uma BigTech. Dentre os problemas na construção deste software está o requisito de que o player deve suporta vídeos independentes da fonte/origem. A questão aqui é, empresas diferentes codificam os binários dos vídeos de forma diferente. Como mostrado no diagrama UML abaixo, os "bits" da classe *YoutubeVideo* são representados na forma de um array de inteiros, já *FaceVideo* é um array de booleanos. Sua tarefa é codificar este software atendendo o requisito mencionado.

O formato de conversão segue a seguinte lógica:
- YoutubeVideo: basta obter cada valor(inteiro) do array e mapeá-lo para um caractere utilizando a tabela ASCII (existe método em Java para isso). 

- FaceVideo: o array (de bits) tem exatamente 184 itens, esses elementos devem ser agrupados 8-8, formando assim 23 grupos/caracteres. Esse agrupamento representa na realidade um valor binário - só que no lugar de 1 e 0 é True e False. Tomando os 8 primeiros itens do array como exemplo:
(false, true, false, true, false, false, false, false) = (0b 01010000) = 80. Agora você tem inteiros (o que fará com eles?).

- [Código: FaceVideo.java e YoutubeVideo.java](#código-fonte-necessário)

<div>
    <img src="imgs/exerc7.png">
    <i>Esboço do diagrama UML do projeto. Ao construir seu software modifique-o se necessário sem descaracterizar o modelo.</i>
</div>

<br>


### **Exercício 8:**

O prof. Thiago neste período lecionará a disciplina de Programação Orientada a Objeto(POO). Devido a experiências ruins com alunos que não estudavam o suficiente – ou não estudava – ele pensou em uma nova fórmula para calcular as notas dos alunos (modo tudo ou nada). 

- Nota semestral: média aritmética das notas obtidas pelo aluno.
- Nota final: nota obtida a partir da **nota semestral** aplicando o **modo tudo ou nada**

Em relação a nota semestral:
- Nota menor que 6 recebe uma penalização de 25%.
- Maior ou igual a 6 e menor que 7 se torna 7.
- Maior ou igual a 7 e menor ou igual a 8 recebe uma bonificação de 15% (Para melhorar o coeficiente).
- Qualquer outra nota automaticamente se torna 10.

Sua atividade é desenvolver um software para realizar esse cálculo. Além disso, o seu sistema deve-se armazenar algumas outras informações.

##### Aluno:

|     Campo      | Restrição                                         |
| :------------: | :------------------------------------------------ |
| Nome completo  | Ter pelo menos dois nomes<br>Máximo 50 caracteres |
|   Matrícula    | Ter 8 recebidocaracteres<br>Iniciar com 201       |
| notas do aluno | 5 notas no total                                  |

Sobre a nota semestral: a menor nota do aluno será descartada para fins de calculo, que consiste de uma média aritmética da 4 notas restantes.


##### Nota:

|      Campo      | Restrição          |
| :-------------: | :----------------- |
|      Valor      | 0 <= valor <= 10   |
| Nome do Assunto | Não pode ser vázio |


Cuidados: encapsule as propriedades e faça as validaçções dos valores "setados" nos campos.

Obs.1: utilize interfaces.

Obs.2: pode ser necessário atualizar dados após sua criação.


### **Exercício 9:**

Nessa atividade sua tarefa será criar uma *lib* de ordenação.

A exigência principal é que haja uma classe chamada de *SortMachine* que receberá uma lista – você pode escolher qual o tipo será essa lista (int, string, etc) – idealmente genérica – e um o método de ordenação (Quick, Merge, etc). Em *SortMachine* haverá um método nomeado *runSort* que retornará a lista ordenada.

Obs.1: você deverá implementar pelos menos dois algoritmos de ordenação diferentes.



### **Exercício 10:**

José é dono de uma rede de empresas do ramo alimentícios que além de vender produtos de terceiros a também cria seus próprios produtos. Atualmente, o principal meio de comunicação da empresa é o e-mail, entretanto, José tem receio que alguma BigTech vaze/roube informações sobre os seus produtos. Diante disso, ele está te contratando para construir um sistema de e-mail próprio para a empresa.

Problemas/Requisitos:

1. Um e-mail é uma mensagem de texto com no máximo 2500 caracteres e possui um usuário de origem e um de destino que sejam válidos, além de um título e uma data de envio.
2. Um Funcionário possui nome, cargo, matrícula e um e-mail. O e-mail deve ser único dentro do sistema da empresa. Além disso, cada Funcionário possui uma lista de e-mails enviados e uma lista de recebidos.
3. Para facilitar a localização, José requisita que haja uma lista com todos os Funcionários.
4. Crie uma unidade/classe responsável por enviar e-mails entre os Funcionários.




