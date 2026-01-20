package designPattren.sturctural.adapter.BankAPISAdaptor;

import designPattren.sturctural.adapter.BankAPI;
import designPattren.sturctural.adapter.BankAPIS.Yesbank;

public class YesBankAdapter implements BankAPI {
    Yesbank yesbank = new Yesbank();


    @Override
    public int getBalance() {

        return yesbank.getBalance();
    }

    @Override
    public void transfer(int ammount) {
        yesbank.transfer(ammount);
    }
}
