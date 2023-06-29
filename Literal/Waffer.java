public class Waffer{
    String name="Chocolate Waffer";
    int quantity = 1;
    String shape= "Rectangle";
    String color;
    Bun(){
        System.out.println("Bun const is running");
    }
    public static void main(String[] args) {
        Bun Bun = new Bun();
        System.out.println(Bun.name);
        System.out.println(Bun.quantity + " pack");
        System.out.println(Bun.shape);
        System.out.println(Bun.color);
    }
    
}