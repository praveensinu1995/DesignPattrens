package designPattren.sturctural.adapter.BankAPISAdaptor;

import designPattren.sturctural.adapter.BankAPI;
import designPattren.sturctural.adapter.BankAPIS.ICICIBank;

public class ICICIBankAdapter implements BankAPI {
    ICICIBank iciciBank=new ICICIBank();
    @Override
    public int getBalance() {
        int ball = iciciBank.checkBalance();
        return ball;
    }

    @Override
    public void transfer(int amount) {
        iciciBank.sendMoney(amount);
    }
}
