package com.ssanusi.javaorders.services;

import com.ssanusi.javaorders.models.Agent;
import com.ssanusi.javaorders.repositories.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Transactional
@Service(value = "agentService")
public class AgentServiceImplementation implements AgentService {

    @Autowired
    private AgentRepository agentrepo;

    @Override
    public List<Agent> findAll() {
        List<Agent> agentList = new ArrayList<>();
        agentrepo.findAll().iterator().forEachRemaining(agentList::add);
        return agentList;
    }

    @Override
    public Agent findById(UUID agentCode) {

        return agentrepo.findById(agentCode).orElseThrow(() -> new EntityNotFoundException("Not Found " + agentCode));
    }

    @Transactional
    @Override
    public Agent save(Agent agent) {
        Agent newAgent = new Agent();
        newAgent.setAgentName(agent.getAgentName());
        newAgent.setCommission(agent.getCommission());
        newAgent.setCountry(agent.getCountry());
        newAgent.setWorkingArea(agent.getWorkingArea());
        newAgent.setPhone(agent.getPhone());
        newAgent.setEmail(agent.getEmail());
        return agentrepo.save(newAgent);
    }

    @Override
    public Agent update(Agent agentToUpdate, UUID agentCode) {
        return null;
    }

    @Override
    public void delete(UUID agentCode) {

    }
}
