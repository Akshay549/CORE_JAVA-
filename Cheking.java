public class Cheking extends Account{
// list of prop specific to cheking acc 

private int debitCardNumber;
private int debitCardPIN;



//constructor to initialize cheking acc prop


public Cheking( String name, String sSN, double balance){
super(name, sSN , balance);
accountNumber="2"+accountNumber;
setDebitCard();
setIRate();
}

// list of  methods specific to checking


public void setIRate(){
super.rate=baseIRate*0.8;

}

public void setDebitCard(){
this.debitCardNumber=(int)(Math.random()*Math.pow(10,12));
this.debitCardPIN=(int)(Math.random()*Math.pow(10,4));
}


public void showInfo(){
super.showInfo();
System.out.println("account type is : "+"current account");
System.out.println("your debit card details : "+"\n"+
                    "debit card number : "+debitCardNumber+"\n"+"debit card pin :"+debitCardPIN);
}

}
