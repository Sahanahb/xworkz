public class ToothPaste {
    
    private String brand;
    private String flavor;
    private int volume;
    private String color;
    private boolean hasFluoride;
    private boolean isWhitening;
    private boolean isSensitive;
    private double price;

  
    public ToothPaste(String brand, String flavor, int volume, String color,
                      boolean hasFluoride, boolean isWhitening, boolean isSensitive, double price) {
        this.brand = brand;
        this.flavor = flavor;
        this.volume = volume;
        this.color = color;
        this.hasFluoride = hasFluoride;
        this.isWhitening = isWhitening;
        this.isSensitive = isSensitive;
        this.price = price;
    }

    
    public void printInstanceVariables() {
        System.out.println("Brand: " + brand);
        System.out.println("Flavor: " + flavor);
        System.out.println("Volume: " + volume + " ml");
        System.out.println("Color: " + color);
        System.out.println("Has Fluoride: " + hasFluoride);
        System.out.println("Is Whitening: " + isWhitening);
        System.out.println("Is Sensitive: " + isSensitive);
        System.out.println("Price:" + price + " RS");
        System.out.println();
    }

    public static void main(String[] args) {
        
        ToothPaste ToothPaste1 = new ToothPaste("Colgate", "Mint", 150, "Blue", true, true, false, 45.00);
        ToothPaste ToothPaste2 = new ToothPaste("Crest", "Cinnamon", 100, "Red", true, false, false, 30.00);
        ToothPaste ToothPaste3 = new ToothPaste("Sensodyne", "Fresh Mint", 75, "Green", true, false, true, 15.49);
        ToothPaste ToothPaste4 = new ToothPaste("Aquafresh", "Bubble Mint", 125, "Pink", true, true, false, 50.49);
        ToothPaste ToothPaste5 = new ToothPaste("Arm & Hammer", "Baking Soda", 200, "White", false, true, false, 100.00);
        ToothPaste ToothPaste6 = new ToothPaste("Close-Up", "Lemon Mint", 90, "Yellow", true, false, false, 50.49);
        ToothPaste ToothPaste7 = new ToothPaste("Oral-B", "Pro-Health", 175, "Purple", true, true, false, 75.29);
        ToothPaste ToothPaste8 = new ToothPaste("Pepsodent", "Peppermint", 80, "Orange", true, false, true, 55.79);

       
        ToothPaste1.printInstanceVariables();
        ToothPaste2.printInstanceVariables();
        ToothPaste3.printInstanceVariables();
        ToothPaste4.printInstanceVariables();
        ToothPaste5.printInstanceVariables();
        ToothPaste6.printInstanceVariables();
        ToothPaste7.printInstanceVariables();
        ToothPaste8.printInstanceVariables();
    }
}