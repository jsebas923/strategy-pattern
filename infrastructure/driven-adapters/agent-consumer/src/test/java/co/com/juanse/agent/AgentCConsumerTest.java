package co.com.juanse.agent;

import co.com.juanse.consumer.agent.AgentCConsumer;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AgentCConsumerTest {

    @Test
    void getMediaUseAgentListEmpytTest(){
        AgentCConsumer agentCConsumer = new AgentCConsumer();

        List<Double> doubleList = new ArrayList<>();
        Double result = agentCConsumer.getMediaUseAgent(doubleList);
        assertEquals(0D, result);
    }

    @Test
    void getMediaUseAgentListTest(){
        AgentCConsumer agentCConsumer = new AgentCConsumer();

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(2.0);
        doubleList.add(3.0);
        doubleList.add(1.0);
        doubleList.add(4.0);
        doubleList.add(5.0);
        Double result = agentCConsumer.getMediaUseAgent(doubleList);
        assertEquals(3D, result);
    }
}
