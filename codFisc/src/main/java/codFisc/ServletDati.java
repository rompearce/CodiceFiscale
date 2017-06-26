package codFisc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletDati extends HttpServlet {
	
	ServicesCrud crud = new ServicesCrud("fiscale");
	CodiceFiscale codiceFiscale = new CodiceFiscale();
	Calcolo calcolo = new Calcolo();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String selezioneHome = req.getParameter("selezione");
		String nome = req.getParameter("nome");
		String cognome= req.getParameter("cognome");
		String data= req.getParameter("dataNascita");
		String sesso= req.getParameter("sesso");
		String comune= req.getParameter("comuneNascita");
		String codiceDaControllare="";
		
		
		
		System.out.println(nome);
		System.out.println(cognome);
		System.out.println(data);
		System.out.println(sesso);
		System.out.println(comune);
		System.out.println(selezioneHome);
		
		if (!selezioneHome.equalsIgnoreCase("1")) {
			CodiceFiscale codiceFiscale = new CodiceFiscale();
			String nomeCod = calcolo.calcoloCognome(nome);
			codiceFiscale.setNome(nome);
			String cognomeCod = calcolo.calcoloCognome(cognome);
			codiceFiscale.setCognome(cognome);
			int sessoCod=Integer.parseInt(sesso);
			String dataCod = calcolo.calcoloDataNascita(data, sessoCod);
			codiceFiscale.setDataNascita(data);
			String comuneCod = calcolo.codiceDaComune(comune, crud);
			codiceDaControllare=nomeCod+cognomeCod+dataCod+comuneCod;
			String codiceDaInserire=calcolo.controllo(codiceDaControllare);
			codiceFiscale.setFiscal(codiceDaInserire);
			crud.jpaCreate(codiceFiscale);
			
			
		}
		
	}

}
