package hr.margeta.code.shiftremotedemo;

import reactor.core.publisher.Flux;

public interface GreetingRepository {

    Flux<GreetingResource> findAll();
}
