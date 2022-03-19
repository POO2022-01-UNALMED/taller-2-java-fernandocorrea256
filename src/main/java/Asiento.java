
public class Asiento {
    String color;
    int precio;
    int registro;
    
    void cambiarColor(String nuevoColor) {
	String[] colores = {"rojo", "verde", "amarillo", "negro", "blanco"};
	boolean colorValido = false;
	
	int i = 0;
	while(!colorValido && (i < colores.length) ) {
	    colorValido = nuevoColor.contentEquals(colores[i]);
	    i++;
	}
	
	if(colorValido) {
	  this.color = nuevoColor;  
	}
	
    }
    
}
