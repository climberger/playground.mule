package de.cl.playground.mule.mymule;

import static org.mule.runtime.extension.api.annotation.param.MediaType.ANY;
import static org.mule.runtime.extension.api.annotation.param.MediaType.APPLICATION_JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import org.mule.runtime.extension.api.annotation.param.MediaType;
import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.annotation.param.Connection;
import org.mule.runtime.extension.api.annotation.param.display.DisplayName;


/**
 * This class is a container for operations, every public method in this class will be taken as an extension operation.
 */
public class MyMuleOperations {

    @MediaType(value = APPLICATION_JSON)
    public String getData(
        @Config MyMuleConfiguration configuration,
        @Connection MyMuleConnection connection,
        @DisplayName("Data Parameter") String dataParameter,
        @DisplayName("Transformation Parameter") String transformationParameter) {

        JsonObject response = new JsonObject();
        response.addProperty("transformed", dataParameter + "_" + transformationParameter);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        return gson.toJson(response);
    }

    /**
     * Example of an operation that uses the configuration and a connection instance to perform some action.
     */
    @MediaType(value = APPLICATION_JSON)
    public String retrieveInfo(String anyProp, @Config MyMuleConfiguration configuration, @Connection MyMuleConnection connection) {
        return "Using Configuration [" + configuration.getConfigId() + "] with Connection id [" + connection.getId() + "]. AnyProp has value [ " + anyProp + " ]";
    }

    /**
     * Example of a simple operation that receives a string parameter and returns a new string message that will be set on the payload.
     */
    @MediaType(value = ANY, strict = false)
    public String sayHi(String person) {
        return buildHelloMessage(person);
    }

    /**
     * Private Methods are not exposed as operations
     */
    private String buildHelloMessage(String person) {
        return "Hello " + person + "!!!";
    }
}
