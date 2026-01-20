package designPattren.sturctural.adapter;

import designPattren.sturctural.adapter.BankAPIS.Yesbank;

public class FastTag {


    public void recharge(int amount,BankAPI bankAPI){
        if (bankAPI.getBalance()>=100){
            System.out.println("FastTag recharge was successful");
        }else
            System.out.println("FastTag recharge was unsuccessful");
    }
}
