package designPattren.sturctural.adapter;

import designPattren.sturctural.adapter.BankAPIS.Yesbank;

public class PhonePeLoan {


    public String lonaDisbursement(int loanAmmount,BankAPI  bankAPI) {
        if (bankAPI.getBalance()>=.01%loanAmmount){
            bankAPI.transfer(1000);
            return "approved loan";
        }else
            return "failed to approve loan";
    }
}
