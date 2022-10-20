package co.com.juanse.consumer.agent;

import co.com.juanse.consumer.strategy.Strategy;
import java.util.Collections;
import java.util.List;

public class AgentCConsumer implements Strategy {
    @Override
    public Double getMediaUseAgent(List<Double> doubleList) {
        Double median =0D;
        if(!doubleList.isEmpty()){
            Collections.sort(doubleList);
            if(doubleList.size() % 2 == 0){
                median = doubleList.get(doubleList.size()/2) + doubleList.get(doubleList.size()/2 - 1)/2;
            }else{
                median = doubleList.get(doubleList.size()/2);
            }
        }
        return median;
    }

    @Override
    public String getStaircaseUseAgent(int sizes) {
        return null;
    }
}
