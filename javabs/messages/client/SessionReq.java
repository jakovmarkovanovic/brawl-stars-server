package daniillnull.javabs.messages.client;

import java.io.IOException;

public class SessionReq extends daniillnull.javabs.messages.Packet
{
  public String rhash;
  
  public SessionReq() {}
  
  public void process() throws IOException
  {
    if (data[11] != 2) {
      throw new IOException();
    }
    
    rhash = new String(java.util.Arrays.copyOfRange(data, 24, 64));
  }
}
