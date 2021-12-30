package com.example.android2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Before
    public void Setup(){
    }
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }
    @Test
    public void CountingWordsPasses() {
        int count = calculations.WordCounter("test test");
        assertEquals(2, count);
    }
    @Test
    public void CountingSymbolsPasses() {
        int count = calculations.SymbolCounter(",test .?");
        assertEquals(4, count);
    }
}