package wdcoder.stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.Transpose;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import wdcoder.objects.Customer;
import wdcoder.objects.CustomerList;

import java.util.List;
import java.util.Map;

public class DataTableStepdefs {

    @Given("username as")
    public void usernameAs(DataTable datatable) {
        System.out.println("This is fetching the datatable as List");
        List <String> list = datatable.asList();
        list.forEach(System.out::println);
        System.out.println();
    }

    @Then("password as")
    public void passwordAs(DataTable dataTable) {
        System.out.println("This is fetching the datatable as Values");
        List <String> values = dataTable.values();
        values.forEach(System.out::println);
        System.out.println();

        System.out.println("This is fetching the datatable as Row");
        List <String> row = dataTable.row(0);
        row.forEach(System.out::println);
        System.out.println();

        System.out.println("This is fetching the datatable as List of List");
        List <List<String>> listOfList = dataTable.asLists();
        listOfList.forEach(System.out::println);
        System.out.println();
        System.out.println();
    }

    @DataTableType
    public CustomerList client (List <String> customer) {
        return new CustomerList(customer.get(0), customer.get(1));
    }
    @Given("usernamedatatabletype as list")
    public void usernamedatatabletypeAsList(List <CustomerList> customer) {
        System.out.println("This is fetching the datatable with domain objects using List without header");
        customer.forEach(c -> {
            System.out.printf("Username is %s", c.getUsername());
            System.out.println();
            System.out.printf("Password is %s", c.getPassword());
            System.out.println();
        });
        System.out.println();
    }

    @DataTableType
    public Customer customer (Map <String, String> entry) {
        return new Customer(entry.get("username"), entry.get("password"));
    }
    @Given("usernamedatatabletype as map")
    public void usernamedatatabletypeAsMap(List<Customer> customer) {
        System.out.println("This is fetching the datatable with domain objects using Map with header");
        customer.forEach(c -> {
            System.out.printf("Username is %s",c.getUsername());
            System.out.println();
            System.out.printf("password is %s",c.getPassword());
            System.out.println();
        });
        System.out.println();
    }

    @Given("single column as map")
    public void singleColumnAsMap( Map <String, String> customer) {
        System.out.println("This is single column as map with transpose function");
        //System.out.printf("Username is %s",customer.getUsername());
        System.out.println(customer.get("username"));
        System.out.println();
        //System.out.printf("Password is %s",customer.getPassword());
        System.out.println();
    }
}
