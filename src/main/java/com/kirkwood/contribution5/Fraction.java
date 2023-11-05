package com.kirkwood.contribution5;

import java.math.BigInteger;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction() {
        this.numerator = 1;
        this.denominator = 1;
    }

    public Fraction(int numerator, int denominator) {
        setNumerator(numerator);
        setDenominator(denominator);
    }

    public String toString() {
        return this.numerator + "/" + this.denominator;
    }

    public int getNumerator() {
        return this.numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return this.denominator;
    }

    public void setDenominator(int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator can not be zero");
        }
        this.denominator = denominator;
    }

    public static int greatestCommonDivisor(int num1, int num2) {
        BigInteger i = BigInteger.valueOf(num1).gcd(BigInteger.valueOf(num2));
        int gcd = Integer.parseInt(i.toString());
        return gcd;
    }

    //    Pair Programming Activity 2
    public Fraction simplify() {

        int gcd = greatestCommonDivisor(numerator, denominator);
        // The following statement is given due to the instructions.
        // However, I only needed, if the denominator is less than zero.
        if ((numerator >= 0 && denominator < 0) || (numerator < 0 && denominator < 0)) {
            numerator = numerator * -1;
            denominator = denominator * -1;
        }
        Fraction simplifyFraction = new Fraction(numerator / gcd, denominator / gcd);
        return simplifyFraction;
    }

    //        int gcd = greatestCommonDivisor(this.numerator, this.denominator);
//        Fraction simplifiedFraction = new Fraction(this.numerator / gcd, this.denominator / gcd);
//        if(simplifiedFraction.numerator >= 0 && simplifiedFraction.denominator < 0
//                || simplifiedFraction.numerator < 0 && simplifiedFraction.denominator < 0) {
//            simplifiedFraction.numerator *= -1;
//            simplifiedFraction.denominator *= -1;
//
//        }
//        return simplifiedFraction;
//    }

    //    Unit Test Assignment Part 1
    public String mixedNumber() {
        simplify();
        Fraction fraction = new Fraction(numerator, denominator);
        String result = null;
        int digit = numerator / denominator;
        int newNum = numerator % denominator;
        if (denominator == 1) {
            result = Integer.toString(numerator);
        } else if (numerator == 0) {
            result = Integer.toString(0);
        } else if (numerator == denominator) {
            result = "1";
        } else if (numerator > denominator || -numerator > denominator) {
            if (numerator % denominator == 0) {
                result = Integer.toString(digit);
            } else if (digit < 0 && newNum < 0) {
                newNum = newNum * -1;
                Fraction newFrac = new Fraction(newNum, denominator);
                String temp = String.valueOf(newFrac.simplify());
                result = digit + " " + temp;
            } else if (digit < 0 && denominator < 0) {
                denominator = denominator * -1;
                Fraction newFrac = new Fraction(newNum, denominator);
                String temp = String.valueOf(newFrac.simplify());
                result = digit + " " + temp;
            } else {
                Fraction newFrac = new Fraction(newNum, denominator);
                String temp = String.valueOf(newFrac.simplify());
                result = digit + " " + temp;
            }
        } else if (numerator < denominator) {
            result = String.valueOf(fraction.simplify());
        }
        return result;
    }
}


