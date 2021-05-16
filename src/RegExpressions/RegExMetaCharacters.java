package RegExpressions;

import java.util.regex.Pattern;

public class RegExMetaCharacters {
	public static void main(String []args)
	{
		System.out.println(Pattern.matches("d","1"));
		System.out.println(Pattern.matches("d", "44412"));
		System.out.println(Pattern.matches("D", "wqwqwq"));
		System.out.println(Pattern.matches("D", "1"));
		System.out.println(Pattern.matches("D", "m"));
		System.out.println(Pattern.matches("D*", "abce"));
		
	}
}
