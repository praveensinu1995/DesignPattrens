package designPattren.sturctural.adapter;

import designPattren.sturctural.adapter.BankAPIS.Yesbank;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("print bankName");
        String bankName=scanner.next();

        BankAPI bankAPI = BankApiFactory.getBankAPI(bankName);
        PhonePee phonePee=new PhonePee(bankAPI);

        phonePee.aliveLoan(1000);
        phonePee.rechargeFastTag(100);

    }
}
