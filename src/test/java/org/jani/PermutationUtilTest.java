package org.jani;

import org.junit.Test;

import java.util.List;

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
}
