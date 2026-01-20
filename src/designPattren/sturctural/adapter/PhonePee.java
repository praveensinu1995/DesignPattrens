package designPattren.sturctural.adapter;

public class PhonePee {
    FastTag fastTag;
    BankAPI bankAPI;
    PhonePeLoan phonePeLoan;
    PhonePee(BankAPI bankAPI){
        this.phonePeLoan=new PhonePeLoan();
        this.fastTag=new FastTag();
        this.bankAPI=bankAPI;
    }




    public void rechargeFastTag(int amount){
        fastTag.recharge(100,bankAPI);
    }

    public void aliveLoan(int loanAmount){
        phonePeLoan.lonaDisbursement(loanAmount,bankAPI);
    }

}
