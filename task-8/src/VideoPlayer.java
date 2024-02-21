public class VideoPlayer implements MediaPlayer {
    private int VolumeLevel;

    public VideoPlayer(int volumeLevel) {
        VolumeLevel = volumeLevel;
    }

    @Override
    public void play() {
        System.out.println("Video is going");
    }

    @Override
    public void pause() {
        System.out.println("Video paused");
    }

    @Override
    public void stop() {
        System.out.println("Video stopped");
    }

    @Override
    public void adjustVolume(int level) {
        this.VolumeLevel = level;
    }
}
