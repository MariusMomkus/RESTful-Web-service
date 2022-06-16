package lt.viko.eif.marmomkus;

import lt.viko.eif.marmomkus.model.GGArena;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class GGArenaService {

    private GGArena ggArena = new GGArena(1);

    public GameRepository gameRepository = new GameRepository(ggArena);
    public PlayingRoomRepository playingRoomRepository = new PlayingRoomRepository(ggArena);

    @Bean
    public static GGArena ggArena() {
        return new GGArena();
    }

}