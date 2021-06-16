package com.java.bankApplication.controller;

import com.java.bankApplication.model.Demo;
import com.java.bankApplication.repository.DemoRepository;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/controller")
public class Controller {

    private DemoRepository repository;

    public Controller(DemoRepository repository){
        this.repository = repository;
    }

    @RequestMapping("/")
    public String index(@RequestParam(name="greeting", defaultValue = "Hello") String greeting,
            @RequestParam(name="name", defaultValue = "World") String name){
        return greeting + ", " + name + "!";
    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET, produces = "application/json")
    public Iterable<Demo> getAll(){
        return repository.findAll();
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST, consumes = "application/json")
    public void add(@RequestBody Demo demo){
        repository.save(demo);
    }
}
