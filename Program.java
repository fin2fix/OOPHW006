public class Program {
   public static void main(String[] args) {
        System.out.println("Введите заказ:");
        CreateOrder order1 = new CreateOrder();
        order1.fillNewOrder();
        SaveOrderToJson saveorder = new SaveOrderToJson(order1.getOrder());
        saveorder.saveToJson();
    }
}
