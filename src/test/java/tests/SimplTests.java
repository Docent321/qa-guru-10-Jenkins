package tests;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SimplTests {

    @Test
    @DisplayName("positiv 1")
    void test00() {
        assertTrue(true);
    }

    @Test
    @DisplayName("positiv 2")
    void test01() {
        assertTrue(true);
    }

    @Test
    @DisplayName("positiv 3")
    void test02() {
        assertTrue(true);
    }

    @Test
    @DisplayName("negative 1")
    void test03() {
        assertTrue(false);
    }

    @Test
    @DisplayName("negative 2")
    void test04() {
        assertTrue(false);
    }

    @Test
    @DisplayName("skipped 1")
    @Disabled
    void test05() {
        assertTrue(false);
    }

}
