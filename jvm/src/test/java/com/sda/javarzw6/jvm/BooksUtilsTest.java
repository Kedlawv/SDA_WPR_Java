package com.sda.javarzw6.jvm;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BooksUtilsTest {

    @DisplayName("Test should read file and return string - before Java 7")
    @Test
    void test_v1(){
        String content = BooksUtils.readText("pan-tadeusz.txt");
        Assertions.assertEquals(
                content.split("\\W+").length,84316
        );
    }
}