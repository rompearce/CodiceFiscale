package codFisc;//

public class mainProve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calcolo calcolo = new Calcolo();
		ServicesCrud crud = new ServicesCrud("fiscale");
		String nome = "adriano";
		String cognome = "paoletti";
		String data = "29/10/1989";
		int sessoInserito = 0;
		String nomeCalcolato = calcolo.calcoloNome(nome);
		String cognomeCalcolato = calcolo.calcoloCognome(cognome);
		String dataCalcolata = calcolo.calcoloDataNascita(data, sessoInserito);
		String cod = nomeCalcolato+cognomeCalcolato+dataCalcolata;
		String comune = "Roma";
		String comuneCod = calcolo.codiceDaComune(comune, crud);
		System.out.println(nomeCalcolato);
		System.out.println(cognomeCalcolato);
		System.out.println(dataCalcolata);
		System.out.println(cod);
		System.out.println(comuneCod);
		
	}

}
