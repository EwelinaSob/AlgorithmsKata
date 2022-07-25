package SortArray;

import java.util.*;
import java.util.stream.IntStream;

public class SortArr{

    public static int[] sortByValueAndIndex(int[] array){
//    {
//        int counter = 0;
//        Map map = new HashMap<>();
//        List newlist = new ArrayList();
//
//        for (int elt: array) {
//            counter++;
//            int i = elt * counter;
//
//            map.put(i, elt);
//            newlist.add(i);
//        }
//
//        Collections.sort(newlist, (a,b )-> {
//            if (a.equals(b)) return ( int)map.get(a) -(int) map.get(b);
//            else return (int)a- (int)b;
//        });


        return IntStream.range(0, array.length)
                .boxed().sorted(Comparator.comparingInt(o -> array[o] * (o + 1)))
                .mapToInt(i -> array[i]).toArray();

                //newlist.stream().map(e->map.get(e)).mapToInt(e-> (int) e).toArray();
    }




    public static void main(String[] args) {
        int [] acctual = new int[] { 4, 2, 3, 23, 5};
        int [] expected = new int[] { 2, 4, 3, 5, 23};
        int [] result = SortArr.sortByValueAndIndex(acctual);
        for ( int elt: result) {
            System.out.println(elt);
        }
    }
}