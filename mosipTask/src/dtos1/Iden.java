package dtos1;

import java.util.*;

public class Iden {
    public boolean additionalProperties;
    public String type;
    public List<String> required;
    public Map<String,Object1Properties> properties;
    public Iden(){

    }

    public Iden(boolean additionalProperties, String type, List<String> required, Map<String,Object1Properties> properties) {
        this.additionalProperties = additionalProperties;
        this.type = type;
        this.required = new ArrayList<String>(required);
        this.properties = new HashMap<String, Object1Properties>(properties);
    }

    public boolean isAdditionalProperties() {
        return additionalProperties;
    }

    public String getType() {
        return type;
    }

    public List<String> getRequired() {
        return new ArrayList<String>(required);
    }

    public Map<String,Object1Properties> getProperties() {
        return new HashMap<String, Object1Properties>(properties);
    }
}
