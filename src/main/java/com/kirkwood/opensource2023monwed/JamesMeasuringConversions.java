package com.kirkwood.opensource2023monwed;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.*;

@WebServlet(name="jamesMeasuringConversions", urlPatterns = {"/james-measuring-conversions", "/james-measuring-conversion"})
public class JamesMeasuringConversions extends HttpServlet {
    Map<String, String> results = new HashMap<>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("WEB-INF/james-measuring-conversions.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String amount = req.getParameter("amount");
        String og_type = req.getParameter("og-type");
        String new_type = req.getParameter("new-type");
        results.clear();
        results.put("amount", amount);
        results.put("og_type", og_type);
        results.put("new_type", new_type);
        conversion(amount, og_type, new_type);
        req.setAttribute("results", results);
        req.getRequestDispatcher("WEB-INF/james-measuring-conversions.jsp").forward(req, resp);
    }

    //Conversion method
    public void conversion(String num_String, String og_type, String new_type) {
        double converted = 0.0;
        String oldType = split(og_type, "-", 1);
        String newType = split(new_type, "-", 1);
        ArrayList<String> validTypes = new ArrayList<>(Arrays.asList("cups", "pints", "quarts", "gallons"));
        if(!isANumber(num_String)) {
            results.put("invalidNumber", "Please input a valid amount");
        }  else if(validTypes.contains(oldType) && validTypes.contains(newType)) {
            if (oldType.equals(newType)) {
                results.put("conversion", num_String + " " + oldType + " is still " + num_String + " " + newType + ". ¯\\_(ツ)_/¯");
            } else {
                double num = Double.parseDouble(num_String);
                if (og_type.equals("og-cups")) {

                    if (new_type.equals("new-cups")) {
                        converted = num;
                    } else if (new_type.equals("new-pints")) {
                        converted = num / 2.0;
                    } else if (new_type.equals("new-quarts")) {
                        converted = num / 4.0;
                    } else if (new_type.equals("new-gallons")) {
                        converted = num / 16.0;
                    } else {
                        results.put("typeError", "Please select a type");
                    }
                } else if (og_type.equals("og-pints")) {
                    if (new_type.equals("new-cups")) {
                        converted = num * 2.0;
                    } else if (new_type.equals("new-pints")) {
                        converted = num;
                    } else if (new_type.equals("new-quarts")) {
                        converted = num / 2.0;
                    } else if (new_type.equals("new-gallons")) {
                        converted = num / 8.0;
                    } else {
                        results.put("typeError", "Please select a type");
                    }
                } else if (og_type.equals("og-quarts")) {
                    if (new_type.equals("new-cups")) {
                        converted = num * 4.0;
                    } else if (new_type.equals("new-pints")) {
                        converted = num * 2.0;
                    } else if (new_type.equals("new-quarts")) {
                        converted = num;
                    } else if (new_type.equals("new-gallons")) {
                        converted = num / 4.0;
                    } else {
                        results.put("typeError", "Please select a type");
                    }
                } else if (og_type.equals("og-gallons")) {
                    if (new_type.equals("new-cups")) {
                        converted = num * 16.0;
                    } else if (new_type.equals("new-pints")) {
                        converted = num * 8.0;
                    } else if (new_type.equals("new-quarts")) {
                        converted = num * 4.0;
                    } else if (new_type.equals("new-gallons")) {
                        converted = num;
                    }

                }
                results.put("conversion", num_String + " " + oldType + " is " + round(converted) + " " + newType + ".");
            }
        }else {
            results.put("typeError", "Please choose a type that is provided");
        }
    }

    public String split(String str, String splitChar, int returnPart) {
        String[] strArray = str.split(splitChar);
        return strArray[returnPart];
    }

    //Helper methods from class examples
    public static String round(double num) {
        DecimalFormat df = new DecimalFormat("#.#########");
        df.setRoundingMode(RoundingMode.HALF_UP);
        return df.format(num);
    }

    public static boolean isANumber(String num) {
        try  {
            Double.parseDouble(num);
            return true;
        } catch(NumberFormatException e) {

            return false;
        }
    }
}
