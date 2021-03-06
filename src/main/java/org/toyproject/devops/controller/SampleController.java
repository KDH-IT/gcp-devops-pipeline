package org.toyproject.devops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class SampleController {
    @GetMapping("/")
    public Mono<String> hello(){
        return Mono.just("hello");
    }

    @PostMapping("/")
    public Mono<String> hello2(){
        return Mono.just("hello");
    }
}
