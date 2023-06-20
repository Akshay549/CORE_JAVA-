public class Saving extends Account{
// list of properties specific to saving acc.

private int safetyDepositBoxID;
private int safetyDepositBoxPIN;


//constructor to initialize saving acc prop

public Saving( String name , String sSN , double balance){
super(name,sSN,balance);
accountNumber="1"+accountNumber;
setSafetyDepositBox();
setIRate();
}

// list of  methods specific to saving

public void setIRate(){
super.rate=baseIRate*0.7;

}


public void setSafetyDepositBox(){
safetyDepositBoxID=(int)(Math.random()*1000);
//System.out.println(safetyDepositBoxID);
safetyDepositBoxPIN=(int)(Math.random()*10000);
//System.out.println(safetyDepositBoxPIN);

}

public void showInfo(){
super.showInfo();
System.out.println("account type is : "+"Saving account");
System.out.println("account features is: "+"\n your safety deposit box id is : "+safetyDepositBoxID+"\n your safety deposit box pin is : "+safetyDepositBoxPIN);
}

}