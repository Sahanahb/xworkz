public class Bread{
    String name="Salt Bread";
    int quantity = 1;
    String shape= "Square";
    String color;
    Bread(){
        System.out.println("Bread const is running");
    }
    public static void main(String[] args) {
        Bread Bread = new Bread();
        System.out.println(Bread.name);
        System.out.println(Bread.quantity + " pound");
        System.out.println(Bread.shape);
        System.out.println(Bread.color);
    }
    
}