package praksa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 1. Characters
		PeopleMessages pm = new PeopleMessages();

		System.out.println("Type the name you want to be shown (Danny, John, Tyrion or Cersei) ");
		String nickname = sc.nextLine();

		if (nickname.equals("Danny") || nickname.equals("danny")) {
			pm.showDaenerys();
			pm.MessagesDaenerys();
		} else if (nickname.equals("John") || nickname.equals("john")) {
			pm.showJohn();
			pm.MessagesJohn();
		} else if (nickname.equals("Tyrion") || nickname.equals("tyrion")) {
			pm.showTyrion();
			pm.MessagesTyrion();
		} else if (nickname.equals("Cersei") || nickname.equals("cersei")) {
			pm.showCersei();
			pm.MessagesCersei();
		} else {
			System.out.print("Please enter the correct name!");
		}

		// 2. Messages

		System.out.println("\nType the name who's messages you want to see (Danny, John, Tyrion or Cersei) ");
		String ime = sc.nextLine();

		if (ime.equals("Danny") || ime.equals("danny")) {
			pm.MessagesDaenerys();
		} else if (ime.equals("John") || ime.equals("john")) {
			pm.MessagesJohn();
		} else if (ime.equals("Tyrion") || ime.equals("tyrion")) {
			pm.MessagesTyrion();
		} else if (ime.equals("Cersei") || ime.equals("cersei")) {
			pm.MessagesCersei();
		} else {
			System.out.print("Please enter the correct name!");
		}

		// 3. The number of messages

		System.out.println("\nThe number of messages sent from:");
		pm.MessagesNumberDaenerys();
		pm.MessagesNumberJohn();
		pm.MessagesNumberTyrion();
		pm.MessagesNumberCersei();

		// 4. Analysis Happy-Sad

		System.out.println("\nType the name (Danny, John, Tyrion or Cersei) ");
		String name = sc.nextLine();

		if (name.equals("Danny") || name.equals("danny")) {
			Emoji.hs("messages82387561293.txt");
		} else if (name.equals("John") || name.equals("john")) {
			Emoji.hs("messages2094721612573.txt");
		} else if (name.equals("Tyrion") || name.equals("tyrion")) {
			Emoji.hs("messages9287658288370.txt");
		} else if (name.equals("Cersei") || name.equals("cersei")) {
			Emoji.hs("messages22274950573636.txt");
		} else {
			System.out.print("Please enter the correct name!");
		}

		// 5. The most happy/sad character

		System.out.println("");

		if (Emoji.Happy("messages82387561293.txt") > Emoji.Happy("messages2094721612573.txt")
				&& Emoji.Happy("messages82387561293.txt") > Emoji.Happy("messages9287658288370.txt")
				&& Emoji.Happy("messages82387561293.txt") > Emoji.Happy("messages22274950573636.txt")) {
			System.out.println("The most happy person is Daenerys with " + Emoji.Happy("messages82387561293.txt")
					+ " happy emojis.");
		} else if (Emoji.Happy("messages2094721612573.txt") > Emoji.Happy("messages82387561293.txt")
				&& Emoji.Happy("messages2094721612573.txt") > Emoji.Happy("messages9287658288370.txt")
				&& Emoji.Happy("messages2094721612573.txt") > Emoji.Happy("messages22274950573636.txt")) {
			System.out.println("The most happy person is John with " + Emoji.Happy("messages2094721612573.txt")
					+ " happy emojis.");
		} else if (Emoji.Happy("messages9287658288370.txt") > Emoji.Happy("messages2094721612573.txt")
				&& Emoji.Happy("messages9287658288370.txt") > Emoji.Happy("messages82387561293.txt")
				&& Emoji.Happy("messages9287658288370.txt") > Emoji.Happy("messages22274950573636.txt")) {
			System.out.println("The most happy person is Tyrion with " + Emoji.Happy("messages9287658288370.txt")
					+ " happy emojis.");
		} else {
			System.out.println("The most happy person is Cersei with " + Emoji.Happy("messages22274950573636.txt")
					+ " happy emojis.");
		}
		if (Emoji.Sad("messages82387561293.txt") < Emoji.Sad("messages2094721612573.txt")
				&& Emoji.Sad("messages82387561293.txt") < Emoji.Sad("messages9287658288370.txt")
				&& Emoji.Sad("messages82387561293.txt") < Emoji.Sad("messages22274950573636.txt")) {
			System.out.println(
					"The most sad person is Daenerys with " + Emoji.Sad("messages82387561293.txt") + " sad emojis.");
		} else if (Emoji.Sad("messages2094721612573.txt") > Emoji.Sad("messages82387561293.txt")
				&& Emoji.Sad("messages2094721612573.txt") > Emoji.Sad("messages9287658288370.txt")
				&& Emoji.Sad("messages2094721612573.txt") > Emoji.Sad("messages22274950573636.txt")) {
			System.out.println(
					"The most sad person is John with " + Emoji.Sad("messages2094721612573.txt") + " sad emojis.");
		} else if (Emoji.Sad("messages9287658288370.txt") > Emoji.Sad("messages2094721612573.txt")
				&& Emoji.Sad("messages9287658288370.txt") > Emoji.Sad("messages82387561293.txt")
				&& Emoji.Sad("messages9287658288370.txt") > Emoji.Sad("messages22274950573636.txt")) {
			System.out.println(
					"The most sad person is Tyrion with " + Emoji.Sad("messages9287658288370.txt") + " sad emojis.");
		} else {
			System.out.println(
					"The most sad person is Cersei with " + Emoji.Sad("messages22274950573636.txt") + " sad emojis.");
		}

		// 6. Jon-Daenerys

		System.out.println("");

		if (Emoji.l("messages82387561293.txt") > Emoji.l("messages2094721612573.txt")) {
			System.out.println("Daenerys love John more (" + Emoji.l("messages82387561293.txt") + " love emojis).");
		} else if (Emoji.l("messages2094721612573.txt") > Emoji.l("messages82387561293.txt")) {
			System.out.println("John love Daenerys more (" + Emoji.l("messages2094721612573.txt") + " love emojis).");
		} else
			System.out.println("Love between John and Daenerys is equal");

		sc.close();
	}
}
