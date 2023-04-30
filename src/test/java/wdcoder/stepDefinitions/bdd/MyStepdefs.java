package wdcoder.stepDefinitions;

import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import wdcoder.objects.Client;

public class MyStepdefs {



    private String username;
    private Client clientid;

    /**
     * Example for Optional texts
     */
    @Given("test username(s)")
    public void testUsername() {
        System.out.println("1");
    }

    /**
     * Example for Alternative texts
     */
    @Then("test success/failure")
    public void testSuccess() {
        System.out.println("2");
    }

    @Given("^test (\\s+) and (\\s+)$")
    public void testUsernameAndPassword(String username, String password) {

    }



    @Then("print username")
    public void printUsername() {
        System.out.println(this.username);
    }

    @Given("username {string}")
    public void username(String username) {
        this.username = username;
    }

    @Given("user")
    public void user() {
        System.out.println("background user");
    }

    @Given("test feature")
    public void testFeature() {

    }

    @Given("client id as {client}")
    public void clientIdAs(Client clientId) {
        this.clientid = clientId;
    }

    @Then("client with client id logged has logged in")
    public void clientWithLoggedHasLoggedIn() {
        System.out.printf("client with id %s logged has logged in", this.clientid.getClientId());
        System.out.println();
    }

}
