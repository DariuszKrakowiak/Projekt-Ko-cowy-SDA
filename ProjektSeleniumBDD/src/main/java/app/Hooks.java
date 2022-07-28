package app;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.junit.Assert;
import org.junit.Test;


public class Hooks {
        @Before
        public void beforeTest() {
            System.out.println("Hello there!");
        }
        @After
        public void afterTest() {
            System.out.println("Goodbye!");
        }
        @Test
        public  void aTest() {
            Assert.assertEquals(1,1);
        }
    }

