package de.cl.playground.mule.mymule;


/**
 * This class represents an extension connection just as example (there is no real connection with anything here c:).
 */
public final class MyMuleConnection {

  private final String id;

  public MyMuleConnection(String id) {
    this.id = id;
  }

  public String getId() {
    return id;
  }

  public void invalidate() {
    // do something to invalidate this connection!
  }
}
