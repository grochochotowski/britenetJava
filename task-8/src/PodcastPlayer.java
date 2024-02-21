public class PodcastPlayer implements MediaPlayer {

    private int VolumeLevel;

    public PodcastPlayer(int volumeLevel) {
        VolumeLevel = volumeLevel;
    }

    @Override
    public void play() {
        System.out.println("Podcast is going");
    }

    @Override
    public void pause() {
        System.out.println("Podcast paused");
    }

    @Override
    public void stop() {
        System.out.println("Podcast stopped");
    }

    @Override
    public void adjustVolume(int level) {
        this.VolumeLevel = level;
    }
}
