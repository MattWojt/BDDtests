import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberTest {

        int currentAccount;
        int savingsAccount;
        @Given("I have 1000 on currentAccount")
        public void setCurrentAccount(){
            currentAccount = 1000;
        }

        @And("I have 1000 on savingsAccount")
        public void setSavingsAccount(){
        savingsAccount =1000;
        }

        @When("I transfer 500 from currentAcount to savingsAccount")
        public void transferMoney(){
            currentAccount = currentAccount - 500;
            currentAccount = currentAccount + 500;
        }
        @Then("Transfer executed")
        public void showTransfer(){
            System.out.println("currentAccount=" +currentAccount);
            System.out.println("savingsAccount=" +savingsAccount);
        }


    @When("I transfer {int} from currentAccount to savingsAccount")
    public void iTransferFromCurrentAccountToSavingsAccount(int arg0) {
    }
}
