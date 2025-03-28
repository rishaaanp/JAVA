import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
public class FileDemos{
public static void main(String[] args){
String name=args[0];
File file=new File(name);
try{
Scanner obj=new Scanner(file);
while(obj.hasNextLine()){
String d=obj.nextLine();
System.out.println(d);
}
obj.close();
}
catch(FileNotFoundException e){
}
}
}