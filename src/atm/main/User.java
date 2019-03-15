package atm.main;
import java.util.Arrays;

public class User {

    private double amount;
    private String cardNumber;
    private String transactions[];
    private int current;

    public User(double amount, String cardNumber) {
        this.amount = amount;
        this.cardNumber = cardNumber;
        if (amount < 0) {
            this.amount = 0;
        }
        transactions = new String[5];
        current = 0;
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent() {
        int i=0;
        while(i<5 && transactions[i]!=null)
            i++;
        current = i-1;
    }
    
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    
    public String[] getTransactions(){
        return this.transactions;
    }

    public String withDraw(double amount) {
        if (this.amount < amount) 
            return "Insufficient amount of money";
        else{;
            this.amount -= amount;
            Update(amount,"Withdraw");
            return "Withdrawal successful";
        }
    }

    public String Deposit(double amount) {

        if (amount <= 0) 
            return "Unsuccessful";
         else {
            this.amount += amount;
            Update(amount,"Deposit");
           return "Deposited successfully";
        }
    }

    public String balanceInquiry() {
        Update(this.amount,"Balance Inquiry");
        return "Balance : " + amount;
    }
    
    private void Update(double amount , String type){
        int i=0;
        while(transactions[i]!=null){
            i++;
            if(i==5)
            {
                i=-1;
                break;
            }
        }
        if(i!=-1){
        transactions[i] = type + " " + amount;
        current = i;
        }
        else
        {
            i = 0;
            while(i<4){
                transactions[i] = transactions[i+1];
                    i++;
            }
                transactions[4] = type + " " + amount;
                current = 4;
        }
    }
    public String Previous(){
        if(current<=0){
            current = 0;
            return "No Info Available";
        }
        else if(transactions[current-1]==null)
            return "No Info Available";
        else 
            return transactions[--current];
    }
    
    public String Next(){
        if(current>=4){
            current = 4;
            return "No Info Available";
        }
        else if(transactions[current+1]==null)
            return "No Info Available";
        else 
            return transactions[++current];
        
    }
    
}
