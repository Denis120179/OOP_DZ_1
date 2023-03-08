public class Program {
    public static void main(String[] args){
        Product a = new Product("car", 10000, 5, "piece");
        System.out.println(a);

        Product b = new Product("phone",1000,50,"piece");
        System.out.println(b);

        Product c = new Food("bread", 5, 5, "piece", "20 april 2023");
        System.out.println(c);

        Product d = new Drink("coffee", 15, 20, "cup", 200);
        System.out.println(d);
    } 
}
