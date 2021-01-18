package atm;

import java.util.ArrayList;

public class mainTransactions {
	 double balance;
	 ArrayList<String> types= new  ArrayList<>(5);
	 ArrayList<Double> amounts= new  ArrayList<>(5);
	   int index=0;
	   int j=0;
	   String type;
	   double amount;	
	public mainTransactions () {
		 double balance=1000;
		 this.balance=balance;
	}
	
    
     public void setTypes(ArrayList<String> types) {
		this.types = types;
	}

	public void setAmounts(ArrayList<Double> amounts) {
		this.amounts = amounts;
	}


    public double getWithdraw(double withdraw) {
	       if(j<4) {
	       balance=balance-withdraw;
	       
	       types.add("withdraw");
	       amounts.add(withdraw);
		   index++;
		   j++;
		   if(amounts.size()>5 && types.size()>5) {
		    	amounts.remove(0);
		    	types.remove(0);
		    	
		    }
		   
	       }
	       
		return balance;
	}	
	public double getDeposit(double deposit) {
		balance=balance+deposit;
		
		types.add("deposit");
	    amounts.add(deposit);
	    index++;
	    if(amounts.size()>5 && types.size()>5) {
	    	amounts.remove(0);
	    	types.remove(0);


	    	
	    }
		
	    return balance;
	}
	
    public double getBalance(){
   	    return balance;
    }
    public int getJ() {
		return j;
	}
    	
   
}
