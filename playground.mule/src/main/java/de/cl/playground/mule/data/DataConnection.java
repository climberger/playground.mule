package de.cl.playground.mule.data;

public class DataConnection {

    private final String id;

    public DataConnection(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void invalidate() {
        // do something to invalidate this connection!
    }

}
