package lt.viko.eif.marmomkus.model;

public class Game {
    private String name;
    private int id;
    private  PlayingRoom playingRoom;
    private String TimeOfTaken;

    public Game() {
    }

    public Game(String name, int id,PlayingRoom playingRoom, String TimeOfTaken) {
        this.name = name;
        this.id = id;
        this.playingRoom = playingRoom;
        this.TimeOfTaken = TimeOfTaken;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PlayingRoom getPlayingRoom() {
        return playingRoom;
    }

    public void setPlayingRoom(PlayingRoom playingRoom) {
        this.playingRoom = playingRoom;
    }


    public String getTimeOfTaken() {
        return TimeOfTaken;
    }

    public void setTimeOfTaken(String timeOfTaken) {
        this.TimeOfTaken = timeOfTaken;
    }

}

