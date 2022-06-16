package lt.viko.eif.marmomkus;

import lt.viko.eif.marmomkus.model.GGArena;
import lt.viko.eif.marmomkus.model.Game;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class GameRepository {

    private GGArena ggArena;

    public GameRepository(GGArena ggArena) {
        this.ggArena = ggArena;
    }

    public Game get(Integer id){
        return ggArena.getGames().stream().filter(game -> game.getId() == id).findFirst().orElse(null);
    }

    public List<Game> getAll(){
        return ggArena.getGames();
    }

    public void insert(Game game){
        ggArena.getGames().add(game);
    }

    public void update(Game game){
        Game game1 = this.get(game.getId());
        Integer integer = ggArena.getGames().indexOf(game1);
        ggArena.getGames().set(integer,game);
    }

    public void delete(Integer id){
        ggArena.getGames().remove(this.get(id));
    }
}
