package com.kirkwood.opensource2023monwed;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "mitchellservlet", value = "/mitchellservlet")
public class MitchellServlet extends HttpServlet {
    Map<String,String> result = new HashMap<>();

    private int numerator;

    private int denominator;

    private String select;
    //
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            numerator = Integer.parseInt(req.getParameter("numerator"));
            denominator = Integer.parseInt(req.getParameter("denominator"));
            select = req.getParameter("fractionType");
            result.clear();
            if( select.equals("mixed") ) {
                result.put("convertOutput", this.MixedNumber() );
            } else {
                result.put("convertOutput", this.SimplifyNumber() );
            }

        } catch (Exception e) {
            if (req.getParameter("numerator") == "" && req.getParameter("denominator") == "") {
                result.put("convertOutput", "Enter a Numerator and Denominator");
            } else {
                result.put("convertOutput", "NaN");
            }
        }
        req.setAttribute("result",result);
        req.getRequestDispatcher("WEB-INF/mitchelljsp.jsp").forward(req,resp);
    }
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.getRequestDispatcher("WEB-INF/mitchelljsp.jsp").forward(req,resp);
    }

    public String MixedNumber() {
        String num = "";

        if (this.numerator < 1 && this.denominator < 1) {
            this.denominator = Math.abs(this.denominator);
            this.numerator = Math.abs(this.numerator);
        }

        if (this.denominator == 1) {
            return Integer.toString(this.numerator);
        }
        if (this.numerator == 0) {
            return "0";
        }
        if (this.numerator == this.denominator) {
            return Integer.toString(this.numerator);
        }
        int headNum = (this.numerator / this.denominator);
        int frac = this.numerator % this.denominator;

        if (headNum < 1) {
            frac = Math.abs(frac);
            this.denominator = Math.abs(this.denominator);
        }

        if (frac != 0 && headNum != 0) {
            num = (headNum + " " + frac + "/" + this.denominator);
        } else if (headNum == 0) {
            num = (frac + "/" + this.denominator);
        } else {
            return Integer.toString(headNum);
        }
        return num;
    }

    public String SimplifyNumber() {
        int gcd = greatestCommonDivisor(this.numerator, this.denominator);
        this.numerator /= gcd;
        this.denominator /= gcd;
        if(this.numerator >= 0 && this.denominator < 0 || this.numerator < 0 && this.denominator < 0) {
            this.numerator *= -1;
            this.denominator *= -1;
        }
        return (this.numerator + "/" + this.denominator);
    }

    public static int greatestCommonDivisor(int num1, int num2) {
        BigInteger i = BigInteger.valueOf(num1).gcd(BigInteger.valueOf(num2));
        int gcd = Integer.parseInt(i.toString());
        return gcd;
    }
}

