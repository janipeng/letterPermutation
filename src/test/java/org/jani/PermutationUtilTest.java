package org.jani;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;
import static org.jani.PermutationUtil.listAllPermutations;
import static org.junit.Assert.assertEquals;

public class PermutationUtilTest {
    @Test
    public void should_return_a_when_given_one_letter_a() {
        // Given
        String letters = "a";

        // When
        List<String> permutations = listAllPermutations(letters);

        // Then
        assertEquals(singletonList("a"), permutations);
    }

    @Test
    public void should_return_ab_ba_when_given_one_letter_ab() {
        // Given
        String letters = "ab";

        // When
        List<String> permutations = listAllPermutations(letters);

        // Then
        assertEquals(asList("ab", "ba"), permutations);
    }
}
