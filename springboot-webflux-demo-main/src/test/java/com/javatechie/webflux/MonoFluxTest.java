package com.javatechie.webflux;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class MonoFluxTest {

    @Test
    public void testMonoV1(){
        Mono<String> monoString = Mono.just("javaMono");
        monoString.subscribe(System.out::println);
    }

    @Test
    public void testMonoV2(){
        Mono<String> monoString = Mono.just("javaMono").log();
        monoString.subscribe(System.out::println);
    }

    @Test
    public void testMonoV3 (){
        Mono<?> monoString = Mono.just("javaMono")
                .then(Mono.error(new RuntimeException("Se generó una Exception")))
                .log();
        monoString.subscribe(System.out::println,(e)->System.out.println(e.getMessage()));
    }

    @Test
    public void testFlux01(){
        Flux<String> fluxString = Flux.just("Spring", "Spring Boot", "Hibernate", "Microservice");

        fluxString.subscribe(System.out::println);
    }

    @Test
    public void testFlux02(){
        Flux<String> fluxString = Flux.just("Spring", "Spring Boot", "Hibernate", "Microservice").log();

        fluxString.subscribe(System.out::println);
    }

    @Test
    public void testFlux03(){
        Flux<String> fluxString = Flux.just("Spring", "Spring Boot", "Hibernate", "Microservice")
                .concatWithValues("AWS")
                .log();

        fluxString.subscribe(System.out::println);
    }

    @Test
    public void testFlux04(){
        Flux<String> fluxString = Flux.just("Spring", "Spring Boot", "Hibernate", "Microservice")
                .concatWithValues("AWS")
                .concatWith(Flux.error(new RuntimeException("Exception occured in Flux")))
                .log();

        fluxString.subscribe(System.out::println,(e)->System.out.println(e.getMessage()));
    }

    @Test
    public void testFlux05(){
        Flux<String> fluxString = Flux.just("Spring", "Spring Boot", "Hibernate", "microservice")
                .concatWithValues("AWS")
                .concatWith(Flux.error(new RuntimeException("Exception occured in Flux")))
                .concatWithValues("Cloud")
                .log();

        fluxString.subscribe(System.out::println,(e)->System.out.println(e.getMessage()));
    }
}
