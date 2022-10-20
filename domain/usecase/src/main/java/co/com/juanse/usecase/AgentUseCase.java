package co.com.juanse.usecase;

import co.com.juanse.model.agent.AgentRequest;
import co.com.juanse.model.agent.gateways.AgentRepository;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class AgentUseCase {

    private final AgentRepository agentRepository;

    public Double getMedia(AgentRequest agentRequest){
        return agentRepository.getMedia(agentRequest);
    }

    public String getStairCase(AgentRequest agentRequest){
        return agentRepository.getStaircase(agentRequest);
    }
}
