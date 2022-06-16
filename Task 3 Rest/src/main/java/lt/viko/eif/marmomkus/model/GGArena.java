package lt.viko.eif.marmomkus.model;
import java.util.ArrayList;
import java.util.List;

public class GGArena {
    private List<Game> games = new ArrayList<>();
    private List<PlayingRoom> playingRooms = new ArrayList<>();

    public GGArena() {
    }

    public GGArena (int x) {
        this.playingRooms.add(new PlayingRoom(1));
        this.playingRooms.add(new PlayingRoom(2));
        this.playingRooms.add(new PlayingRoom(3));

        this.games.add (new Game( "Diablo",1, new PlayingRoom(1),"2022/05/21"));
        this.games.add (new Game( "StarTrek",2, new PlayingRoom(2),"2022/05/22"));
        this.games.add (new Game( "StarWars",3 , new PlayingRoom(3),"2022/05/23"));
    }

    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> films) {
        this.games = games;
    }

    public List<PlayingRoom> getPlayingRooms() {
        return playingRooms;
    }

    public void setPlayingRooms(List<PlayingRoom> theaterRooms) {
        this.playingRooms = theaterRooms;
    }
}

