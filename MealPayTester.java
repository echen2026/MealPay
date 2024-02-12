public class MealPayTester {
    public static void main(String[] args) {
        
        System.out.println("\nWelcome to the MealPay program!");
        System.out.println("\nInitializing the roster...");
        Roster list = new Roster();

        System.out.println("\nAdding student accounts to the program...");
        Account a1 = new Account("Bob");
        Account a2 = new Account("Billy");
        Account a3 = new Account("Bob");
        Account a4 = new Account("William");
        list.addAccount(a1);
        list.addAccount(a2);
        list.addAccount(a3);
        list.addAccount(a4);

        System.out.println("\nDisplaying Students:");
        System.out.println(list.toString());

        System.out.println("\nAdding funds and making purchases...");
        a1.addMoney(150, "2/7");
        a2.addMoney(300, "2/8");
        a2.addMoney(10000, "2/9");
        a4.addMoney(100, "2/8");
        a1.addMoney(1, "2/13");

        a1.buyMeal("2/10");
        a1.buyMeal("2/11");
        a2.buyMeal("2/12");
        a3.buyMeal("2/13");
        a3.buyMeal("2/13");
        a4.buyMeal("2/13");
        a4.buyMeal("2/13");

        System.out.println("\nDisplaying Students: ");
        System.out.println(list.toString());

        System.out.println("\nDisplaying students with negative balances: ");
        System.out.println(list.negTransactions());

        System.out.println("\nLooking up Student with ID: 3: ");
        list.idLookup(3);

        System.out.println("\nDisplaying all transactions on '2/13':");
        System.out.println(list.dateTransactions("2/13"));

        


        
    }
}
