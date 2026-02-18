package devices;

public class Smartphone implements Camera, Music, Phone {

  @Override
  public void startCall() {
    System.out.println("Smartphones can make call");
  }

  @Override
  public void endCall() {
    throw new UnsupportedOperationException("Unimplemented method 'endCall'");
  }

  @Override
  public void playMusic() {
    throw new UnsupportedOperationException("Unimplemented method 'playMusic'");
  }

  @Override
  public void stopMusic() {
    throw new UnsupportedOperationException("Unimplemented method 'stopMusic'");
  }

  @Override
  public void openCamera() {
    throw new UnsupportedOperationException("Unimplemented method 'openCamera'");
  }

  @Override
  public void closeCamera() {
    throw new UnsupportedOperationException("Unimplemented method 'closeCamera'");
  }

}
