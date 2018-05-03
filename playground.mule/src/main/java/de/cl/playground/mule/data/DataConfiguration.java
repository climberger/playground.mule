package de.cl.playground.mule.data;

import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.connectivity.ConnectionProviders;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.param.display.DisplayName;

@Operations(DataOperations.class)
@ConnectionProviders(DataConnectionProvider.class)
public class DataConfiguration {

    @DisplayName("DataConfiguration")
    @Parameter
    private String configId;

    public String getConfigId(){
        return configId;
    }

}
