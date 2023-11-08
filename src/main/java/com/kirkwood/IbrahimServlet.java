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

@WebServlet(name="IbrahimServlet", value="/ibrahim_meters_miles_kilometers")
public class IbrahimServlet extends HttpServlet {
    Map<String, String> results = new HashMap<>();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("WEB-INF/ibrahim_meters_miles_kilometers.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String UOM = request.getParameter("unitOfMeasure"); // Unit of Measure
        String CUOM = request.getParameter("convertUnitOfMeasure"); // Value to Convert
        String TCUOM = request.getParameter("toConvertedUnitOfMeasure"); // Unit of Measure to Convert to

        results.clear();
        results.put("unitOfMeasure", UOM);
        results.put("convertUnitOfMeasure", CUOM);
        results.put("toConvertUnitOfMeasure", TCUOM);

        convertDistance(UOM, CUOM, TCUOM);

        request.setAttribute("results", results);
        request.getRequestDispatcher("WEB-INF/ibrahim_meters_miles_kilometers.jsp").forward(request, response);
    }

    public void convertDistance(String UOM, String CUOM, String TCUOM){

        boolean errorBool = false; // Used to ensure code only runs if no errors are found

        // Check Unit of Measure selection
        if((!UOM.equals("m") && !UOM.equals("mi") && !UOM.equals("km"))
                || UOM == null){
            System.out.println("ho");
            results.put("measureError", "Please select a unit of measure!");
            errorBool = true;
        }

        // Check for a number input
        if(!Helpers.isANumber(CUOM)){

            results.put("invalidInputError", "Please enter a valid number!");
            errorBool = true;
        }

        // If no errors are found, convert number
        if(!errorBool){

            double unitDouble = Double.parseDouble(CUOM);

            if(UOM.equals("m")){

                // Check for same type conversion
                if(TCUOM.equals("m")){

                    //  Convert and format string then add results to result map
                    results.put("mValue", String.format("%.2fm", unitDouble));
                }

                else if(TCUOM.equals("mi")){
                    // Set variables for conversion
                    double mi = unitDouble / 1609;

                    //  Convert and format string then add results to result map
                    results.put("miValue", String.format("%.2f miles", mi));
                    System.out.printf("%.2fmi", mi);
                }

                else if(TCUOM.equals("mi")){

                    // Set variables for conversion
                    double km = unitDouble / 1000;

                    //  Convert and format string then add results to result map
                    results.put("kmValue", String.format("%.2fkm", km));
                }
            }
            else if(UOM.equals("mi")){

                // Check for same type conversion
                if(TCUOM.equals("mi")){

                    //  Convert and format string then add results to result map
                    results.put("miValue", String.format("%.2fmi", unitDouble));
                }

                else if(TCUOM.equals("m")){

                    // Set variables for conversion
                    double m = unitDouble * 1609;

                    //  Convert and format string then add results to result map
                    results.put("mValue", String.format("%.2fm", m));

                }

                else if(TCUOM.equals("km")){

                    // Set variables for conversion
                    double km = unitDouble * 1.609;

                    //  Convert and format string then add results to result map
                    results.put("kmValue", String.format("%.2fkm", km));
                }
            }
            else if(UOM.equals("km")){

                // Check for same type conversion
                if(TCUOM.equals("km")){

                    //  Convert and format string then add results to result map
                    results.put("kmValue", String.format("%.2fkm", unitDouble));
                }

                else if(TCUOM.equals("m")){

                    // Set variables for conversion
                    double m = unitDouble * 1000;

                    //  Convert and format string then add results to result map
                    results.put("mValue", String.format("%.2fm", m));

                }

                else if(TCUOM.equals("mi")){

                    // Set variables for conversion
                    double mi = unitDouble / 1.609;

                    //  Convert and format string then add results to result map
                    results.put("miValue", String.format("%.2fmi", mi));
                }
            }
        }
    } // End convertDistance
}