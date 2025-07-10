import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import product.Checkout;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CheckoutTest {

    Checkout myCheckout;


    @Given("the price of {string} is {int}c")
    public void thePriceOfBananaIsC(String name, int price ) {
        myCheckout = new Checkout();
        myCheckout.addItem(name,price);
    }

    @When("A user check out {string} {int}")
    public void aUserCheckOutBanana(String name, int count) {
        myCheckout.scanItems(name, count);

    }

    @Then("the total price should be {int}c")
    public void theTotalPriceShouldBeC(int expectedTotalPrice) {
        assertEquals(expectedTotalPrice, myCheckout.totalCart());
    }
}
