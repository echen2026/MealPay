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
    
}
