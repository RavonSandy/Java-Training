import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	static int ucount =1;
	static int lcount =1;
	static int dcount =1;
	static int scount =1;
	public void upper() {
		Pattern p = Pattern.compile("[A-Z]");
		Matcher m = p.matcher("https://127.0.0.1:3000/teSt/");
		while(m.find()) {
			ucount++;
		}
		System.out.println("uppercount= "+(ucount-1));
		
		
	}
	public void lower() {
		Pattern p = Pattern.compile("[a-z]");
		Matcher m = p.matcher("https://127.0.0.1:3000/teSt/");
		while(m.find()) {
			lcount++;
		}
		System.out.println("LowerCount= "+(lcount-1));
		
		
	}
	public void digits() {
		Pattern p = Pattern.compile("\\d");
		Matcher m = p.matcher("https://127.0.0.1:3000/teSt/");
		while(m.find()) {
			dcount++;
		}
		System.out.println("DigitCount= "+(dcount-1));
				
	}
	
	public void SplCh() {
		Pattern p = Pattern.compile("[^a-zA-Z0-9]");
		Matcher m = p.matcher("https://127.0.0.1:3000/teSt/");
		while(m.find()) {
			scount++;
		}
		System.out.println("SplChCount= "+(scount-1));
		
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Regex reg = new Regex();
		reg.upper();
		reg.lower();
		reg.digits();
		reg.SplCh();
	
}}
