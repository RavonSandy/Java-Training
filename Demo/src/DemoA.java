
public class DemoA {
	static int i;  //Static
	
	public void meth() {
		int G = 8;
		System.out.println("Local "+G);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoA dem = new DemoA();
		dem.meth();
		int a=1;    //Instance
		int b=5;
		int c = a-b;
		System.out.println("Hello");
		System.out.println("PostFix of a++: "+a++);
		System.out.println("a = "+a);
		System.out.println("PreFix of a++: "+ ++a);
		System.out.println("a = "+a);
		System.out.println("ADD "+ a+b);
		System.out.println("DIV "+ a/b);
		System.out.println("MOD "+ a%b);
		System.out.println("MUL "+ a*b);
		System.out.println("SUB "+ (b-a));
		System.out.println("LS "+ (b<<a) );
		System.out.println("RS "+ (b>>a));
		
		c=a<b?a:b;
		System.out.println(c);
		if(a>0 && a<8) {
			System.out.println("AND a = "+a);
		}
		if(a>0 || a<8) {
			System.out.println("OR a = "+a);
			
		}
		
		
		int d[]= new int[101];
		for(i=1;i<=100;i++) {
			d[i]=i;
			System.out.println("a = "+ d[i]);
		}
		
		
 

	}

}
