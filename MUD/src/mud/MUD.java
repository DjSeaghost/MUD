package mud;

import java.util.Scanner;

/**
 * @author ryan
 * 
 */
public class MUD
{
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		System.out.println("A Dark Corridor");
		System.out
				.println("You awaken to find yourself in a dark corridor. The only visible light is emanating from a torch \n"
						+ "far off in the distance to the north. The floor is made of cold, wet stone, and is covered in \n"
						+ "cobwebs.");
		System.out.println("Exits: North");

		while (true)
		{
			Scanner scanner = new Scanner(System.in);
			String command = scanner.nextLine();

			if (command.equalsIgnoreCase("exit"))
			{
				System.out.println("Leaving the fantasy world...");
				System.exit(1);
			}
			else if (command.equalsIgnoreCase("n")
					|| command.equalsIgnoreCase("north"))
			{
				System.out.println("You fall over because you're drunk bitch");
			}
			else
			{
				System.out.println("Command " + command + " not found");
			}
		}
	}
}
