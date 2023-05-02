package praksa;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class PeopleMessages {

	List<String> d = new ArrayList<String>();

	String metaData = FileHelper.loadMetaData();

	String[] podaci = metaData.split(System.lineSeparator());
	String[] dp = podaci[1].split(", ");
	String[] jp = podaci[2].split(", ");
	String[] tp = podaci[3].split(", ");
	String[] cp = podaci[4].split(", ");

	People Daenerys = new People("Danny");
	People John = new People("John");
	People Tyrion = new People("Tyrion");
	People Cersei = new People("Cersei");
	{
		Daenerys.setName(dp[0]);
		Daenerys.setAllegiance(dp[1]);
		Daenerys.setMessagesFile(dp[2]);
	}
	{
		John.setName(jp[0]);
		John.setAllegiance(jp[1]);
		John.setMessagesFile(jp[2]);
	}
	{
		Tyrion.setName(tp[0]);
		Tyrion.setAllegiance(tp[1]);
		Tyrion.setMessagesFile(tp[2]);
	}
	{
		Cersei.setName(cp[0]);
		Cersei.setAllegiance(cp[1]);
		Cersei.setMessagesFile(cp[2]);
	}

	public void showDaenerys() {
		System.out.print("Messages from " + Daenerys.getName() + " with allegiance to " + Daenerys.getAllegiance()
				+ " are shown in file " + Daenerys.getMessagesFile() + ".The messages are: \n");
	}

	public void showJohn() {

		System.out.print("Messages from " + John.getName() + " with allegiance to " + John.getAllegiance()
				+ " are shown in file " + John.getMessagesFile() + ".The messages are: \n");
	}

	public void showTyrion() {

		System.out.print("Messages from " + Tyrion.getName() + " with allegiance to " + Tyrion.getAllegiance()
				+ " are shown in file " + Tyrion.getMessagesFile() + ".The messages are: \n");
	}

	public void showCersei() {

		System.out.print("Messages from " + Cersei.getName() + " with allegiance to " + Cersei.getAllegiance()
				+ " are shown in file " + Cersei.getMessagesFile() + ".The messages are: \n");
	}

	public void MessagesDaenerys() {
		d = FileHelper.loadMessages(Daenerys.getMessagesFile());
		ListIterator<String> li = d.listIterator();
		while (li.hasNext()) {
			System.out.print(li.next());
		}
	}

	public void MessagesJohn() {
		d = FileHelper.loadMessages(John.getMessagesFile());
		ListIterator<String> li = d.listIterator();
		while (li.hasNext()) {
			System.out.print(li.next());
		}
	}

	public void MessagesTyrion() {
		d = FileHelper.loadMessages(Tyrion.getMessagesFile());
		ListIterator<String> li = d.listIterator();
		while (li.hasNext()) {
			System.out.print(li.next());
		}
	}

	public void MessagesCersei() {
		d = FileHelper.loadMessages(Cersei.getMessagesFile());
		ListIterator<String> li = d.listIterator();
		while (li.hasNext()) {
			System.out.print(li.next());
		}
	}

	public void MessagesNumberDaenerys() {
		d = FileHelper.loadMessages(Daenerys.getMessagesFile());
		int brojac = -1;
		for (String s : d) {
			if (!s.isBlank()) {
				brojac++;
			}
		}
		System.out.println("Daenerys: " + brojac);
	}

	public void MessagesNumberJohn() {
		d = FileHelper.loadMessages(John.getMessagesFile());
		int brojac = -1;
		for (String s : d) {
			if (!s.isBlank()) {
				brojac++;
			}
		}
		System.out.println("John: " + brojac);
	}

	public void MessagesNumberTyrion() {
		d = FileHelper.loadMessages(Tyrion.getMessagesFile());
		int brojac = -1;
		for (String s : d) {
			if (!s.isBlank()) {
				brojac++;
			}
		}
		System.out.println("Tyrion: " + brojac);
	}

	public void MessagesNumberCersei() {
		d = FileHelper.loadMessages(Cersei.getMessagesFile());
		int brojac = -1;
		for (String s : d) {
			if (!s.isBlank()) {
				brojac++;
			}
		}
		System.out.println("Cersei: " + brojac);
	}
}
