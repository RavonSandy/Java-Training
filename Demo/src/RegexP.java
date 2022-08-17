import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexP {
	static int count = 0;

	public static void main(String[] args) {
		String testStr = "https://127.0.0.1:3000/teSt/";
        String regEx = "[a-z]+";
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(testStr);
        while (matcher.find()) {
        	count = count++;
            System.out.println(count);}

	}

}
