public class Product {
    String title;
    int price;
    int quantity;
    String unit;

    public Product(String valueTitle, int valuePrice, int valueQuantity, String valueUnit) {
        title = valueTitle;
        price = valuePrice;
        quantity = valueQuantity;
        unit = valueUnit;
    }
    
    @Override
    public String toString() {
        return String.format("title: %s; price: %d; quantity: %d; unit: %s", title, price, quantity, unit);
    }

}