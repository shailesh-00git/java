import javax.sound.sampled.*;

public class sound {
  public static void main(String[] args) throws LineUnavailableException {
    float sampleRate = 44100f;
    AudioFormat af = new AudioFormat(sampleRate, 8, 1, true, false);
    SourceDataLine line = AudioSystem.getSourceDataLine(af);

    line.open(af);
    line.start();

    System.out.println("Starting 1ms sweep: 1Hz to 20,000Hz...");

    // Calculate samples for 1ms: (1 / 1000) * 44100 = 44.1 samples
    int samplesPerFreq = (int) (sampleRate / 10000);
    byte[] buffer = new byte[samplesPerFreq];

    for (int freq = 1; freq <= 20000; freq++) {
      for (int i = 0; i < samplesPerFreq; i++) {
        // Generate the sine wave for the current frequency
        double angle = 2.0 * Math.PI * i * freq / sampleRate;
        buffer[i] = (byte) (Math.sin(angle) * 127);
      }
      // Write the 1ms buffer to the audio line
      line.write(buffer, 0, buffer.length);

      if (freq % 2000 == 0) {
        System.out.println("At " + freq + " Hz");
      }
    }

    line.drain();
    line.close();
    System.out.println("Sweep complete!");
  }
}