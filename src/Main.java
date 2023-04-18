import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  throws IOException {
        Scanner scanner=new Scanner(System.in);

        var list=new FileRegistration("C:\\javaproject\\firstproject\\text.txt");

//        var search_epin=list.Search_with_number_ofepisodes(75,"+");
//        for(var i:search_epin) System.out.println(i.getname());
//
//        var search_kind_name=list.Search_with_kind_name("Series");
//        for(var i:search_kind_name) System.out.println(i.getname());

        System.out.println("Please enter kind name: ");
        var kindname=scanner.next();
        System.out.println("Please enter name name: ");
        var name=scanner.next();
        System.out.println("Please enter Type name: ");
        var typename=scanner.next();
        System.out.println("Please enter Episodes number: ");
        var episodes=scanner.next();

        var register1=new Registration(kindname,name,typename,episodes);
        try {
            FileWriter myWriter = new FileWriter("C:\\javaproject\\firstproject\\text.txt");
            for(var i:list.getRegistration_List()) myWriter.write(i.print_register()+"\n");
            myWriter.write(register1.print_register());
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }





    }
}