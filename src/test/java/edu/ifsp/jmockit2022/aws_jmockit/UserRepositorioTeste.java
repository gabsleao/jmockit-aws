package edu.ifsp.jmockit2022.aws_jmockit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import mockit.Expectations;
import mockit.Injectable;
import mockit.Mock;
import mockit.MockUp;
import mockit.Mocked;
import mockit.Tested;
import mockit.Verifications;

public class UserRepositorioTeste {
	
	@Tested
	public UserRepositorio userRepositorio = new UserRepositorio();
	
	@Injectable
	public UserService userService;
	
	private User user;
	
	@BeforeEach
	public void setup() {
		userRepositorio = new UserRepositorio();
	}

	
	@Test 
	public void deve_retornar_1_com_usuario_cadastrado() {
//		new Expectations() {{
//			userService.save(user);
//			result = 1;
//    	    times = 1;
//        }};
		
		user = new User();
		user.setNome("Gabriel");
		
		int response = userRepositorio.saveUser(user);
		assertEquals(1, response);
	}
	
	@Test 
	public void deve_retornar_0_com_usuario_nao_cadastrado() {
//		new Expectations() {{
//			userService.save(user);
//			result = 1;
//    	    times = 1;
//        }};
		
		user = new User();
        	
		int response = userRepositorio.saveUser(user);
		assertEquals(0, response);
	}

}
