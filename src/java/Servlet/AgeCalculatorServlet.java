
package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 832676
 */
public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
  int ages=0;
         boolean isNumber=true;
        String age=request.getParameter("age");
        try {
            ages=Integer.parseInt(age);
        }
        catch(NumberFormatException e){
            isNumber=false;
        }
        if (age==null || age.equals(""))
        {
            request.setAttribute("Message","You must give your current age");
        }
        else if (isNumber)  
        {
            request.setAttribute("Message","Your age next birthday will be "+(ages+1));
        }
        else if (age instanceof String)
        {
             request.setAttribute("Message","You must enter a number ");
        }
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        
    }
}
