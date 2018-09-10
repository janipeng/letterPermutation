package org.jani;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;

class PermutationUtil {
    static List<String> listAllPermutations(String letters) {
        if (letters.length() > 1) {
            return asList(letters,
                    letters.substring(1, 2) + letters.substring(0, 1));
        }
        return singletonList(letters);
    }
}
