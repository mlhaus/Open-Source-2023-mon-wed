package com.kirkwood.opensource2023monwed.convresion;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

    @WebServlet(name= "ConversionServlet", value = "/conversion")
    class ConversionServlet extends HttpServlet {
        private static final long serialVersionUID = 1L;

        @Override
        public void init() throws ServletException {
            // Initialization code (if needed)
        }

        protected void doGet(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {
            String selectedUnit = request.getParameter("unit");
            request.setAttribute("selectedUnit", selectedUnit);

            double inputValue = Double.parseDouble(request.getParameter("inputValue"));
            double result = 0;

            if ("meters".equals(selectedUnit)) {
                result = convertToMeters(inputValue);
            } else if ("miles".equals(selectedUnit)) {
                result = convertToMiles(inputValue);
            } else if ("kilometers".equals(selectedUnit)) {
                result = convertToKilometers(inputValue);
            }

            request.setAttribute("result", String.format("%.2f", result));
            request.getRequestDispatcher("conversion.jsp").forward(request, response);
        }

        private double convertToMeters(double value) {
            // Conversion from miles to meters
            return value * 1609.34;
        }

        private double convertToMiles(double value) {
            // Conversion from meters to miles
            return value / 1609.34;
        }

        private double convertToKilometers(double value) {
            // Conversion from miles to kilometers
            return value * 1.60934;
        }
        //updated
    }
