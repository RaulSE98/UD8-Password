import java.util.*;


public class Password {
	int longitud = 8;
	String contraseņa;

	public Password(int longitud) {
		super();
		this.longitud = longitud;
		
		contraseņa = PasswordGenerator.getPassword(
				PasswordGenerator.MINUSCULAS+
				PasswordGenerator.MAYUSCULAS+
				PasswordGenerator.ESPECIALES, longitud);
	}

	public Password(String contraseņa) {
		super();
		this.contraseņa = contraseņa;
	}

	public Password() {
		
	}

}
