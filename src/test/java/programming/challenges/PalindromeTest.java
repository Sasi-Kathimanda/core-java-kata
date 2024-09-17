package programming.challenges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
    Palindrome sut;

    @BeforeEach
    void setUp() {
        sut = new Palindrome();
    }

    @Test
    void givenValidStringShouldReverseTheInput() {
        Assertions.assertTrue(sut.isPalindrome("madam"));
    }
}