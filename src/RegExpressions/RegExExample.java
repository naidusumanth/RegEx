package RegExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExExample {
	public static void main (String []args)
	{
		Pattern pattern=Pattern.compile(".xx.");
		Matcher matcher=pattern.matcher("AwwD");
		System.out.println("strings matches:"+matcher.matches());
		
	}
}
