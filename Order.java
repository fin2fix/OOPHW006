public class Order {

  private String clientName;
  private String product;
  private int qnt;
  private double price;

  public Order() {
  }

  public Order(String clientName, String product, int qnt, double price) {
    this.clientName = clientName;
    this.product = product;
    this.qnt = qnt;
    this.price = price;
  }

  public String getClientName() {
    return clientName;
  }

  public void setClientName(String clientName) {
    this.clientName = clientName;
  }

  public String getProduct() {
    return product;
  }

  public void setProduct(String product) {
    this.product = product;
  }

  public int getQnt() {
    return qnt;
  }

  public void setQnt(int qnt) {
    this.qnt = qnt;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  

  

}