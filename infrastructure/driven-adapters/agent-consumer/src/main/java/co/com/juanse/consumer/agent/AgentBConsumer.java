package co.com.juanse.consumer.agent;

import co.com.juanse.consumer.strategy.Strategy;

import java.util.List;

public class AgentBConsumer implements Strategy {
    @Override
    public Double getMediaUseAgent(List<Double> doubleList) {
        Double result = 0D;
        if(!doubleList.isEmpty()){
            double den = 0D;
            for (int i = 0; i<doubleList.size(); i++){
                den +=1/doubleList.get(i);
            }
            result = doubleList.size()/den;

        }
        return result;
    }

    @Override
    public String getStaircaseUseAgent(int sizes) {
        return null;
    }
}
