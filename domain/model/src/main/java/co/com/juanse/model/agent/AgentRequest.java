package co.com.juanse.model.agent;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder(toBuilder = true)
public class AgentRequest {

    private final String agentName;
    private final int size;
    private final List<Double> doubleList;
}
