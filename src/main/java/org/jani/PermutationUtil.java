package org.jani;

import java.util.Arrays;
import java.util.List;

import static java.util.Collections.singletonList;

class PermutationUtil {
    static List<String> listAllPermutations(String letters) {
        if (letters.length() > 1) {
            return Arrays.asList(letters,
                    letters.substring(1, 2) + letters.substring(0, 1));
        }
        return singletonList(letters);
    }
}
