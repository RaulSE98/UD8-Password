import java.util.*;


public class Password {
	int longitud = 8;
	String contraseña;

	public Password(int longitud) {
		super();
		this.longitud = longitud;
		
		contraseña = PasswordGenerator.getPassword(
				PasswordGenerator.MINUSCULAS+
				PasswordGenerator.MAYUSCULAS+
				PasswordGenerator.ESPECIALES, longitud);
	}

	public Password(String contraseña) {
		super();
		this.contraseña = contraseña;
	}

	public Password() {
		
	}

}
