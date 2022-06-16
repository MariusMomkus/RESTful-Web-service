package lt.viko.eif.marmomkus.controller;

import lt.viko.eif.marmomkus.model.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template = "Welcome to GGArena %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "everyone") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
