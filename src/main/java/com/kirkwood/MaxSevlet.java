package com.kirkwood;

import com.kirkwood.utilities.Helpers;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name="MaxServlet", urlPatterns = {"/max-time-calculator"})

public class MaxSevlet extends HttpServlet {
        Map<String, String> results = new HashMap<>();
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            req.getRequestDispatcher("WEB-INF/max-time-calculator.jsp").forward(req, resp);
        }

        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            String convertTo = req.getParameter("convertTo");
            String timeToConvert = req.getParameter("timeToConvert");
            String convertFrom = req.getParameter("convertFrom");

            results.clear();
            results.put("convertTo", convertTo);
            results.put("timeToConvert", timeToConvert);
            results.put("convertFrom", convertFrom);

            convert(convertFrom, convertTo, timeToConvert);

            req.setAttribute("results", results);
            req.getRequestDispatcher("WEB-INF/max-time-calculator.jsp").forward(req,resp);
        }
        private void convert(String convertFrom, String convertTo, String timeToConvert){

            if (convertFrom == null || convertTo == null){
                results.put("convertError", "Please choose a unit of measurement.");
            }
            if(convertFrom.equals(convertTo)){
                results.put("convertError", "You must choose two different units of measurements");
            }
            if (!Helpers.isANumber(timeToConvert)){
                results.put("timeToConvertError", "Please input an amount of time to convert.");
            }

            if(convertFrom.equals("second")) {
                double seconds = Double.parseDouble(timeToConvert);
                String toReturn;


                if (convertTo.equals("minute")) {
                    double minutes = (seconds / 60.00);

                    toReturn = String.format("%s minute(s)", Helpers.round(minutes));
                    results.put("converted", toReturn);
                }
                if (convertTo.equals("hour")) {

                    double hours = (seconds / 3600.00);

                    toReturn = String.format("%s hour(s)", Helpers.round(hours));
                    results.put("converted", toReturn);
                }
            }
            else if (convertFrom.equals("minute")) {
                double minutes = Double.parseDouble(timeToConvert);
                String toReturn;

                if (convertTo.equals("hour")) {

                    double hours = (minutes / 60.00);

                    toReturn = String.format("%s hour(s)", Helpers.round(hours));
                    results.put("converted", toReturn);
                }
                if (convertTo.equals("second")) {

                    double seconds = (minutes * 60.00);

                    toReturn = String.format("%s seconds", Helpers.round(seconds));
                    results.put("converted", toReturn);
                }
            }

            else if(convertFrom.equals("hour")) {
                double hours = Double.parseDouble(timeToConvert);
                String toReturn;
                if(convertTo.equals("second")){
                    double seconds = (hours * 3600.00);

                    toReturn = String.format("%s seconds", Helpers.round(seconds));
                    results.put("converted", toReturn);
                }

                if (convertTo.equals("minute")) {
                    int minutes = (int) (hours * 60);

                    toReturn = String.format("%s minute(s)", minutes, Helpers.round(minutes));
                    results.put("converted", toReturn);
                }

            }



        }

    }

