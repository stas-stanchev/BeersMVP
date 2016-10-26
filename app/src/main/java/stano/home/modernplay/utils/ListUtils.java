package stano.home.modernplay.utils;

import java.util.Iterator;
import java.util.List;

public class ListUtils {
    public final static String mergeStrings(String delimiter, List list) {
        if (list == null || list.isEmpty()) {
            return "";
        }

        StringBuilder stringBuilder = new StringBuilder();
        Iterator iterator = list.iterator();
        Object first = iterator.next();

        if (!iterator.hasNext()) {
            return first.toString();
        }

        if (first != null) {
            stringBuilder.append(first);
        }

        while (iterator.hasNext()) {
            if (delimiter != null) {
                stringBuilder.append(delimiter);
            }
            String next = iterator.next().toString();
            if (next != null) {
                stringBuilder.append(next);
            }

        }
        return stringBuilder.toString();
    }
}
