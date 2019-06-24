import java.util.HashMap;

public class TrackList {
    public void trackList(){
        HashMap<String, String> tracks = new HashMap<>();
        tracks.put("Mr. Brightside","Coming out of my cage, and I've been doing just fine");
        tracks.put("Jars","We can't both become the same, pawn that's made to fall");
        tracks.put("Funeral","It's gone be some superstars at my funeral, driving in exotic cars to my funeral");
        tracks.put("Pyramids","Pimpin' in my convos, bubbles in my champagne");
        System.out.println("The lyrics to Pyramids: "+tracks.get("Pyramids")); 
        tracks.forEach((k,v) -> System.out.println(k+": "+v));        
    }
}