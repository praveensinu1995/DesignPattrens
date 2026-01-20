package designPattren.sturctural.adapter.BankAPIS;

public class ICICIBank {
    public int checkBalance() {
        System.out.println("balance from ICICIBank");
        return 100;
    }

    public void sendMoney(int amount) {
        System.out.println("transferred money from ICICIBank ");
    }
}
