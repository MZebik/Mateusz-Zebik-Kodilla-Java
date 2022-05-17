package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast(){
        Map<String, Double> resultMap = new HashMap<>();

        for(Map.Entry<String,Double> temperature : temperatures.getTemperatures().entrySet()){
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double calculateAverageTemperature(){
        double sum = 0;
        for(Map.Entry<String,Double> temperature : temperatures.getTemperatures().entrySet()){
            sum += temperature.getValue();
        }
        double averageTemperature = sum/temperatures.getTemperatures().entrySet().size();
        return averageTemperature;
    }

    public double MedianTemperatures(){
        List<Double> tempereatureList = new ArrayList<>();
        double medianTemperature;
        for(Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            tempereatureList.add(temperature.getValue());
        }
        Collections.sort(tempereatureList);
      if(tempereatureList.size()%2 == 0){
          Double a = tempereatureList.get((int)(tempereatureList.size()/2));
          Double b = tempereatureList.get((int)((tempereatureList.size()/2)+1));
          medianTemperature = (a + b)/2;
          return medianTemperature;
      } else {
          medianTemperature = tempereatureList.get((int) ((tempereatureList.size() / 2) + 0.5));
          return medianTemperature;
      }
    }
}
