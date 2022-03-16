package tests;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SimplTests {

    @Test
    void test00() {
        assertTrue(true);
    }

    @Test
    void test01() {
        assertTrue(true);
    }

    @Test
    void test02() {
        assertTrue(true);
    }

    @Test
    void test03() {
        assertTrue(false);
    }

    @Test
    void test04() {
        assertTrue(false);
    }

    @Test
    @Disabled
    void test05() {
        assertTrue(false);
    }

}
