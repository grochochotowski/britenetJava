public class MusicPlayer implements MediaPlayer {
    private int VolumeLevel;

    public MusicPlayer(int volumeLevel) {
        VolumeLevel = volumeLevel;
    }

    @Override
    public void play() {
        System.out.println("Music player start playing music");
    }

    @Override
    public void pause() {
        System.out.println("Music paused");
    }

    @Override
    public void stop() {
        System.out.println("Music player stopped playing music");
    }

    @Override
    public void adjustVolume(int level) {
        this.VolumeLevel = level;
    }
}
