package praksa;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Emoji {

	public static void hs(String string) {

		int happy = 0;
		int sad = 0;

		String d = FileHelper.loadMessages(string).toString();
		Pattern p1 = Pattern.compile("\\😍|😄|🙂|😊");

		Matcher m1 = p1.matcher(d);
		while (m1.find()) {
			happy++;
		}
		Pattern p2 = Pattern.compile("\\😢|😭|😞|👿");

		Matcher m2 = p2.matcher(d);
		while (m2.find()) {
			sad++;
		}

		if (happy > sad) {
			System.out.println("This person is more happy then sad. The number of happy emojis: " + happy);
		} else if (sad > happy) {
			System.out.println("This person is more sad then happy. The number of sad emojis: " + sad);
		} else
			System.out.println("This person is equaly sad and happy.");

	}

	public static int Happy(String string) {

		int happy = 0;

		String d = FileHelper.loadMessages(string).toString();
		Pattern p1 = Pattern.compile("\\😍|😄|🙂|😊");

		Matcher m1 = p1.matcher(d);
		while (m1.find()) {
			happy++;
		}
		return happy;
	}

	public static int Sad(String string) {

		int sad = 0;

		String d = FileHelper.loadMessages(string).toString();

		Pattern p2 = Pattern.compile("\\😢|😭|😞|👿");

		Matcher m2 = p2.matcher(d);
		while (m2.find()) {
			sad++;
		}
		return sad;
	}

	public static int l(String string) {
		int loving = 0;

		String d = FileHelper.loadMessages(string).toString();
		Pattern p3 = Pattern.compile("\\😍|😘");

		Matcher m3 = p3.matcher(d);
		while (m3.find()) {
			loving++;
		}
		return loving;
	}
}
