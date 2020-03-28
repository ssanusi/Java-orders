//package com.ssanusi.javaorders;
//
//import com.ssanusi.javaorders.models.Agent;
//import com.ssanusi.javaorders.services.AgentService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import javax.transaction.Transactional;
//import java.util.List;
//
//@Transactional
//@Component
//public class SeedData implements CommandLineRunner {
//
//    AgentService agentService;
//
//    @Autowired
//    public SeedData(AgentService agentService) {
//        this.agentService = agentService;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//
//        agentService.save(new Agent("Ramasundar", "ramasundar@example.com", 0.15, "Bangalore", "077-25814763", ""));
//        agentService.save(new Agent("Alex", "alex@exaple.com", 0.13, "London", "075-12458969", ""));
//        agentService.save(new Agent("Alford'", "alford@example.com", 0.12, "New York", "044-25874365", ""));
//        agentService.save(new Agent("Ravi", "ravi@example.com", 0.15, "Bangalore", "077-45625874", ""));
//        agentService.save(new Agent("Santakumar", "santakumar@example.com", 0.14, "Chennai", "007-22388644", ""));
//        agentService.save(new Agent("Lucida", "lucida@example.com", 0.12, "San Jose", "044-52981425", ""));
//        agentService.save(new Agent("Anderson", "anderson@example.com", 0.13, "Brisban", "045-21447739", ""));
//        agentService.save(new Agent("Subbarao", "subbarao@example.com", 0.14, "Bangalore", "077-12346674", ""));
//        agentService.save(new Agent("Mukesh", "mukesh@example.com", 0.11, "Mumbai", "029-12358964", ""));
//        agentService.save(new Agent("McDen", "mcDen@example.com", 0.15, "London", "078-22255588", ""));
//        agentService.save(new Agent("Ivan", "ivan@example.com", 0.15, "Torento", "008-22544166", ""));
//        agentService.save(new Agent("Benjamin", "benjamin@example.com", 0.11, "Hampshair", "008-22536178", ""));
//
//        List<Agent> agentList = agentService.findAll();
//        System.out.println("\n********************* SEED DATA ***********************");
//        for (Agent r : agentList)
//            System.out.println(r);
//        System.out.println("\n********************* SEED DATA ***********************");
//    }
//}
//

