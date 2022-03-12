package Kata;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class Opstrings {

// vertical and horizontal transformations of this square of strings.

	public static String vertMirror(String strng) {

		String word = "";
		String[] part = strng.split("\\n");

		StringBuffer resultBuffer = new StringBuffer();
		String result = null;

		for (String elt : part) {
			StringBuffer sb = new StringBuffer();

			List list = new ArrayList();
			for (int i = elt.length() - 1; i >= 0; i--) {

				list.add(elt.charAt(i));
			}
			for (Object elt1 : list) {
				sb.append(elt1);
			}
			word = sb.toString();
			result = resultBuffer.append(word).append("\n").toString();
		}

		return result.trim();

	}

	public static String horMirror(String strng) {

		String[] tab = strng.split("\\n");
		List list = new ArrayList();

		for (int i = tab.length - 1; i >= 0; i--) {
			list.add(tab[i]);

		}
		
		return String.join("\n", list);

	}

	public static String oper(UnaryOperator<String> operator, String s) {
		return operator.apply(s);
	
	}

	public static void main(String[] args) {


		String s = "hSgdHQ\nHnDMao\nClNNxX\niRvxxH\nbqTVvA\nwvSyRu";
		String r = "QHdgSh\noaMDnH\nXxNNlC\nHxxvRi\nAvVTqb\nuRySvw";
		System.out.println(Opstrings.vertMirror(s).equals(r));


		s = "lVHt\nJVhv\nCSbg\nyeCt";
		r = "yeCt\nCSbg\nJVhv\nlVHt";
		System.out.println(Opstrings.horMirror(s).equals(r));

	}

}
