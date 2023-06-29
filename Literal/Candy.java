public class Candy{
    String name="Cotten Candy";
    int quantity = 1;
    String shape= "Ovel";
    String color;
    Candy(){
        System.out.println("Candy const is running");
    }
    public static void main(String[] args) {
        Candy Candy = new Candy();
        System.out.println(Candy.name);
        System.out.println(Candy.quantity + " pice");
        System.out.println(Candy.shape);
        System.out.println(Candy.color);
    }
    
}