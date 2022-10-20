package co.com.juanse.agent;

import co.com.juanse.consumer.agent.AgentBConsumer;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AgentBConsumerTest {

    @Test
    void getMediaUseAgentListEmpytTest(){
        AgentBConsumer agentBConsumer = new AgentBConsumer();

        List<Double> doubleList = new ArrayList<>();
        Double result = agentBConsumer.getMediaUseAgent(doubleList);
        assertEquals(0D, result);
    }

    @Test
    void getMediaUseAgentListTest(){
        AgentBConsumer agentBConsumer = new AgentBConsumer();

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(2.0);
        doubleList.add(3.0);
        doubleList.add(1.0);
        doubleList.add(4.0);
        doubleList.add(5.0);
        Double result = agentBConsumer.getMediaUseAgent(doubleList);
        assertEquals(2.18978102189781, result);
    }
}
