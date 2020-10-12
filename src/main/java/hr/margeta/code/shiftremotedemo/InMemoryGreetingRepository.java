package hr.margeta.code.shiftremotedemo;

import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public class InMemoryGreetingRepository implements GreetingRepository {

    @Override
    public Flux<GreetingResource> findAll() {
        return Flux.just(new GreetingResource(1, "Hello Shift Remote"));
    }
}
