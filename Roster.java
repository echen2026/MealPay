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
            overall += "Student: " + students.get(i).getName() + ", ID: " + students.get(i).getID() + ", Balance: " + students.get(i).getBalance() + ", Transactions: " + students.get(i).getTransactions() + "\n";
        }
        return overall;
    }

    public void addAccount(Account acc){
        students.add(acc);
    }

    public void idLookup(int num){
        for(int s = 0; s < students.size(); s++){
            if(students.get(s).getID()==num){
                System.out.println("Student: " + students.get(s).getName() + ", ID: " + students.get(s).getID() + ", Balance: " + students.get(s).getBalance() + ", Transactions: " + students.get(s).getTransactions() + "\n");
            }
        }
    }

    public String dateTransactions(String date){
        String overall = "";

        for(int s = 0; s < students.size(); s++){
            for(int t = 0; t < students.get(s).getList().size(); t++){
                if(students.get(s).getList().get(t).getDate().equals(date)){
                    overall += date + ", $" + students.get(s).getList().get(t).getAmount() + ") by " + students.get(s).getName() + " - ID: " + students.get(s).getID() + "\n";
                }
            }
        }

        return overall;
    }

}
