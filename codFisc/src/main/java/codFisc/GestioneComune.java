package codFisc;

import java.util.ArrayList;
import java.util.List;

public class GestioneComune {

	public List<String> listaComuni(ServicesCrud crud){
		
		List<String> listaComuni = new ArrayList<>();
		listaComuni = crud.jpaRead("select c.comune from Comuni c").getResultList();
		return listaComuni;
	}
	
	
}
