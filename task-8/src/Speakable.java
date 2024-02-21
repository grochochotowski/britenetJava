public interface Speakable {
    int QUIET = 0;
    int LOUD = 1;

    public abstract String getVoice(int voice);
}
