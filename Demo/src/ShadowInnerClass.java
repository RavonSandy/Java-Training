
public class ShadowInnerClass {
	int a = 5;
	
	class inner{
		int a = 8;
		
		void Iclass(int a) {
			
			System.out.println("a = "+a);
			System.out.println("This.a ="+this.a);
			System.out.println("ShadowInnerClass(a)= "+ShadowInnerClass.this.a);
		}
	}

	public static void main(String[] args) {
		ShadowInnerClass obj = new ShadowInnerClass();
		ShadowInnerClass.inner obj1 = obj.new inner();
		
		obj1.Iclass(10);
		

	}

}
