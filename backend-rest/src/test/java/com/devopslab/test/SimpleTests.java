package com.devopslab.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class SimpleTests {

    @Test
    public void testOK(){

        Assert.assertTrue(true);
    }

    @Test
    public void testKO(){

        Assert.assertFalse(false);
    }

    @Test
    public void testNotNull(){

        Assert.assertNotNull(new String("ho"));
    }

    @Test
    public void testText(){

        Assert.assertNotNull("txt","txt");
    }
}
