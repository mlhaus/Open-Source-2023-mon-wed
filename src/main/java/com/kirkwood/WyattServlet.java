package com.kirkwood;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "wyattServlet", value = {"/wyatt_conversion"})
public class WyattServlet extends HttpServlet {
    Map<String, String> results = new HashMap<>();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("WEB-INF/contribution5/wyatt_conversion.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fromConversion = req.getParameter("fromConversion");
        String toConversion = req.getParameter("toConversion");
        String amount = req.getParameter("amount");
        results.clear();
        results.put("fromConversion", fromConversion);
        results.put("toConversion", toConversion);
        results.put("amount", amount);
        req.setAttribute("results", results);
        convertAmount(fromConversion, toConversion, amount);
        req.getRequestDispatcher("WEB-INF/contribution5/wyatt_conversion.jsp").forward(req, resp);
    }

    private void convertAmount(String fromConversion, String toConversion, String amount) {
        if(fromConversion == null || !fromConversion.equals("pt") && !fromConversion.equals("c") && !fromConversion.equals("qrt")){
            results.put("fromConversionError", "Please select a type to convert from.");
        }
        if(toConversion == null || !toConversion.equals("pt") && !toConversion.equals("c") && !toConversion.equals("qrt")){
            results.put("toConversionError", "Please select a type to convert to.");
        }
        if(!isANumber(amount)) {
            results.put("amountError", "Please input a valid number");
        }
        if(!results.containsKey("fromConversionError") && !results.containsKey("toConversionError") && !results.containsKey("amountError")) {
            double tempDouble = Double.parseDouble(amount);
            if(fromConversion.equals("pt") && toConversion.equals("c")){
                double amountConverted = tempDouble * 2;
                results.put("amountConverted", String.format("%sPt = %sC", amount, round(amountConverted)));
            } else if(fromConversion.equals("pt") && toConversion.equals("qrt")){
                double amountConverted = tempDouble / 2;
                results.put("amountConverted", String.format("%sPt = %sQrt", amount, round(amountConverted)));
            } else if(fromConversion.equals("c") && toConversion.equals("pt")){
                double amountConverted = tempDouble / 2;
                results.put("amountConverted", String.format("%sC = %sPt", amount, round(amountConverted)));
            } else if(fromConversion.equals("c") && toConversion.equals("qrt")){
                double amountConverted = tempDouble / 4;
                results.put("amountConverted", String.format("%sC = %sQrt", amount, round(amountConverted)));
            } else if(fromConversion.equals("qrt") && toConversion.equals("pt")){
                double amountConverted = tempDouble * 2;
                results.put("amountConverted", String.format("%sQrt = %sPt", amount, round(amountConverted)));
            } else if(fromConversion.equals("qrt") && toConversion.equals("c")){
                double amountConverted = tempDouble * 4;
                results.put("amountConverted", String.format("%sQrt = %sC", amount, round(amountConverted)));
            }
            else {
                if(fromConversion.equals("pt")){
                    results.put("amountConverted", String.format("%sPt = %sPt", amount, amount));
                } else if(fromConversion.equals("c")){
                    results.put("amountConverted", String.format("%sC = %sC", amount, amount));
                } else if(fromConversion.equals("qrt")){
                    results.put("amountConverted", String.format("%sQrt = %sQrt", amount, amount));
                }
            }
        }
    }

    public boolean isANumber(String num){
        try {
            Double.parseDouble(num);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public String round(double num) {
        DecimalFormat df = new DecimalFormat("#.##########");
        df.setRoundingMode(RoundingMode.HALF_UP);
        return df.format(num);
    }
}
