public abstract class Account implements IRate{
// list of common properties for both saving and cheking acc.

String Name;
String sSN;
double balance;
protected double rate;
protected String accountNumber;
static int counter=10000;

// list of common method  for both acc.
// constructor to set base propearties and initialize the account.

public Account(String name, String sSN ,double balance){
this.Name=name;
this.sSN=sSN;
this.balance=balance;

// seting account number

counter++;
this.accountNumber=setaccountNumber();

}


public abstract void setIRate();


private String setaccountNumber(){
String lasttwodigitofsSN=sSN.substring(sSN.length()-2,sSN.length());
int uniqueid=counter;
int rand=(int)(Math.random()*Math.pow(10,3));
return lasttwodigitofsSN+uniqueid+rand ;
}


public void showInfo(){
System.out.println("account holder name is : "+Name+"\n"+
                   "account number is : "+accountNumber+"\n"+
                   "social secutiry number is : "+sSN+"\n"+
                   "initial balance is : "+balance+" $"+"\n"+"interest rate is :"+rate+" %");
}

public void deposite(double amount){
balance=balance+amount;
System.out.println("succesfully depostie  $ "+amount);
printbal();
}

public void withdraws(double amount){
balance=balance-amount;
System.out.println("succesfully withdraw $ "+amount);
printbal();
}



public void transfer(String towhom,double amount){
balance=balance-amount;
System.out.println("$ "+amount+" succesfully sent to "+towhom);
printbal();
}


public void printbal(){
System.out.println("now your balance is : "+balance);
}



}

