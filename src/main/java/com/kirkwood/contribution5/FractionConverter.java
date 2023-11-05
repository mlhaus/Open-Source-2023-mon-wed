package com.kirkwood.contribution5;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "fractionConverter", value = "/convert-fraction")
public class FractionConverter extends HttpServlet {

    Map<String, String> results = new HashMap<>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("WEB-INF/contribution5/convert-fraction.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String conversion = req.getParameter("conversion");
        String numerator = req.getParameter("numerator");
        String denominator = req.getParameter("denominator");
        results.clear();
        results.put("conversion", conversion);
        results.put("numerator", numerator);
        results.put("denominator", denominator);
        convertFrac(conversion, numerator, denominator);
        req.setAttribute("results", results);
        req.getRequestDispatcher("WEB-INF/contribution5/convert-fraction.jsp").forward(req, resp);

    }

    private void convertFrac(String conversion, String numerator, String denominator) {
        if (conversion == null || !conversion.equals("Simplify") && !conversion.equals("MixedNumber")) {
            results.put("conversionError", "Select a conversion type");
        }
        if (!Helper.isInt(numerator)) {
            results.put("numeratorError", "Please input a valid numerator (Integer)");
        }
        if (!Helper.isInt(denominator)) {
            results.put("denominatorError", "Please input a valid denominator (Integer)");
        }

        if (!results.containsKey("conversionError") && !results.containsKey("numeratorError") && !results.containsKey("denominatorError")) {
            int intNumerator = Integer.parseInt(numerator);
            int intDenominator = Integer.parseInt(denominator);
            Fraction fraction = new Fraction(intNumerator, intDenominator);
            if (conversion.equals("Simplify")) {
                results.put("simplifiedFraction", String.format("The fraction (%s/%s) is simplified to (%s) .", intNumerator, intDenominator, fraction.simplify().toString()));
            }
            if (conversion.equals("MixedNumber")) {
                results.put("MixedNumberFraction", String.format("The fraction (%s/%s) converter to mixed number as (%s) .", intNumerator, intDenominator, fraction.mixedNumber().toString()));
            }
        }
    }

}
