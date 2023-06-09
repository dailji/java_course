package junit;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;

public class Tests {

    @Test
    public void equalityExamples() {
//        assertTrue(1 == 1);
//        assertFalse(1 == 2);
//
//        Integer x2 = 1;
//        Integer y2 = 1;
//        assertTrue(x2 == y2);
//
//        Integer x = 128;
//        Integer y = 128;
//        assertFalse(x == y);
//        assertTrue(x.equals(y));
//
//        assertTrue("abc" == "abc");
//        assertTrue("abc" == "a" + "bc");
//
//        String a = "a";
//        assertFalse("abc" == a + "bc");
//        assertTrue("abc".equals(a + "bc"));
    }

    @Test
    public void assertThatAndAssertEqualsExample() {
        assertEquals(1 + 2, 3);
        assertThat(1 + 2, is(not (4)));
        assertThat(new int[] {1, 2, 3}, is(equalTo(new int[] {1, 2, 3})));
        assertThat(new int[] {1, 2, 3}, is(not(equalTo(new int[] {1, 2}))));
    }

    @Test
    public void findsSpecialNumbers() {
        assertTrue(Code.isSpecial(0));
        assertTrue(Code.isSpecial(1));
        assertTrue(Code.isSpecial(2));
        assertTrue(Code.isSpecial(3));
        assertFalse(Code.isSpecial(4));

        assertTrue(Code.isSpecial(11));
        assertFalse(Code.isSpecial(15));

        assertTrue(Code.isSpecial(36));
        assertFalse(Code.isSpecial(37));
        // other test cases for isSpecial() method
    }

    @Test
    public void findsLongestStreak() {
        assertThat(Code.longestStreak(""), is(0));
        assertThat(Code.longestStreak("aaabbceeee"), is(4));
        assertThat(Code.longestStreak("AAAAAAAAA"), is(9));
        assertThat(Code.longestStreak("ababababababa"), is(1));

        // other test cases for longestStreak() method
    }

    @Test
    public void findsModeFromCharactersInString() {

        assertThat(Code.mode(null), is(nullValue()));
        assertThat(Code.mode("abc"), is('a'));
        assertThat(Code.mode("aabbb"), is('b'));
        assertThat(Code.mode("ababababababa"), is('a'));
        // other test cases for mode() method
    }

    @Test
    public void removesDuplicates() {
        assertThat(Code.removeDuplicates(arrayOf(1, 1)), is(arrayOf(1)));

        assertThat(Code.removeDuplicates(arrayOf(1, 2, 1, 3, 2)), is(arrayOf(1, 2, 3)));

        assertThat(Code.removeDuplicates(arrayOf(1, 2, 3)), is(arrayOf(1, 2, 3)));

        assertThat(Code.removeDuplicates(arrayOf(100, 0, 3, 100, 0, 4, 562, 4)),
                is(arrayOf(100, 0, 3, 4, 562)));
    }

    @Test
    public void sumsIgnoringDuplicates() {
        assertThat(Code.sumIgnoringDuplicates(arrayOf(1, 1)), is(1));

        assertThat(Code.sumIgnoringDuplicates(arrayOf(1, 2, 1, 3, 2)), is(6));

        assertThat(Code.sumIgnoringDuplicates(arrayOf(1, 2, 3)), is(6));
    }

    private int[] arrayOf(int... numbers) {
        return numbers;
    }

}
