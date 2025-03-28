import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
public class FileDemo{
public static void main(String[] args){
File file=new File("FileHandling.txt");
try{
    if(file.createNewFile()){
        System.out.println("File created:"+file.getAbsolutePath());
        }
        else{
        System.out.println("File already exists");
        }
        System.out.println("File name:"+file.getName());
        System.out.println("File path:"+file.getAbsolutePath());
        System.out.println("File parent:"+file.getParent());
        System.out.println("File size(in bytes):"+file.length());
        System.out.println("Readable:"+file.canRead());
        System.out.println("Writable:"+file.canWrite());
        System.out.println("Executable :"+file.canExecute());
        }
        catch(IOException e){
        System.out.println("An error occured:"+e.getMessage());
        e.printStackTrace();
        }
        }
        }