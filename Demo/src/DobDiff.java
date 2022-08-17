import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;


public class DobDiff {

	public static void meth() throws Exception {
		FileReader inpst = null;
		FileWriter outst = null;
		
		try {
			inpst = new FileReader("C:\\Users\\santhoshg\\Documents\\MAVERIC\\Java\\Sandy.txt");
			outst = new FileWriter("C:\\\\Users\\\\santhoshg\\\\Documents\\\\MAVERIC\\\\Java\\\\Sandy1.txt");
			int c ;
			while((c=inpst.read()) != -1) {
				outst.write(c);
			}
			inpst.close();
			outst.close();
			
		}
		catch(Exception e) {
			System.out.println(e);
		}}
	/*	finally {
			if(inpst!=null) {
				inpst.close();
			}
			if(outst!=null) {
				outst.close();
			}
		}
	}*/
	public static void meth1() throws Exception {
		BufferedReader inpst = null;
		BufferedWriter outst = null;
		
		try {
			inpst = new BufferedReader(new FileReader("C:\\Users\\santhoshg\\Documents\\MAVERIC\\Java\\Sandy.txt"));
			outst = new BufferedWriter(new FileWriter("C:\\\\Users\\\\santhoshg\\\\Documents\\\\MAVERIC\\\\Java\\\\BufferSandy.txt"));
		    String Data = inpst.readLine();
		    char[] ch = new char[10];
		    
		}
		catch(Exception e) {
			System.out.println(e);
		}}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		meth();
		
		

	}

}
