
public class StrFunc{
	String str = "Happy";
	String str1 = "Mind";
	
	public void upper() {
		System.out.println("UpperCase: "+str.toUpperCase()); 
	}
	
	public void lower() {
		System.out.println("LowerCase: "+str.toLowerCase()); 
	}
	
	public void concatfunc() {
		String CString = str.concat(str1);
		System.out.println("Joined String: " + CString);
	}
	
	public void comparefunc() {
		boolean EString = str.equals(str1);	    
	    System.out.println("Compare String: " + EString);
	}
	
	public void substringfunc() {
		System.out.println("SubString: " +str.substring(1, 4));
	}
	
	public void startsWithfunc() {
		System.out.println("StartsWith Hell: "+str.startsWith("Hell"));
	}
	
	public void endsWithfunc() {
		 System.out.println("EndsWith Hell: "+str.endsWith("Hell"));
	}
	
	public void indexOffunc() {
		System.out.println("indexOf: "+str.indexOf('y'));
	}
	
	
	
	public static void main(String[] args) {
		StrFunc s = new StrFunc();
		try {
			s.upper();
			s.lower();
			s.concatfunc();
			s.comparefunc();
			s.substringfunc();
			s.startsWithfunc();
			s.endsWithfunc();
			s.indexOffunc();
		}
		catch(Exception E) {
			System.out.println(E);
		}

	}

}
