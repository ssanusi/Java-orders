package com.ssanusi.javaorders.controllers;

import com.ssanusi.javaorders.models.Agent;
import com.ssanusi.javaorders.services.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/agents")
public class AgentController {

    @Autowired
    private AgentService agentService;

    @GetMapping(name = "", produces = {"application/json"})
    public ResponseEntity<?> getAgents() {
        List<Agent> agents = agentService.findAll();
        return new ResponseEntity<>(agents, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}", produces = {"application/json"})
    public ResponseEntity<?> getById(@PathVariable UUID id) {
        return new ResponseEntity<>(agentService.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "", consumes = {"application/json"})
    public ResponseEntity<?> addAgent(@Valid @RequestBody Agent agent) {
        agentService.save(agent);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }


}
