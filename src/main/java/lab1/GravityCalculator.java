package lab1;

/**
 * Created by mfong on 10/18/14.
 */
class GravityCalculator {
    static final double ACCEL_GRAVITY = -9.8;    // gravitational constant m/sec**2

    public static double computeAccelGravity(double positionInitial, double velocityInit, double timeDuration) {

        double positionFinal;

        // Kinematic equation -->  x(t) = 0.5 × at2 + vit + xi
        positionFinal = (0.5 * ACCEL_GRAVITY * Math.pow(timeDuration, 2)) + (velocityInit * timeDuration) + positionInitial;
        return positionFinal;
    }
}
