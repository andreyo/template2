package com.template;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmptyTest {

    @Test
    public void testName() throws Exception {
        assertEquals("MyString", new Empty().getMyString());
    }
}