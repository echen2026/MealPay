public class Transaction {
    private String date;
    private int amount;

    public Transaction(String myDate, int myAmount){
        date = myDate;
        amount = myAmount;
    }

    public String getDate(){
        return date;
    }

    public int getAmount(){
        return amount;
    }
}
