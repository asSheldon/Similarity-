package com.company;

public class EuclideanMetric {
   //欧几里得距离
    public double method(double[] vector1, double[] vector2){
        double distance = 0;

        for(int i = 0; i < vector1.length; i++){
            double temp = Math.pow(vector1[i] - vector2[i], 2);
            distance += temp;
        }

        return distance;
    }

}
