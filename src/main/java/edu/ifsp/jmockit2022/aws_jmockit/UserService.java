package edu.ifsp.jmockit2022.aws_jmockit;

public class UserService {

	public int save(User usuario) {
		if(usuario.nome == null)
			return 0;
		
		if(usuario.nome.isEmpty())
			return 0;
		
		return 1;
	}

}
