package BDDcase;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDDcase {

    @Given("Uruchomiona aplikacja MrBuggy 3 jako uzytkownik niezalogowany")
    public void uruchomiona_aplikacja_mr_buggy_3_jako_uzytkownik_niezalogowany() {
        System.out.println("Uruchomiona aplikacja MrBuggy 3 jako uzytkownik niezalogowany");
    }
    @And("Przejscie do zadania nr {int}")
    public void przejscie_do_zadania_nr_(Integer int1) {
        System.out.println("Przejscie do zadania nr" + " " + int1);
    }
    @When("Wykonanie polecenia z zadania nr {int}")
    public void wykonanie_polecenia_z_zadania_nr_(Integer int1) {
        System.out.println("Wykonanie polecenia z zadania nr" + " " + int1);
    }
    @Then("Zadanie nr {int} zawiera dokladnie {int} defekt")
    public void zadanie_nr_zawiera_dokladnie_defekt(Integer int1, Integer int2) {
        System.out.println("Zadanie nr" + " " + int1 + " zawiera dokladnie" + " " + int2 + " defekt");
    }
}
