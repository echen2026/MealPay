import java.util.ArrayList;

public class Account {
    private ArrayList<Transaction> list;
    private double balance;
    private int ID;
    private static int idgen = 1;
    private String name;
    

    public Account(String myName){
        list = new ArrayList<Transaction>();
        name = myName;
        balance = 0;
        ID = idgen;
        idgen++;
    }

    public double getBalance(){
        return balance;
    }

    public int getID(){
        return ID;
    }

    public String getName(){
        return name;
    }

    public void buyMeal(String date){
        balance -= 7;
        Transaction t = new Transaction(date, -7);
        list.add(t);
    }

    public void addMoney(int amount, String date){
        balance += amount;
        Transaction t = new Transaction(date, amount);
        list.add(t);
    }
    
}
