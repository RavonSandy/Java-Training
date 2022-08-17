import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class dob {

    public static void main(String[] args) throws FileNotFoundException {
         try{    
                FileInputStream Rd=new FileInputStream("C:\\Users\\santhoshg\\Documents\\MAVERIC\\Java\\Sandy.txt");    
                BufferedInputStream Wt=new BufferedInputStream(Rd);    
                int i;    
                while((i=Wt.read())!=-1){    
                 System.out.print((char)i);    
                }    
                Wt.close();    
                Rd.close();    
              }catch(Exception e){System.out.println(e);} 

         LocalDate DOB = LocalDate.of(2000, Month.JUNE, 29); 
         LocalDate CDate = LocalDate.now(); 
         Period age = Period.between(DOB, CDate);
         int days = age.getDays();
         int months = age.getMonths();
         int years = age.getYears();      
        

            PrintStream output = new PrintStream(new File("C:\\Users\\santhoshg\\Documents\\MAVERIC\\Java\\differnce.txt"));
            System.setOut(output);
            System.out.println(days+" Days, "+ months+" Months, "+ years+" Years");     
  




    }

}