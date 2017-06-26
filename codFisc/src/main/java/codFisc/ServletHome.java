package codFisc;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletHome extends HttpServlet {
	
	ServicesCrud crud = new ServicesCrud("fiscale");
	
	
	String selezione = "0";
	String generaCodice = "genera";
	String resetCodice = "reset";
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String scelta = req.getParameter("sceltaHome");
		if (scelta.equalsIgnoreCase(generaCodice)) {
			req.setAttribute("selezione", selezione);
			
			
			RequestDispatcher disp = req.getRequestDispatcher("dati.jsp");
			disp.forward(req, resp);
		}if (scelta.equalsIgnoreCase(resetCodice)) {
			selezione = "1";
			req.setAttribute("selezione", selezione);
			RequestDispatcher disp = req.getRequestDispatcher("dati.jsp");
			disp.forward(req, resp);
		}
	}
}