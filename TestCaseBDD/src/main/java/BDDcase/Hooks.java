package BDDcase;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
        @Before
        public void beforeTest() {
            System.out.println("***Wyswietlony ekran powitalny***");
        }
        @After
        public void afterTest() {
            System.out.println("***Zakoncz***");
        }

    }

