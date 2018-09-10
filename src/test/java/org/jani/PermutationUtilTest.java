package org.jani;

import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

public class PermutationUtilTest {
    @Test
    public void should_return_a_when_given_one_letter_a() {
        // Given
        String letters = "a";

        // When
        List<String> permutations = PermutationUtil.listAllPermutations(letters);

        // Then
        Assert.assertEquals(Collections.singletonList("a"), permutations);
    }
}
