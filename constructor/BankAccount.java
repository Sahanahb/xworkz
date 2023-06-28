public class BankAccount{
    String bankAcount;
    BankAccount(String bankAcount)
    {
        System.out.println(bankAcount + " has a bankAcount");
    }
public static void main(String[] args) {
    System.out.println("Main method of BankAccount");
    BankAccount account1 = new BankAccount("Sanvi");
    BankAccount account2 = new BankAccount("Sakshi");
    BankAccount account3 = new BankAccount("Vaishnavi");
    BankAccount account4 = new BankAccount("Muralidhar");
    BankAccount account5 = new BankAccount("Sahana");
    BankAccount account6 = new BankAccount("Sindhu");
    BankAccount account7 = new BankAccount("Ganesh");
    BankAccount account8 = new BankAccount("Arjun");
    BankAccount account9 = new BankAccount("Rakshith");
    BankAccount account10 = new BankAccount("Lochan");
	BankAccount account11 = new BankAccount("Arya");
}
}