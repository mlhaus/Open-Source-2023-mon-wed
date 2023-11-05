package com.kirkwood.opensource2023monwed;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import jakarta.servlet.*;

import java.io.IOException;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

import static java.lang.Integer.parseInt;

@WebServlet(name = "fractionconvert", value = "/fractionconvert")
public class FractionConvert extends HttpServlet {
    private static Map<String, String> results = new HashMap<>();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("WEB-INF/index.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String num1 = request.getParameter("num1");
        String choice = request.getParameter("choice");
        results.clear();
        String[] fraction = num1.split("/");
        try {
            if(choice.equals("simplify")){
                Fraction fractionObj = new Fraction(parseInt(fraction[0]), parseInt(fraction[1]));
                results.put("results", fractionObj.simplify().toString());
            }else{
                Fraction fractionObj = new Fraction(parseInt(fraction[0]), parseInt(fraction[1]));
                results.put("results", fractionObj.mixedNumber().toString());
            }
        }
        catch(Exception ex){
            results.put("results", "Improper input " + "\n" + ex);
        }
        request.setAttribute("results",results);
        request.getRequestDispatcher("WEB-INF/index.jsp").forward(request,response);
    }
}


class Fraction {
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

    public int getNumerator(){
        return this.numerator;
    }

    public void setNumerator (int numerator){
        this.numerator=numerator;
    }

    public int getDenominator(){
        return this.denominator;
    }

    public void setDenominator (int denominator){
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator can not be zero");
        }
        this.denominator = denominator;
    }
    public static int greatestCommonDivisor(int num1, int num2){
        BigInteger i = BigInteger.valueOf(num1).gcd(BigInteger.valueOf(num2));
        int gcd = Integer.parseInt(i.toString());
        return gcd;
    }

    public Fraction simplify() {
        int gcd = greatestCommonDivisor(this.numerator, this.denominator);
        Fraction simplifiedFraction = new Fraction(this.numerator / gcd, this.denominator / gcd);
        if(simplifiedFraction.numerator >= 0 && simplifiedFraction.denominator < 0
                || simplifiedFraction.numerator < 0 && simplifiedFraction.denominator < 0) {
            simplifiedFraction.numerator *= -1;
            simplifiedFraction.denominator *= -1;
        }
        return simplifiedFraction;
    }

    public String mixedNumber(){
        Fraction simple = simplify();
        String returnMsg = "";
        if(simple.getDenominator() == 1){
            returnMsg = Integer.toString(simple.getNumerator());
        }
        else if(simple.getNumerator() == 0){
            returnMsg = "0";
        }
        else if((simple.getNumerator() > simple.getDenominator()) || (simple.getNumerator() < 0 && simple.getNumerator() * -1 > simple.getDenominator())){
            int remain = simple.getNumerator() % simple.getDenominator();
            int whole = (simple.getNumerator() - remain) / simple.getDenominator();
            if(remain < 0){
                remain *= -1;
            }
            String mixedNum = whole + " " + remain + "/" + simple.getDenominator();
            returnMsg = mixedNum;
        }
        else{
            returnMsg = simple.toString();
        }
        return returnMsg;
    }



}
