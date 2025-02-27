import java.util.HashMap;
import java.util.Map;

public class MusicPlayer {
    public static void main(String[] args) {
        // 1. Create a trackList of type HashMap
        HashMap<String, String> trackList = new HashMap<>();

        // 2. Add at least 4 songs stored by title
        trackList.put("Song 1", "Lyrics of Song 1");
        trackList.put("Song 2", "Lyrics of Song 2");
        trackList.put("Song 3", "Lyrics of Song 3");
        trackList.put("Song 4", "Lyrics of Song 4");

        // 3. Pull out one of the songs by its track title
        String songTitle = "Song 2";
        String lyrics = trackList.get(songTitle);
        System.out.println("Retrieved Song: " + songTitle + " - " + lyrics);

        // 4. Print out all the track names and lyrics in the format 'Track: Lyrics'
        System.out.println("\nAll Tracks and Lyrics:");
        for (Map.Entry<String, String> entry : trackList.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}