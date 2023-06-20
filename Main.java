import java.util.*;
import java.io.*;

public class Main{


static String file="C:\\Users\\AKSHAY AKHADE\\Desktop\\PROJECT\\bank\\NewBankAccounts.csv";

static List<Account>  account=new LinkedList<Account>();

public static void main(String[] args){


/*
[

Saving sa=new Saving("pooja","3999",555);
sa.showInfo();
sa.deposite(1300);
sa.withdraws(2000);
sa.transfer("viki",5000);

System.out.println("");
Cheking ch=new Cheking("akshay","12345",123);
ch.showInfo();  
 ]

*/

//Read a CSV file then create new accounts based on that data. 


List<String[]> newAccountHolder= p1.CSV.read(file);
for( String[] accountHolder:newAccountHolder){
String name=accountHolder[0];
String sSN=accountHolder[1];
String accountType=accountHolder[2];
double balance=Double.parseDouble(accountHolder[3]);

   if(accountType.equals("Savings")){
   account.add(new Saving(name,sSN,balance));
   }

   else if(accountType.equals("Current")){
   account.add(new Cheking(name,sSN,balance));
   }
   else{
   System.out.println("error found !");
   }


}


for(Account acc: account){
System.out.println("\n***************");
acc.showInfo();
}

}

}



