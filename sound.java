import javax.sound.sampled.*;

public class sound {

  public static void main(String[] args) throws Exception {

    float sampleRate = 44100f;
    AudioFormat format = new AudioFormat(sampleRate, 16, 1, true, false);
    SourceDataLine line = AudioSystem.getSourceDataLine(format);

    line.open(format);
    line.start();

    double freq1 = 300; // low tone
    double freq2 = 370; // second tone

    double totalDuration = 10.0; // total play time in seconds
    double elapsed = 0.0;

    while (elapsed < totalDuration) {

      // HOOONK
      playHorn(line, sampleRate, freq1, freq2, 0.6);
      elapsed += 0.6;

      // Pause
      silence(line, sampleRate, 0.3);
      elapsed += 0.3;

      // HOOONK
      playHorn(line, sampleRate, freq1, freq2, 0.6);
      elapsed += 0.6;

      // Pause
      silence(line, sampleRate, 0.3);
      elapsed += 0.3;
    }

    line.drain();
    line.close();
  }

  static void playHorn(SourceDataLine line, float sampleRate,
      double freq1, double freq2, double seconds) {

    int samples = (int) (sampleRate * seconds);
    byte[] buffer = new byte[samples * 2];

    for (int i = 0; i < samples; i++) {

      double angle1 = 2.0 * Math.PI * freq1 * i / sampleRate;
      double angle2 = 2.0 * Math.PI * freq2 * i / sampleRate;

      double sampleValue = (Math.sin(angle1) + Math.sin(angle2)) / 2.0;

      short sample = (short) (sampleValue * 32767);

      buffer[2 * i] = (byte) (sample & 0xff);
      buffer[2 * i + 1] = (byte) ((sample >> 8) & 0xff);
    }

    line.write(buffer, 0, buffer.length);
  }

  static void silence(SourceDataLine line, float sampleRate, double seconds) {
    int samples = (int) (sampleRate * seconds);
    byte[] buffer = new byte[samples * 2];
    line.write(buffer, 0, buffer.length);
  }
}
