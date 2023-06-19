import java.util.Scanner;

public class CreateOrder extends Order {

  private Scanner scan = new Scanner(System.in);

  Order order;

  public CreateOrder() {
    this.order = new Order();
  }

  public Order getOrder() {
    return order;
  }

  public Order fillNewOrder() {
    order.setClientName(prompt("Client name: "));
    order.setProduct(prompt("Product: "));
    order.setQnt(Integer.parseInt(prompt("Quantity: ")));
    order.setPrice(Double.parseDouble(prompt("Price: ")));
    return order;
  }

  private String prompt(String message) {
    System.out.print(message);
    return scan.nextLine();
  }
}
