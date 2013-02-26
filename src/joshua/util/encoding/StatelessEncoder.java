package joshua.util.encoding;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public abstract class StatelessEncoder implements Encoder {

  public void initialize() {}

  public void add(float key) {}

  public void finalize() {}

  public void writeState(DataOutputStream out) throws IOException {
    out.writeUTF(getKey());
  }

  public void readState(DataInputStream in) throws IOException {}
}