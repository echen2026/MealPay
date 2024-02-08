public class Transaction {
    private String date;
    private double amount;

    public Transaction(String myDate, double myAmount){
        date = myDate;
        amount = myAmount;
    }

    public String getDate(){
        return date;
    }

    public double getAmount(){
        return amount;
    }
}
