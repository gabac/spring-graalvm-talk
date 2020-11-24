package ch.aaap.pedia.talkapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

@RestController
public class APIController {
    
    @GetMapping("talks")
    public Flux<String> getTalks() {
        return Flux.just("Talk1", "Talk2");
    }
}
