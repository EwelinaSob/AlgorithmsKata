package zad1;

import java.util.regex.*;


public class EditString {

	String arg;

	public EditString(String arg) {
		this.arg = arg;
	}

	public int stringLength() {
		return arg.toString().length();
	}

	public String firstandLast() {
		StringBuffer sb = new StringBuffer();
		char start = arg.charAt(0);
		char end = arg.charAt(arg.length() - 1);
		sb.append(start).append(" ").append(end);

		return sb.toString();
	}

	public String substringFrom4() {
		return arg.substring(4);
	}

	public String substringWithoutLastLetter() {
		return arg.substring(4, arg.length() - 1);
	}

	public int countSubstring(String arg2) {
		int result = 0;

		String regex = arg2;
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(arg);
		while (matcher.find())
			result++;
		return result;

	}

	public String createTab() {
		String regex = "[\\s\\p{Punct}]+";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(arg);
		String nowy = matcher.replaceAll("_");
		return nowy;
	}

	public boolean checklWord() {
		String regex = "[\\s\\p{Punct}]+";
		Pattern pattern = Pattern.compile(regex);
		String[] words = pattern.split(arg);
		String first = words[0];
		String last = words[words.length - 1];

		return first.equals(last);

	}
}
