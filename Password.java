import java.util.*;


public class Password {
	int longitud = 8;
	String contrase�a;

	public Password(int longitud) {
		super();
		this.longitud = longitud;
		
		contrase�a = PasswordGenerator.getPassword(
				PasswordGenerator.MINUSCULAS+
				PasswordGenerator.MAYUSCULAS+
				PasswordGenerator.ESPECIALES, longitud);
	}

	public Password(String contrase�a) {
		super();
		this.contrase�a = contrase�a;
	}

	public Password() {
		
	}

}
