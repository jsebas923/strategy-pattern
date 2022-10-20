package co.com.juanse.agent;

import co.com.juanse.consumer.agent.AgentAConsumer;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AgentAConsumerTest {

    @Test
    void getMediaUseAgentTest(){
        AgentAConsumer agentAConsumer = new AgentAConsumer();

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(2.5);
        doubleList.add(3.0);
        doubleList.add(1.5);
        Double result = agentAConsumer.getMediaUseAgent(doubleList);
        assertEquals(2.3333333333333335, result);

    }
    @Test
    void getMediaUseAgentListEmpytTest(){
        AgentAConsumer agentAConsumer = new AgentAConsumer();

        List<Double> doubleList = new ArrayList<>();
        Double result = agentAConsumer.getMediaUseAgent(doubleList);
        assertEquals(0D, result);

    }
}
