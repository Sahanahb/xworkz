public class VegPuff{
    String name="Veg Puff";
    int quantity = 1;
    String shape= "Square";
    String color;
    VegPuff(){
        System.out.println("VegPuff const is running");
    }
    public static void main(String[] args) {
        VegPuff VegPuff = new VegPuff();
        System.out.println(VegPuff.name);
        System.out.println(VegPuff.quantity + " pice");
        System.out.println(VegPuff.shape);
        System.out.println(VegPuff.color);
    }
    
}