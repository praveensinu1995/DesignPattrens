package designPattren.sturctural.adapter.BankAPIS;

public class Yesbank {
    public int getBalance(){
        System.out.println("balance from yes-bank");
        return  100;
    }
    public void transfer(int amount){
        System.out.println("transferred money from Yes-Bank ");
    }
}
