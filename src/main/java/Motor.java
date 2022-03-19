package test;

public class Motor {

    int numeroCilindros;
    String tipo;
    int registro;
    
    void cambiarRegistro(int registro) {
	this.registro = registro;
    }
    
    void asignarTipo(String tipo) {
	String[] tipos = {"electrico", "gasolina"};
	boolean tipoValido = false;
	
	int i = 0;
	while(i < tipos.length && !tipoValido) {
	    tipoValido = (tipo == tipos[i]);
	    i++;
	}
	
	if(tipoValido) {
	    this.tipo = tipo;
	}
    }
}
