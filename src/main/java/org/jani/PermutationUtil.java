package org.jani;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;

class PermutationUtil {
    static List<String> listAllPermutations(String letters) {
        if (letters.length() == 2) {
            return asList(letters,
                    letters.substring(1, 2) + letters.substring(0, 1));
        }
        if (letters.length() == 3) {
            List<String> permutations = new ArrayList<String>();
            permutations.add(letters);
            permutations.add(letters.substring(0, 1) + letters.substring(2, 3) + letters.substring(1, 2));
            permutations.add(letters.substring(1, 2) + letters.substring(0, 1) + letters.substring(2, 3));
            permutations.add(letters.substring(1, 2) + letters.substring(2, 3) + letters.substring(0, 1));
            permutations.add(letters.substring(2, 3) + letters.substring(0, 1) + letters.substring(1, 2));
            permutations.add(letters.substring(2, 3) + letters.substring(1, 2) + letters.substring(0, 1));
            return permutations;
        }
        return singletonList(letters);
    }
}
