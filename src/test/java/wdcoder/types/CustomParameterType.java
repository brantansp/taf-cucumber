package wdcoder.types;

import io.cucumber.java.ParameterType;
import wdcoder.objects.AppObject;

public class CustomParameterType {

    @ParameterType(".*")
    public AppObject AppPage(String pageName){
        return new AppObject(pageName.replaceAll("\"",""));
    }
}
