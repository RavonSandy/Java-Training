import java.util.Scanner;
public class Total{

	public void tot() {
		int count, i;
       int totalMarks = 0;
       int total;
        Scanner scanner;
        scanner = new Scanner(System.in);
 
        System.out.println("Enter Number of Subject");
        count = scanner.nextInt();
 
        System.out.println("Enter Marks of " + count + " Subject");
        for (i = 0; i < count; i++) {
            totalMarks += scanner.nextInt();
        }

        System.out.println("Total MArks : " + totalMarks);

       
  /*  public static void main(String[] args){
        
       Rank r = new Rank();
       r.ranking(total);
       if(totalMarks<=500&&totalMarks>=401) {
    	   r.ranking(1);
       	
       }
       else if(totalMarks>=301&&totalMarks<=400) {
    	   r.ranking(2);
       }
       else if(totalMarks>=201&&totalMarks<=300) {
    	   r.ranking(3);
       }
       else if(totalMarks>=101&&totalMarks<=200) {
    	   r.ranking(4);
       }
       else if(totalMarks>=1&&totalMarks<=100) {
    	   r.ranking(5);
       }
       
	}*/
    
       
	}
}