package ReverseOrRotate;


import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class RorR {
    public static String revRot(String strng, int sz) {

        if ((sz <= 0 || strng.isEmpty() || sz > strng.length())) return "";
        else {
            StringBuffer sbResult = new StringBuffer();
            List<String> list = new ArrayList<String>();
            int counter = 0;

            for (int i = 0; i < strng.length() / sz; i++) {
                list.add(strng.substring(counter, counter + sz));
                counter += sz;
            }

            for (String elt : list) {
                StringBuffer sb = new StringBuffer();
                String result;
                int sum = Arrays.stream(elt.split(""))
                        .mapToInt(e -> (int) Math.pow(Integer.valueOf(e), 3))
                        .sum();

                if (sum % 2 == 0) result = sb.append(elt).reverse().toString();
                else result = sb.append(elt.substring(1)).append(elt.charAt(0)).toString();
                sbResult.append(result);
            }
            return sbResult.toString();
        }
    }
    //arr1[0] = String.join("", Arrays.copyOfRange(strng.split(""), 0, sz));
    //arr1[1] = String.join("", Arrays.copyOfRange(strng.split(""), sz, sz+sz ));

    public static void main(String[] args) {

        String s = "733049910872815764";
        System.out.println( (RorR .revRot(s, 5).equals( "330479108928157")));
        System.out.println( (RorR .revRot("1234", 0).equals("")));




      /*  The input is a string str of digits. Cut the string into chunks (a chunk here is a substring of the
        initial string) of size sz (ignore the last chunk if its size is less than sz).
        If a chunk represents an integer such as the sum of the cubes of its digits is divisible by 2,
        reverse that chunk; otherwise rotate it to the left by one position.
        Put together these modified chunks and return the result as a string.
        If
        sz is <= 0 or if str is empty return ""
        sz is greater (>) than the length of str it is impossible to take a chunk of size sz hence return "".

       */
    }
}
