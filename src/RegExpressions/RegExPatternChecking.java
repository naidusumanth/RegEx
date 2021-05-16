package RegExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExPatternChecking {
	public static void main(String []args) {
		try(Scanner sc=new Scanner(System.in)) {
			while(true)
			{
				System.out.println("enter expression");
				String RegExPattern=sc.nextLine();
				Pattern pattern=Pattern.compile(RegExPattern);
				Matcher matcher=pattern.matcher("welcome to google");
				boolean found=false;
				while(matcher.find())
				{
					System.out.println("found the text"+matcher.group()+"starting at index"+matcher.start()+"ending index"+matcher.end());
					found=true;
					if(!found)
					{
						System.out.println("match not found");
					}
					}
				}
				
			}
		 catch (Exception e) {
			// TODO: handle exception
		}
	}
	}




