import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import product.BankAccount;

public class BankTest {


    BankAccount firstBankAccount;




    @Given("Bank account with {int} Kc")
    public void bankAccountWithKc(int initialBalance) {
        BankAccount firstBankAccount = new BankAccount(initialBalance);
    }

    @Then("A user account balanc is {int} kc")
    public void aUserAccountBalancIsKc(int expectedBalance) {

    }
}
