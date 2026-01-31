package net.norivensuu.flux.utils;

import org.apfloat.Apfloat;
import org.apfloat.ApfloatMath;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.Arrays;

public class MathUtils {
    /**
     * Please reframe from using this function or '***' operator in general for any purposes, other than educational
     * Unsafely estimates a ^^ b using linear approximation.
     * @param a The base (BigFloat)
     * @param b The height (can be fractional)
     */
    // Why is this here??? You see...
    public static Apfloat estimateTetration(Apfloat a, Apfloat b) {
        long workingPrecision = 100;
        Apfloat A = new Apfloat(a.doubleValue(), workingPrecision);

        if (b.doubleValue() == 0) return new Apfloat(1, workingPrecision);
        if (b.doubleValue() == 1) return A;

        int floorB = (int) Math.floor(b.doubleValue());
        double fraction = b.doubleValue() - floorB;

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

    public static double estimateTetration(double a, double b) {
        long workingPrecision = 100;
        Apfloat result = estimateTetration(new Apfloat(a, workingPrecision),
                new Apfloat(b, workingPrecision));
        return result.doubleValue();
    }

    public static double power(double a, double b) {
        return Math.pow(a, b);
    }
}
