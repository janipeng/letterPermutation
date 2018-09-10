package org.jani;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.singletonList;

class PermutationUtil {
    static List<String> listAllPermutations(String letters) {
        if (letters.length() == 1) {
            return singletonList(letters);
        }
        List<String> permutations = new ArrayList<String>();
        for (int index = 0; index < letters.length(); index++) {
            for (String permutation : listAllPermutations(subtractOneCharByIndex(letters, index))) {
                permutations.add(letters.charAt(index) + permutation);
            }
        }
        return permutations;
    }
    
    private static String subtractOneCharByIndex(String letters, int index) {
        return letters.substring(0, index) + letters.substring(index + 1);
    }
}


