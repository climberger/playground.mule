package de.cl.playground.mule.data;

import org.mule.runtime.api.connection.ConnectionException;
import org.mule.runtime.api.connection.ConnectionProvider;
import org.mule.runtime.api.connection.ConnectionValidationResult;

public class DataConnectionProvider implements ConnectionProvider<DataConnection> {

    @Override
    public DataConnection connect() throws ConnectionException {
        return null;
    }

    @Override
    public void disconnect(DataConnection dataConnection) {

    }

    @Override
    public ConnectionValidationResult validate(DataConnection dataConnection) {
        return null;
    }
}
