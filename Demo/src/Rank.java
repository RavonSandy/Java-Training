
public class Rank extends Total{
	public void ranking(int total) {
	
		switch(total) {
		case 1:
            System.out.println("Rank : 1");
            break;
        case 8:
        case 7:
            System.out.println("Rank : 2");
            break;
        case 6:
            System.out.println("Rank : 3");
            break;
        case 5:
            System.out.println("Rank : 4");
            break;
        default:
            System.out.println("Rank : 5");
            break;
		}}}
	
	
