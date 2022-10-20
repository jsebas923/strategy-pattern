package co.com.juanse.consumer.strategy;

import java.util.List;

public interface Strategy {
    Double getMediaUseAgent(List<Double> doubleList);
    String getStaircaseUseAgent(int sizes);
}
