package atm;
public class account {
    
	public boolean Login(String pass) {
       
		boolean result;
		if(pass.equals("5613")) {	
			result=true;		
		}
		else{
	     	result=false;	
		}
		return result;
		
		
	}	

}
