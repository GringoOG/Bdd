import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import product.BankAccount;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {


    BankAccount firstBankAccount;
    BankAccount secondBankAccount;


    @Given("Bank account with {int} Kc")
    public void bankAccountWithKc(int initialBalance) {
         firstBankAccount = new BankAccount(initialBalance);
    }

    @Then("A user account balanc is {int} kc")
    public void aUserAccountBalancIsKc(int expectedBalance) {
        assertEquals(expectedBalance, firstBankAccount.getAccountBalance());


    }

    @When("A user withdraw {int} kc")
    public void aUserWithdrawKc(int withdrawAmount) {
        firstBankAccount.withdraw(withdrawAmount);
    }

    @And("A user transfer {int} kc to this account")
    public void aUserTransferKcToThisAccount(int transferAmount) {
        firstBankAccount.transfer(transferAmount);
    }

    @And("another bank account with {int} Kc")
    public void anotherBankAccountWithKc(int initialBalance) {
        secondBankAccount = new BankAccount(initialBalance);
    }

    @When("A user transfer from first bank acount to second one {int} kc")
    public void aUserTransferFromFirstBankAcountToSecondOneKc(int transferAmount) {
        firstBankAccount.withdraw(transferAmount);
        secondBankAccount.transfer(transferAmount);

    }

    @And("A user second account balce is {int} kc")
    public void aUserSecondAccountBalceIsKc(int expectedBalance) {
        assertEquals(expectedBalance, secondBankAccount.getAccountBalance());
    }
}
