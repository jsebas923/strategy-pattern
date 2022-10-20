package co.com.juanse.consumer.agent;

import co.com.juanse.consumer.strategy.Context;
import co.com.juanse.model.agent.AgentRequest;
import co.com.juanse.model.agent.gateways.AgentRepository;

public class AgentRestConsumer implements AgentRepository {

    private Context context;
    @Override
    public Double getMedia(AgentRequest agentRequest) {
        if(agentRequest.getAgentName().equalsIgnoreCase("A")){
            context = new Context(new AgentAConsumer());
        } else if (agentRequest.getAgentName().equalsIgnoreCase("B")) {
            context = new Context(new AgentBConsumer());
        } else if (agentRequest.getAgentName().equalsIgnoreCase("C")) {
            context = new Context(new AgentCConsumer());
        }else {
            context = new Context(new GenericConsumer());
        }
        return context.executeStrategyGetMedia(agentRequest.getDoubleList());
    }

    @Override
    public String getStaircase(AgentRequest agentRequest) {
        if(agentRequest.getAgentName().equalsIgnoreCase("A")){
            context = new Context(new AgentAConsumer());
        } else if (agentRequest.getAgentName().equalsIgnoreCase("B")) {
            context = new Context(new AgentBConsumer());
        } else if (agentRequest.getAgentName().equalsIgnoreCase("C")) {
            context = new Context(new AgentCConsumer());
        }else {
            context = new Context(new GenericConsumer());
        }
        return context.excuteStrategyGetStarir(agentRequest.getSize());
    }
}
