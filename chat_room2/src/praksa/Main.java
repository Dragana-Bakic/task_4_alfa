package praksa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// System.out.print(FileHelper.loadMessages("messages2094721612573.txt"));
		// System.out.print(FileHelper.loadMetaData());
		String nickname = "";

		System.out.println("Type the name you want to be shown (Danny, John, Tyrion or Cersei) ");
		People p = new People(nickname);
		nickname = sc.nextLine();

		String metaData = FileHelper.loadMetaData();

		String[] podaci = metaData.split(System.lineSeparator());
		String Danny = podaci[1];
		String John = podaci[2];
		String Tyrion = podaci[3];
		String Cersei = podaci[4];

		if (nickname.equals("Danny") || nickname.equals("danny")) {
			String[] dp = Danny.split(", ");
			p.setName(dp[0]);
			p.setAllegiance(dp[1]);
			p.setMessagesFile(dp[2]);
		} else if (nickname.equals("John") || nickname.equals("john")) {
			String[] jp = John.split(", ");
			p.setName(jp[0]);
			p.setAllegiance(jp[1]);
			p.setMessagesFile(jp[2]);
		} else if (nickname.equals("Tyrion") || nickname.equals("tyrion")) {
			String[] tp = Tyrion.split(", ");
			p.setName(tp[0]);
			p.setAllegiance(tp[1]);
			p.setMessagesFile(tp[2]);
		} else if (nickname.equals("Cersei") || nickname.equals("cersei")) {
			String[] cp = Cersei.split(", ");
			p.setName(cp[0]);
			p.setAllegiance(cp[1]);
			p.setMessagesFile(cp[2]);
		} else {
			System.out.print("Please enter the correct name!");
		}

		String d = FileHelper.loadMessages(p.getMessagesFile()).toString();
		p.setMessages(d.replaceAll(", ", "- "));

		p.showChatMessages();

	}
}
