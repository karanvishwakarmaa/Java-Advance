package OOPS_IN_JAVA.Encapsulation;

public class Song {
    String artist;
    String title;
    void play() {
        System.out.println(artist+" is singing " + title);
    }

    public static void main(String[] args) {
        Song track1 = new Song();
        track1.artist="Lata ji";
        track1.title="wande matram";
        track1.play();
        Song track2 = new Song();
        track2.artist= "Arijit Singh";
        track2.title="Anamika tu bhi tarse";
        track2.play();
    }
}
