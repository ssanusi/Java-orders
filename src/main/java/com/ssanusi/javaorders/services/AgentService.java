package com.ssanusi.javaorders.services;

import com.ssanusi.javaorders.models.Agent;

import java.util.List;
import java.util.UUID;

public interface AgentService {

    List<Agent> findAll();

    Agent findById(UUID agentCode);

    Agent save(Agent agent);

    Agent update(Agent agentToUpdate, UUID agentCode);

    void delete(UUID agentCode);

}
