package p1;

import java.util.List;
import java.util.LinkedList;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

//let's create a structure to hold data.

public class CSV{

public static List<String[]> read(String file){
List<String[]> linked= new LinkedList<String[]>();
String data;
try{

BufferedReader br=new BufferedReader(new FileReader(file));
while((data=br.readLine())!=null){
String[] records=data.split(",");
linked.add(records);
}

}
catch(FileNotFoundException e){
System.out.println("file not found ");
e.printStackTrace();
}
catch(IOException e){
System.out.println("file is not readabale");
e.printStackTrace();
}
return linked;
}

}

