public class Cake{
    String name="Red Velvet";
    int quantity = 2;
    String shape= "Heart";
    String color;
    Cake(){
        System.out.println("Cake const is running");
    }
    public static void main(String[] args) {
        Cake Cake = new Cake();
        System.out.println(Cake.name);
        System.out.println(Cake.quantity + " KG");
        System.out.println(Cake.shape);
        System.out.println(Cake.color);
    }
    
}