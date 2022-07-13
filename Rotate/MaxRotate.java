package Rotate;

import java.util.*;
import java.util.stream.IntStream;

public class MaxRotate {
/*
Take a number: 56789. Rotate left, you get 67895.
Keep the first digit in place and rotate left the other digits: 68957.
Keep the first two digits in place and rotate the other ones: 68579.
Keep the first three digits and rotate left the rest: 68597. Now it is over since keeping the first four it remains only one digit which rotated is itself.
You must return the greatest: 68957.
 */
    public static long maxRot (long n) {

        var number = String.valueOf(n).trim();
        List <Long> lista= new ArrayList<Long>();
        lista.add(Long.valueOf(number));

   IntStream.range(0, number.length()-1)
       .forEach(i -> {
                   StringBuffer sb = new StringBuffer();
                   String  in  = String.valueOf(lista.get(i));
                   sb.append(lista.get(i)).append(in.charAt(i)).deleteCharAt(i);
                   lista.add(Long.valueOf(String.valueOf(sb)));
               });


       return lista.stream().max(Long::compare).get();
    }

    public static void main(String[] args) {

        System.out.println(MaxRotate.maxRot(195881031) == 988103115);
        System.out.println(MaxRotate.maxRot(896219342) == 962193428);
        System.out.println(MaxRotate.maxRot(195881031 ) == 988103115);
    }
}
