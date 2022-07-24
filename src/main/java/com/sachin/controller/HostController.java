package com.sachin.controller;

import com.sachin.model.Container;
import com.sachin.model.Host;
import com.sachin.repository.ContainerRepository;
import com.sachin.repository.HostRepository;
import com.sachin.service.ContainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class HostController {

    @Autowired
    HostRepository hostRepository;


    @Autowired
    ContainerService containerService;

    public HostController(HostRepository hostRepository) {
        this.hostRepository = hostRepository;
    }

    @PostMapping("/host/create")
    Host createHost(@RequestBody Host host){


        return  hostRepository.save(host);
    }

    @GetMapping("/hosts")
    List<Host> getHosts(){
        List<Host> hosts = hostRepository.findAll();
        return hosts;
    }

    @GetMapping("/hosts/{id}")
    Optional<Host> getHostById(@PathVariable("id") int id){
        Optional<Host> host = hostRepository.findById(id);
        return host;
    }


    @GetMapping("/hosts/{id}/containers")
    List<Container> getContainersForOneHost(@PathVariable("id") int id){

        try{

            Optional<Host> host = hostRepository.findById(id);
            List<Container> containers = host.get().getContainers();
            return containers;
        }
        catch (Exception e){
            return new ArrayList<>();
        }

    }

}
