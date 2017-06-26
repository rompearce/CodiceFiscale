package codFisc;

public class Calcolo {

	/*calcolo prime 3 lettere Nome*/
	public String calcoloNome(String nomeInserito){
		String nomeCodFiscale="";
		String nome = nomeInserito.toUpperCase();
		int cont = 0;
		/*caso nome minore di 3 lettere*/
		if (nome.length()<3){
			nomeCodFiscale+= nome;
		while (nomeCodFiscale.length()<6) nomeCodFiscale+= "X";
		cont=3;
		}
		/*caso normale*/
		for (int i=0;i<nome.length();i++) {
		if (cont==3) break;
		if (nome.charAt(i)!='A' && nome.charAt(i)!='E' &&
		nome.charAt(i)!='I' && nome.charAt(i)!='O' &&
		nome.charAt(i)!='U') {
		nomeCodFiscale+= Character.toString(nome.charAt(i));
		cont++;
		}
		}
		/* nel casoci siano meno di 3 consonanti*/
		while (cont<3) {
		for (int i=0;i<nome.length();i++) {
		if (cont==3) break;
		if (nome.charAt(i)=='A' || nome.charAt(i)=='E' ||
		nome.charAt(i)=='I' || nome.charAt(i)=='O' ||
		nome.charAt(i)=='U') {
		nomeCodFiscale+= Character.toString(nome.charAt(i));
		cont++;
		}
		}
		}
		
		return nomeCodFiscale;
		
	}
	
	/*calcolo prime 3 lettere Cognome*/
	public String calcoloCognome(String nomeInserito){
		int cont = 0;
		String cognomeCodFiscale="";
		String cognome = nomeInserito.toUpperCase();
		/*caso cognome minore di 3 lettere*/
		if (cognome.length()<3){
		cognomeCodFiscale+= cognome;
		while (cognomeCodFiscale.length()<3) cognomeCodFiscale+= "X";
		cont=3;
		}
		/*caso normale*/
		for (int i=0;i<cognome.length();i++) {
		if (cont==3) break;
		if (cognome.charAt(i)!='A' && cognome.charAt(i)!='E' &&
		cognome.charAt(i)!='I' && cognome.charAt(i)!='O' &&
		cognome.charAt(i)!='U') {
		cognomeCodFiscale+= Character.toString(cognome.charAt(i));
		cont++;
		}
		}
		/* nel casoci siano meno di 3 consonanti*/
		while (cont<3) {
		for (int i=0;i<cognome.length();i++) {
		if (cont==3) break;
		if (cognome.charAt(i)=='A' || cognome.charAt(i)=='E' ||
		cognome.charAt(i)=='I' || cognome.charAt(i)=='O' ||
		cognome.charAt(i)=='U') {
		cognomeCodFiscale+= Character.toString(cognome.charAt(i));
		cont++;
		}
		}
		}
	return cognomeCodFiscale;
	}
		
	
	public String calcoloDataNascita(String dataInserita, int sessoInserito){
		String dataCodFiscale="";
		/* Calcolo anno */
		dataCodFiscale+=dataInserita.substring(8,10);
		/* Calcolo Mese*/
		int mese=0;
		if (dataInserita.charAt(3)== '0') mese = Integer.parseInt(dataInserita.substring(4,5));
		else mese = Integer.parseInt(dataInserita.substring(3,5));
		switch (mese) {
		case 1: {dataCodFiscale+="A";break;}
		case 2: {dataCodFiscale+="B";break;}
		case 3: {dataCodFiscale+="C";break;}
		case 4: {dataCodFiscale+="D";break;}
		case 5: {dataCodFiscale+="E";break;}
		case 6: {dataCodFiscale+="H";break;}
		case 7: {dataCodFiscale+="L";break;}
		case 8: {dataCodFiscale+="M";break;}
		case 9: {dataCodFiscale+="P";break;}
		case 10: {dataCodFiscale+="R";break;}
		case 11: {dataCodFiscale+="S";break;}
		case 12: {dataCodFiscale+="T";break;}
		}
		/*Calcolo giorno*/
		int giorno=0;
		if (dataInserita.charAt(0)== '0') giorno = Integer.parseInt(dataInserita.substring(0,1));
		else giorno = Integer.parseInt(dataInserita.substring(0,2));
		if (sessoInserito == 0) dataCodFiscale+= giorno;
		else {
		giorno+=40;
		dataCodFiscale+=Integer.toString(giorno);
		}
		return dataCodFiscale;
	}

}

	
	
