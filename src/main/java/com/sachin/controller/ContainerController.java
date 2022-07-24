package com.sachin.controller;

import com.sachin.model.Container;
import com.sachin.model.Host;
import com.sachin.repository.ContainerRepository;
import com.sachin.repository.HostRepository;
import com.sachin.service.ContainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.*;

import java.nio.charset.Charset;
import java.util.*;

@RestController
public class ContainerController {

    @Autowired
    ContainerRepository containerRepository;

    @Autowired
    ContainerService containerService;

    public ContainerController(ContainerRepository containerRepository, ContainerService containerService) {
        this.containerRepository = containerRepository;
        this.containerService = containerService;
    }

    @PostMapping("/container/create")
    Container createContainer(@RequestBody Container container){

        String generatedString = containerService.getRandomString();
        container.setContainer_name(generatedString);

        containerRepository.save(container);
        return container;
    }

    @GetMapping("/containers")
    List<Container> getAllControllers(){
        List<Container> containers = containerRepository.findAll();
        return containers;
    }

    @GetMapping("/containers/{id}")
    Optional<Container> getCOntrollerById(@PathVariable("id") int id){

        Optional<Container> controller = containerRepository.findById(id);
        return controller;
    }

}
