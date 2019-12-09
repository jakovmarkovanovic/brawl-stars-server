package daniillnull.javabs.messages.client;

import java.io.DataInputStream;

public class Login extends daniillnull.javabs.messages.Packet {
  public int vid;
  
  public Login() {}
  
  public void process() throws java.io.IOException {
    DataInputStream s = new DataInputStream(new java.io.ByteArrayInputStream(data));
    
    vid = ((int)s.readLong());
  }
}
