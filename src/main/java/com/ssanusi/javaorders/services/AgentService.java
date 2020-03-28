package com.ssanusi.javaorders.services;

import com.ssanusi.javaorders.models.Agent;

import java.util.List;

public interface AgentService {

    List<Agent> findAll();

    Agent findById(long agentCode);

    Agent save(Agent agent);

    Agent update(Agent agentToUpdate, long agentCode);

    void delete(long agentCode);

}
