package edu.ifsp.jmockit2022.aws_jmockit;

public class UserRepositorio {
	
	private UserService userService = new UserService();
	
	public int saveUser(User usuario) {		
		return userService.save(usuario);
	}

}
