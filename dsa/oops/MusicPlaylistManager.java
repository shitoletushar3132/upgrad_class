package oops;
import java.util.Scanner;

class Song {
    private String title;
    private String artist;
    private String album;
    private double duration;

    public Song(String title, String artist, String album, double duration) {
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void play() {
        System.out.println("Playing: " + title + " - " + artist);
    }

    public void display() {
        System.out.println(title + " - " + artist);
    }
}

class Playlist {
    private Song[] songs;
    private int size;

    public Playlist(int capacity) {
        songs = new Song[capacity];
        size = 0;
    }

    public boolean addSong(Song song) {
        if (size < songs.length) {
            songs[size++] = song;
            return true;
        }
        return false;
    }

    public boolean removeSong(String title) {
        for (int i = 0; i < size; i++) {
            if (songs[i].getTitle().equalsIgnoreCase(title)) {
                for (int j = i; j < size - 1; j++) {
                    songs[j] = songs[j + 1];
                }
                songs[--size] = null;
                return true;
            }
        }
        return false;
    }

    public void listSongs() {
        if (size == 0) {
            System.out.println("Playlist is empty.");
        } else {
            System.out.println("Playlist:");
            for (int i = 0; i < size; i++) {
                System.out.print((i + 1) + ". ");
                songs[i].display();
            }
        }
    }

    public boolean playSong(String title) {
        for (int i = 0; i < size; i++) {
            if (songs[i].getTitle().equalsIgnoreCase(title)) {
                songs[i].play();
                return true;
            }
        }
        return false;
    }
}

public class MusicPlaylistManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Playlist playlist = new Playlist(100); // You can set your desired playlist capacity

        while (true) {
            System.out.println("\nMusic Playlist Manager");
            System.out.println("1. Add Song");
            System.out.println("2. Remove Song");
            System.out.println("3. List Songs");
            System.out.println("4. Play Song");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter song title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter artist name: ");
                    String artist = sc.nextLine();
                    System.out.print("Enter album name: ");
                    String album = sc.nextLine();
                    System.out.print("Enter song duration (in minutes): ");
                    double duration = sc.nextDouble();
                    Song newSong = new Song(title, artist, album, duration);
                    if (playlist.addSong(newSong)) {
                        System.out.println("Song added to the playlist!");
                    } else {
                        System.out.println("Playlist is full. Cannot add more songs.");
                    }
                    break;
                case 2:
                    System.out.print("Enter title of the song to remove: ");
                    String removeTitle = sc.nextLine();
                    if (playlist.removeSong(removeTitle)) {
                        System.out.println("Song removed from the playlist!");
                    } else {
                        System.out.println("Song not found in the playlist.");
                    }
                    break;
                case 3:
                    playlist.listSongs();
                    break;
                case 4:
                    System.out.print("Enter title of the song to play: ");
                    String playTitle = sc.nextLine();
                    if (!playlist.playSong(playTitle)) {
                        System.out.println("Song not found in the playlist.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting Music Playlist Manager...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}