package con.con.observerV1;

import java.util.*;

public abstract class Subject {
	
	List<Observer> listaObservadores;
	
	Subject(){
		listaObservadores = new ArrayList();
	}
	
	void attach(Observer o) {
		listaObservadores.add(o);
	}
	
	void detach(Observer o) {
		listaObservadores.remove(o);
	}
	
	void notificar() {
		for ( Observer o:listaObservadores)
			o.update();
	}
	
}
