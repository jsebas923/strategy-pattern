package co.com.juanse.consumer.agent;

import co.com.juanse.consumer.strategy.Strategy;

import java.util.List;

public class GenericConsumer implements Strategy {
    @Override
    public Double getMediaUseAgent(List<Double> doubleList) {
        return 0D;
    }

    @Override
    public String getStaircaseUseAgent(int sizes) {
        return "";
    }
}
