package wdcoder.types;

import io.cucumber.java.ParameterType;
import wdcoder.objects.AppObject;

public class CustomParameterType {

    @ParameterType(".*")
    public AppObject AppPage(String psgeName){
        return new AppObject(psgeName.replaceAll("\"",""));
    }
}
