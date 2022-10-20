package co.com.juanse.consumer.strategy;

import java.util.List;

public class Context {

    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public Double executeStrategyGetMedia(List<Double> doubleList){
        return strategy.getMediaUseAgent(doubleList);
    }
    public String excuteStrategyGetStarir(int sizes){
        return strategy.getStaircaseUseAgent(sizes);
    }
}
