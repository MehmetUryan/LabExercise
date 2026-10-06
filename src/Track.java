/**
 * Name:        Mehmet Uryan
 * Student ID:  240446021
 * Date:        06.10.2026
 */
public class Track {

    private String title;
    private String artist;
    private int durationSeconds;
    private boolean isExplicit;

    // Full constructor
    public Track(String title, String artist, int durationSeconds, boolean isExplicit) {
        this.title = title;
        this.artist = artist;
        this.isExplicit = isExplicit;

        // duration check
        if (durationSeconds >= 0) {
            this.durationSeconds = durationSeconds;
        } else {
            System.out.println("Warning: Invalid duration. Setting to 0.");
            this.durationSeconds = 0;
        }
    }

    // Title + artist constructor
    public Track(String title, String artist) {
        this(title, artist, 0, false);
    }

    // Title-only constructor
    public Track(String title) {
        this(title, "Unknown Artist", 0, false);
    }

    // Default constructor
    public Track() {
        this("Unknown Title", "Unknown Artist", 0, false);
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getDurationSeconds() {
        return durationSeconds;
    }

    public boolean isExplicit() {
        return isExplicit;
    }

    // format duration as m:ss
    public String getDurationFormatted() {
        int minutes = durationSeconds / 60;
        int seconds = durationSeconds % 60;
        return String.format("%d:%02d", minutes, seconds);
    }

    @Override
    public String toString() {
        String baseInfo = "\"" + title + "\" by " + artist + " [" + getDurationFormatted() + "]";

        // check if we need to add explicit tag
        if (isExplicit) {
            return baseInfo + " [EXPLICIT]";
        }
        return baseInfo;
    }
}