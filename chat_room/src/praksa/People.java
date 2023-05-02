package praksa;

public class People {

	private String name;
	private String allegiance;
	private String messagesFile;
	private String messages;

	People(String nikcname) {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAllegiance() {
		return allegiance;
	}

	public void setAllegiance(String allegiance) {
		this.allegiance = allegiance;
	}

	public String getMessagesFile() {
		return messagesFile;
	}

	public void setMessagesFile(String messagesFile) {
		this.messagesFile = messagesFile;
	}

	public String getMessages() {
		return messages;
	}

	public void setMessages(String messages) {
		this.messages = messages;
	}
	public void showChatMessages() {

		System.out.print("Messages from " + this.name + " with allegiance to " + this.allegiance + " are shown in file "
				+ this.messagesFile + ". The messages are: \n" + this.messages);
	}
}
