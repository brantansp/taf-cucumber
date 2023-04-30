package wdcoder.types;

import io.cucumber.java.DataTableType;
import wdcoder.objects.UserObject;

import java.util.Map;

public class CustomDataTableType {

    @DataTableType
    public UserObject userObject(Map<String, String> userobject){
        return new UserObject(userobject.get("username"), userobject.get("password"));
    }
}
