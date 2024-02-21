public interface Speakable {
    int QUIET = 0;
    int LOUD = 1;

    public abstract void getVoice(int voice);
}
