public class Program {
    public static void main(String[] args){
        Product a = new Product("car", 10000, 5, "piece");
        System.out.println(a);

        Product b = new Product("phone",1000,50,"piece");
        System.out.println(b);

        Product c = new Food("butter", 5, 5, "piece", "20 april 2023");
        System.out.println(c);

        Product d = new Drink("coffee", 15, 20, "cup", 200);
        System.out.println(d);

        Product e = new Hygiene("paste", 2, 200, "tub", 10);
        System.out.println(e);

        Product f = new Baby("pampers", 20, 20, "piece", 1, "No allergy");
        System.out.println(f);

        Product g = new Milk("milk", 2, 5, "bottle", "10 april 2023", 3);
        System.out.println(g);

        Product h = new Limonade("Buratino", 1, 10, "bottle", 2);
        System.out.println(h);

        Product i = new Bread("bread", 2, 2, "piece", "20 april 2023", "firstSort");
        System.out.println(i);

    } 
}
