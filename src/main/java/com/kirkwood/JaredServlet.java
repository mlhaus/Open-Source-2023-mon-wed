package com.kirkwood;

import com.kirkwood.utilities.Helpers;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name="JaredServlet", value="/jared_volume_conversion")
public class JaredServlet extends HttpServlet {
    Map<String, String> results = new HashMap<>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("WEB-INF/jared_volume_conversion.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String startingUnit = req.getParameter("startingUnit");
        String resultingUnit = req.getParameter("resultingUnit");
        String inputNumber = req.getParameter("inputNumber");
        results.clear();
        results.put("startingUnit", startingUnit);
        results.put("resultingUnit", resultingUnit);
        results.put("inputNumber", inputNumber);
        doConversion(startingUnit, resultingUnit, inputNumber);
        req.setAttribute("results", results);
        req.getRequestDispatcher("WEB-INF/jared_volume_conversion.jsp").forward(req, resp);
    }

    public void doConversion(String startingUnit, String resultingUnit, String inputNumber) {
        if(!Helpers.isANumber(inputNumber)) {
            results.put("conversionError", "Please input a valid number");
            return;
        }
        double inputNum = Double.parseDouble(inputNumber);
        if(startingUnit.equals("ounces")) {
            if(resultingUnit.equals("ounces")) {
                results.put("resultingValue", String.format("%soz = %soz", inputNumber, inputNumber));
            } else if(resultingUnit.equals("cups")) {
                results.put("resultingValue", String.format("%soz = %sc", inputNumber, Helpers.round(inputNum / 8)));
            } else if(resultingUnit.equals("pints")) {
                results.put("resultingValue", String.format("%soz = %spt", inputNumber, Helpers.round(inputNum / 16)));
            } else if(resultingUnit.equals("quart")) {
                results.put("resultingValue", String.format("%soz = %sqt", inputNumber, Helpers.round(inputNum / 32)));
            } else if(resultingUnit.equals("gallons")) {
                results.put("resultingValue", String.format("%soz = %sgal", inputNumber, Helpers.round(inputNum / 128)));
            }
        } else if(startingUnit.equals("cups")) {
            if(resultingUnit.equals("ounces")) {
                results.put("resultingValue", String.format("%sc = %soz", inputNumber, Helpers.round(inputNum * 8)));
            } else if(resultingUnit.equals("cups")) {
                results.put("resultingValue", String.format("%sc = %sc", inputNumber, inputNumber));
            } else if(resultingUnit.equals("pints")) {
                results.put("resultingValue", String.format("%sc = %spt", inputNumber, Helpers.round(inputNum / 2)));
            } else if(resultingUnit.equals("quart")) {
                results.put("resultingValue", String.format("%sc = %sqt", inputNumber, Helpers.round(inputNum / 4)));
            } else if(resultingUnit.equals("gallons")) {
                results.put("resultingValue", String.format("%sc = %sgal", inputNumber, Helpers.round(inputNum / 16)));
            }
        } else if(startingUnit.equals("pints")) {
            if(resultingUnit.equals("ounces")) {
                results.put("resultingValue", String.format("%spt = %soz", inputNumber, Helpers.round(inputNum * 16)));
            } else if(resultingUnit.equals("cups")) {
                results.put("resultingValue", String.format("%spt = %sc", inputNumber, Helpers.round(inputNum * 2)));
            } else if(resultingUnit.equals("pints")) {
                results.put("resultingValue", String.format("%spt = %spt", inputNumber, inputNumber));
            } else if(resultingUnit.equals("quart")) {
                results.put("resultingValue", String.format("%spt = %sqt", inputNumber, Helpers.round(inputNum / 2)));
            } else if(resultingUnit.equals("gallons")) {
                results.put("resultingValue", String.format("%spt = %sgal", inputNumber, Helpers.round(inputNum / 8)));
            }
        } else if(startingUnit.equals("quarts")) {
            if(resultingUnit.equals("ounces")) {
                results.put("resultingValue", String.format("%sqt = %soz", inputNumber, Helpers.round(inputNum * 32)));
            } else if(resultingUnit.equals("cups")) {
                results.put("resultingValue", String.format("%sqt = %sc", inputNumber, Helpers.round(inputNum * 4)));
            } else if(resultingUnit.equals("pints")) {
                results.put("resultingValue", String.format("%sqt = %spt", inputNumber, Helpers.round(inputNum * 2)));
            } else if(resultingUnit.equals("quart")) {
                results.put("resultingValue", String.format("%sqt = %sqt", inputNumber, inputNumber));
            } else if(resultingUnit.equals("gallons")) {
                results.put("resultingValue", String.format("%sqt = %sgal", inputNumber, Helpers.round(inputNum / 4)));
            }
        } else if(startingUnit.equals("gallons")) {
            if(resultingUnit.equals("ounces")) {
                results.put("resultingValue", String.format("%sgal = %soz", inputNumber, Helpers.round(inputNum * 128)));
            } else if(resultingUnit.equals("cups")) {
                results.put("resultingValue", String.format("%sgal = %sc", inputNumber, Helpers.round(inputNum * 16)));
            } else if(resultingUnit.equals("pints")) {
                results.put("resultingValue", String.format("%sgal = %spt", inputNumber, Helpers.round(inputNum * 8)));
            } else if(resultingUnit.equals("quart")) {
                results.put("resultingValue", String.format("%sgal = %sqt", inputNumber, Helpers.round(inputNum * 4)));
            } else if(resultingUnit.equals("gallons")) {
                results.put("resultingValue", String.format("%sgal = %sgal", inputNumber, inputNumber));
            }
        }
    }
}
