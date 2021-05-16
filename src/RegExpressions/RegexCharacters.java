package RegExpressions;

import java.util.regex.Pattern;

public class RegexCharacters {
	public static void main(String []args)
	{
		System.out.println(Pattern.matches("[abc]", "b"));
		System.out.println(Pattern.matches("[abc]", "abc"));
		System.out.println(Pattern.matches("[abc]", "aaabbbbbc"));


	}
}
