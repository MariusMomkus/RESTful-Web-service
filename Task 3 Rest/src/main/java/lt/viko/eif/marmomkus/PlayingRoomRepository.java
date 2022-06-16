package lt.viko.eif.marmomkus;

import lt.viko.eif.marmomkus.model.GGArena;
import lt.viko.eif.marmomkus.model.PlayingRoom;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PlayingRoomRepository {

    private GGArena ggArena;

    public PlayingRoomRepository(GGArena ggArena) {
        this.ggArena = ggArena;
    }

    public PlayingRoom get(int id) {
        return ggArena.getPlayingRooms().stream().filter(playingRoom -> playingRoom.getId() == id).findFirst().orElse(null);
    }

    public List<PlayingRoom> getAll(){
        return ggArena.getPlayingRooms();
    }

    public void insert(PlayingRoom playingRoom){
        ggArena.getPlayingRooms().add(playingRoom);
    }

    public void update(PlayingRoom playingRoom){
        PlayingRoom playingRoom1 = this.get(playingRoom.getId());
        Integer integer = ggArena.getPlayingRooms().indexOf(playingRoom1);
        ggArena.getPlayingRooms().set(integer,playingRoom);
    }

    public void delete(Integer id){
        ggArena.getPlayingRooms().remove(this.get(id));
    }
}
