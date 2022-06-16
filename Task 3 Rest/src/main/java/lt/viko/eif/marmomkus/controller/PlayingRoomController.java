package lt.viko.eif.marmomkus.controller;

import lt.viko.eif.marmomkus.GGArenaService;
import lt.viko.eif.marmomkus.model.PlayingRoom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/playingRoom")
public class PlayingRoomController {

    @Autowired
    private GGArenaService ggArenaService;


    @GetMapping("/{id}")
    public ResponseEntity<PlayingRoom> get(@PathVariable int id){
        return new ResponseEntity<>(ggArenaService.playingRoomRepository.get(id), HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<List<PlayingRoom>> getAll(){
        return new ResponseEntity<>(ggArenaService.playingRoomRepository.getAll(), HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<PlayingRoom> insert(@RequestBody PlayingRoom playingRoom){
        ggArenaService.playingRoomRepository.insert(playingRoom);
        return new ResponseEntity<>(playingRoom, HttpStatus.OK);
    }

    @PutMapping("/")
    public ResponseEntity<PlayingRoom> update(@RequestBody PlayingRoom playingRoom){
        ggArenaService.playingRoomRepository.update(playingRoom);
        return new ResponseEntity<>(playingRoom, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<PlayingRoom> delete(@PathVariable int id){
        ggArenaService.playingRoomRepository.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }



}
