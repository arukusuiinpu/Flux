package net.norivensuu.flux.utils;

import org.apfloat.Apfloat;
import org.apfloat.ApfloatMath;

public class MathUtils {
    /**
     * Please reframe from using this function or '***' operator in general for any purposes, other than educational
     * Unsafely estimates a ^^ b using linear approximation.
     * @param a The base (BigFloat)
     * @param b The height (can be fractional)
     */
    // Why is this here??? You see...
    public static Apfloat estimateTetration(double a, double b) {
        long workingPrecision = 100;
        Apfloat A = new Apfloat(a, workingPrecision);

        if (b == 0) return new Apfloat(1, workingPrecision);
        if (b == 1) return A;

        int floorB = (int) Math.floor(b);
        double fraction = b - floorB;

        Apfloat result = (fraction == 0)
                ? A
                : ApfloatMath.pow(A, new Apfloat(fraction, workingPrecision));

        for (int i = 1; i < floorB; i++) {
            if (result.doubleValue() > 1e18) {
                throw new ArithmeticException("Exponentiation will lead to immediate overflow.");
            }
            result = ApfloatMath.pow(A, result);
        }

        return result;
    }
}
