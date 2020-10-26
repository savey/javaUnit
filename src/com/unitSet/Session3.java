package com.unitSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Session3 {
    public static void main(String[] args) {
        String str = "This class implements the <tt>Set</tt> interface, backed by a hash table(actually a <tt>HashMap</tt> instance).  It makes no guarantees as to the iteration order of the set; in particular, it does not guarantee that the order will remain constant over time.  This class permits the <tt>null</tt> element";

        String[] strings = str.split("");

        Set<String> stringSet = new HashSet<>();
        stringSet.addAll(Arrays.asList(strings));
        System.out.println(stringSet.size());
    }
}
