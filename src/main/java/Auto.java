
public class Auto {
    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    static int cantidadCreados;
    
    int cantidadAsientos() {
	int contador = 0;
	for(int i = 0; i < asientos.length; i++) {
	    if(asientos[i] instanceof Asiento) {
		contador++;
	    }
	}
	return contador;
    }
    
    String verificarIntegridad() {
	boolean asientosOriginales = true;
	int nAsientos = this.cantidadAsientos();
	int registroAsientos = -1;
	
	if(nAsientos > 0) {
	    int i = 0;
	    while(asientosOriginales && i < this.asientos.length) {
		if(this.asientos[i] instanceof Asiento) {
		    
		    if(registroAsientos == -1)
			registroAsientos = this.asientos[i].registro;
		    else 
			asientosOriginales = (this.asientos[i].registro == registroAsientos);
		
		}
		
		i++;
	    }
	    
	}
	
	if(asientosOriginales && (registroAsientos == this.registro) && (registroAsientos == this.motor.registro) ) {
	    return "Auto original";
	} 
	else {
	    return "Las piezas no son originales";
	}
	
    }
    
}
