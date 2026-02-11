package devices;

public class Smartphone implements Camera, Music, Phone {

  @Override
  public void startCall() {
    System.out.println("Smartphones can make call");
  }

  @Override
  public void endCall() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'endCall'");
  }

  @Override
  public void playMusic() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'playMusic'");
  }

  @Override
  public void stopMusic() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'stopMusic'");
  }

  @Override
  public void openCamera() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'openCamera'");
  }

  @Override
  public void closeCamera() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'closeCamera'");
  }

}
