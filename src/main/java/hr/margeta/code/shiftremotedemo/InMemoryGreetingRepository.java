package hr.margeta.code.shiftremotedemo;

import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

import java.util.List;

@Repository
public class InMemoryGreetingRepository implements GreetingRepository {

    private final static List<GreetingResource> GREETINGS = List.of(
            new GreetingResource(1, "Hello from Shift Remote"),
            new GreetingResource(2, "Hello from AWS EKS container running on AWS Fargate"),
            new GreetingResource(3, "Hello from Spring Boot")
    );

    @Override
    public Flux<GreetingResource> findAll() {
        return Flux.fromIterable(GREETINGS);
    }
}
