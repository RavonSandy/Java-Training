
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=29;
		boolean Prime = true;
		
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				Prime = false;
				break;
			}
		}
		if(Prime) {
			System.out.println(n+" is Prime");
		}
		else {
			System.out.println(n+" is not a Prime");
		}

	}

}
