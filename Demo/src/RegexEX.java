import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEX {

    public static void main(String[] args) throws FileNotFoundException {
         try{    
                FileInputStream fin=new FileInputStream("C:\\Users\\santhoshg\\Documents\\MAVERIC\\Java\\Sandy.txt");    
                BufferedInputStream bin=new BufferedInputStream(fin);    
                int i;    
                while((i=bin.read())!=-1){    
                 System.out.print((char)i);    
                }    
                bin.close();    
                fin.close();    
              }catch(Exception e){System.out.println(e);} 
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher("wFvLrl2xQjyrWrxeNI21@#9w");
        Pattern S=Pattern.compile("\\W+");
        Matcher j = S.matcher("wFvLrl2xQjyrWrxeNI21@#9w");
        PrintStream output = new PrintStream(new File("C:\\Users\\santhoshg\\Documents\\MAVERIC\\Java\\Sandy1.txt"));


        PrintStream console = System.out;


        System.setOut(output);
        while(m.find()) {
            System.out.println(m.group());
           
        while(j.find()) { 
            System.out.println(j.group());

    }

}
}
}