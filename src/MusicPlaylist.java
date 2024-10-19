class Song {
    String title;
    Song next;

    Song(String title) {
        this.title = title;
        this.next = null;
    }
}

public class MusicPlaylist {
    private Song head;

    public MusicPlaylist() {
        head = null;
    }

    public void appendSong(String title) {
        Song newSong = new Song(title);
        if (head == null) {
            head = newSong;
            return;
        }
        Song current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newSong;
    }

    public void printPlaylist() {
        if (head == null) {
            System.out.println("Playlist kosong");
            return;
        }
        System.out.println("Daftar lagu dalam playlist:");
        Song current = head;
        int index = 1;
        while (current != null) {
            System.out.println(index + ". " + current.title);
            current = current.next;
            index++;
        }
    }

    public static void main(String[] args) {
        MusicPlaylist playlist = new MusicPlaylist();

        playlist.appendSong("Bohemian Rhapsody");
        playlist.appendSong("Stairway to Heaven");
        playlist.appendSong("Imagine");

        playlist.printPlaylist();
    }
}