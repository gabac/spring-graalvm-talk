package ch.aaap.pedia.talkapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Value;


@RestController
public class APIController {
    
    @GetMapping("talks")
    public Flux<String> getTalks() {
        return Flux.just("Talk1", "Talk2");
    }

    @GetMapping("answer") 
    public Mono<Integer> getAnswer() {
        Context polyglot = Context.create();
        Value result = polyglot.eval("js", "[10,10,20,2].reduce((a,v) => a +v)");
        return Mono.just(result.asInt());
    }
}
