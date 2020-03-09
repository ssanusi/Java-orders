package com.ssanusi.javaorders.repositories;

import com.ssanusi.javaorders.models.Agent;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface AgentRepository extends CrudRepository<Agent, UUID> {
}
