package lt.viko.eif.marmomkus.controller;

import lt.viko.eif.marmomkus.GGArenaService;
import lt.viko.eif.marmomkus.model.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/game")
public class GameController {

    @Autowired
    private GGArenaService ggArenaService;

    @GetMapping("/{id}")
    public ResponseEntity<Game> get(@PathVariable int id){
        return new ResponseEntity<>(ggArenaService.gameRepository.get(id), HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<List<Game>> getAll(){
        return new ResponseEntity<>(ggArenaService.gameRepository.getAll(), HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<Game> insert(@RequestBody Game game){
        ggArenaService.gameRepository.insert(game);
        return new ResponseEntity<>(game, HttpStatus.OK);
    }

    @PutMapping("/")
    public ResponseEntity<Game> update(@RequestBody Game game){
        ggArenaService.gameRepository.update(game);
        return new ResponseEntity<>(game, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Game> delete(@PathVariable int id){
        ggArenaService.gameRepository.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
