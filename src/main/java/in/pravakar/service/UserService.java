package in.pravakar.service;

import in.pravakar.binding.LoginForm;
import in.pravakar.binding.SignUpForm;
import in.pravakar.binding.UnlockForm;



public interface UserService {
	
	public String login(LoginForm form); 
	
	public boolean signup(SignUpForm form);
	
	public boolean unlockAccount(UnlockForm form);
	
	public boolean forgotPwd(String email);
	
	

}
