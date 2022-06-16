package lt.viko.eif.marmomkus.model;

public class PlayingRoom {
    private int id;
    private int numberOfComputers;

    public PlayingRoom() {
    }

    public PlayingRoom(int id) {
        this.id = id;
        this.numberOfComputers = 30;
    }

    public int getNumberOfComputers() {
        return numberOfComputers;
    }

    public void setNumberOfComputers(int numberOfComputers) {
        this.numberOfComputers = numberOfComputers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

