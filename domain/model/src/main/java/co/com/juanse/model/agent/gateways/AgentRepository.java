package co.com.juanse.model.agent.gateways;

import co.com.juanse.model.agent.AgentRequest;

import java.util.List;

public interface AgentRepository {

    Double getMedia(AgentRequest agentRequest);
    String getStaircase(AgentRequest agentRequest);
}
