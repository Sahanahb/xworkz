public class Chocolate{
    String name="Eclace";
    int quantity = 1;
    String shape= "cylinder";
    String color;
    Chocolate(){
        System.out.println("Chocolate const is running");
    }
    public static void main(String[] args) {
        Chocolate Chocolate = new Chocolate();
        System.out.println(Chocolate.name);
        System.out.println(Chocolate.quantity + " pack");
        System.out.println(Chocolate.shape);
        System.out.println(Chocolate.color);
    }
    
}