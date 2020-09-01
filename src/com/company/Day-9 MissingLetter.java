import java.util.Scanner;

public class MissingLetter {

	private static String getMissingLetters(String input)
	{
		String alphabets = "abcdefghijklmnopqrstuvwxyz";
		int max = 26;

		for (int i = 0; i < max; i++)
		{
			int index = input.indexOf(alphabets.charAt(i));
			if (index != -1)
			{
				alphabets = alphabets.substring(0, i) + alphabets.substring(i + 1);
				i--;
				max--;
			}
		}

		return alphabets;
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string : ");
		String input = sc.nextLine();
		sc.close();

		String letters = getMissingLetters(input);

		if (letters.length() == 0)
			System.out.println("No letters missing!");
		else
			System.out.println("Following letters are missing : " + letters);
	}
}


