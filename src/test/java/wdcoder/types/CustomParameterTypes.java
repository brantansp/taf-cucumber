package wdcoder.types;

import io.cucumber.java.ParameterType;
import wdcoder.objects.Client;

public class CustomParameterTypes {
    @ParameterType(".*")
    //@ParameterType("\"amour\"|\"sean\"|\"ben\"")
    public Client client (String id){
        return new Client(id);
    }
}
