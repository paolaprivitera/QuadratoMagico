package it.polito.tdp.quadrato;

import java.util.ArrayList;
import java.util.List;

public class CercaQuadrato {
	

	public CercaQuadrato() {
	}

	List<Quadrato> soluzioni;
	
	public void genera(int size) {
		Quadrato parziale = new Quadrato(size) ;
		this.soluzioni= new ArrayList<Quadrato>() ;
		this.cerca(parziale, 0);
	}

	// Quadrato parziale -> quadrato parzialmente riempito
	
	private void cerca(Quadrato parziale, int L) {
		// le L caselle da 0 a L-1 sono piene
		// devo trovare un valore per la casella
		// in posizione L

		// dimensione del quadrato
		// -> parziale.getSize() * parziale.getSize()
		if (L == parziale.getSize() * parziale.getSize()) {
			
			// il quadrato e' tutto pieno
			// devo verificare se e' 'magico'
			
			if (parziale.isMagic()) { // della classe Quadrato
									  // -> Questo e' il metodo che mi dice
									  // che sto cercando quadrati magici
				
				// Caso terminale:				
				System.out.println(parziale) ;
				soluzioni.add(parziale.clone());
			}
			return;
		}
		
		// <= perche' il valore 9 deve essere aggiunto
		for (int i = 1; i <= parziale.getSize() * parziale.getSize(); i++) {
			// provo a mettere il valore 'i' nella casella 'L'
			// cioe' valuto tutti i possibili numeri che provo a mettere
			// nella casella L
			
			if (!parziale.contains(i)) { // non voglio duplicati
				parziale.add(i);

				cerca(parziale, L + 1); // devo ricorsivamente chiedere agli altri
										// di lavorare sulle caselle successive

				parziale.remove(i); // provo a mettere 1, tolgo 1; provo a mettere 2, tolgo 2 ...
			}
		}
	}

}
