public class Bun{
    String name="Sweet Bun";
    int quantity = 1;
    String shape= "Round";
    String color;
    Bun(){
        System.out.println("Bun const is running");
    }
    public static void main(String[] args) {
        Bun Bun = new Bun();
        System.out.println(Bun.name);
        System.out.println(Bun.quantity + " pice");
        System.out.println(Bun.shape);
        System.out.println(Bun.color);
    }
    
}