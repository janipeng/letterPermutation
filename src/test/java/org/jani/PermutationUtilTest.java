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
    public void should_return_ab_ba_when_given_two_letter_ab() {
        // Given
        String letters = "ab";

        // When
        List<String> permutations = listAllPermutations(letters);

        // Then
        assertEquals(asList("ab", "ba"), permutations);
    }

    @Test
    public void should_return_abc_acb_bac_bca_cab_cba_when_given_three_letter_abc() {
        // Given
        String letters = "abc";

        // When
        List<String> permutations = listAllPermutations(letters);

        // Then
        assertEquals(asList("abc", "acb", "bac", "bca", "cab", "cba"), permutations);
    }

    @Test
    public void should_return_list_size_24_when_given_three_letter_abcd() {
        // Given
        String letters = "abcd";

        // When
        List<String> permutations = listAllPermutations(letters);

        // Then
        assertEquals(24, permutations.size());
    }
}
