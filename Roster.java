import java.util.*;

public class Roster {
    /* fields */
    private ArrayList<Account> students;

    /* constructors */
    public Roster(){
        students = new ArrayList<Account>();
    }

    /* methods */
    public String toString(){
        String overall = "";
        for(int i = 0; i < students.size(); i++){
            overall += "Student: " + students.get(i).getName() + "ID: " + students.get(i).getID() + "Balance: " + students.get(i).getBalance() + "Transactions: " students.get(i).getTransactions() + "\n";
        }
    }

}
