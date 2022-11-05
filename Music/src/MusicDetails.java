public class MusicDetails {
    /* MusicDetails class with attributes songTitle, songArtist, playCount
     * This class object is used to store details of each song
     */
    private String songTitle;
    private String songArtist;
    private int playCount;

    /*Getter and Setter of the class
     * They are used to get and set attributes of the class
     */
    public String getSongTitle() {
        return songTitle;
    }

    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }

    public String getSongArtist() {
        return songArtist;
    }

    public void setSongArtist(String songArtist) {
        this.songArtist = songArtist;
    }

    public int getPlayCount() {
        return playCount;
    }

    public void setPlayCount(int playCount) {
        this.playCount = playCount;
    }
}
