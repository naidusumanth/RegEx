package RegExpressions;

import java.util.regex.Pattern;

public class RegExQuantifiers {
	public static void main(String []args)
	{
		System.out.println("?quantifier comes");
		System.out.println(Pattern.matches("[abc]?", "a"));
		System.out.println("+quantifier comes");
		System.out.println(Pattern.matches("[abc]+", "aaaaaaa"));
		System.out.println("*quantifier comes");
		System.out.println(Pattern.matches("[abc]*", "abbbcca"));

	}
}
