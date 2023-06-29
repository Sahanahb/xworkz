public class Sweet{
    String name="Jamun";
    int quantity = 2;
    String shape= "Round";
    String color;
    Sweet(){
        System.out.println("Sweet const is running");
    }
    public static void main(String[] args) {
        Sweet Sweet = new Sweet();
        System.out.println(Sweet.name);
        System.out.println(Sweet.quantity + " pice");
        System.out.println(Sweet.shape);
        System.out.println(Sweet.color);
    }
    
}