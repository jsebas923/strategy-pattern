package co.com.juanse.consumer.agent;

import co.com.juanse.consumer.strategy.Strategy;

import java.util.List;

public class AgentAConsumer  implements Strategy {
    @Override
    public Double getMediaUseAgent(List<Double> doubleList) {
        Double total = 0D;
        if (!doubleList.isEmpty()){
            for (int i= 0; i <doubleList.size(); i++){
                total += doubleList.get(i);
            }
            return total/doubleList.size();
        }
        return total;
    }

    @Override
    public String getStaircaseUseAgent(int size) {
        String result ="";
        for(int i=0; i< size; i++){
            String flat = "";
            for (int j=0; j < size-1; j++){
                flat = flat + " ";
            }
            for (int k = 0; k< i+1; k++){
                flat = flat + "*";
            }
            result = result+flat;

        }
        return result;
    }
}
