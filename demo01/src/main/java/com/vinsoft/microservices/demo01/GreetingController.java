package com.vinsoft.microservices.demo01;

import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping(value = "greeting")
public class GreetingController {
    private final AtomicLong counter = new AtomicLong();
    private static final String template = "Hello %s";
    @GetMapping
    public Greeting greeting (@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
