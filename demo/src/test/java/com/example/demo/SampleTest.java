package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SampleTest {

    @Test
    public void numAssert(){
        Integer num = 2 + 2;
        assertEquals(4, num);
    }
}
