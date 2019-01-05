package org.soraworld.curve;

public class PixelCurve {

    private double theta_min;
    private double theta_max;
    private static double PI = 3.1415926D;

    public double evaluate_min_r() {
        double min = fun(theta_min);
        double theta = theta_min + PI / 4;
        while (theta <= theta_max) {
            double r = fun(theta);
            if (r < min) min = r;
            theta = theta + PI / 4;
        }
        return min;
    }

    public double fun(double theta) {
        return 0.0;
    }
}
