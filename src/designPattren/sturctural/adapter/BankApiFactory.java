package designPattren.sturctural.adapter;

import designPattren.sturctural.adapter.BankAPISAdaptor.ICICIBankAdapter;
import designPattren.sturctural.adapter.BankAPISAdaptor.YesBankAdapter;

public class BankApiFactory {


    public static BankAPI getBankAPI(String bankName ) {
        BankAPI bankAPI=null;
        if (bankName.equals("ICICI")){
            return new ICICIBankAdapter();
        } else if (bankName.equals("YesBank")) {
            return new YesBankAdapter();
        }
        return bankAPI;
    }
}
