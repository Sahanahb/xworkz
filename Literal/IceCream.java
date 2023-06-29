public class IceCream{
    String name="ButterScoch";
    int quantity = 1;
    String shape= "Cone";
    String color;
    IceCream(){
        System.out.println("IceCream const is running");
    }
    public static void main(String[] args) {
        IceCream IceCream = new IceCream();
        System.out.println(IceCream.name);
        System.out.println(IceCream.quantity + " pice");
        System.out.println(IceCream.shape);
        System.out.println(IceCream.color);
    }
    
}