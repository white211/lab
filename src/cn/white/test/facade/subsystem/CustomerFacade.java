package cn.white.test.facade.subsystem;

public class CustomerFacade implements IFacade {
	public void saveCustomerData(String accName,String accPass,String addr,String creditInfo){
		Account account = new Account(accName,accPass);
		if(!account.isValid()){
			throw new RuntimeException("account is invalid");
		}
		
		Address address = new Address(addr);
		if(!address.isValid()){
			throw new RuntimeException("address is invalid");
		}
		
		CreditCard credit = new CreditCard(creditInfo, 0);
		if(!credit.isValid()){
			throw new RuntimeException("credit is invalid");
		}
		
		if(!account.save()){
			throw new RuntimeException("account is invalid");
		}
		
		if(!address.save()){
			throw new RuntimeException("address is invalid");
		}
		
		if(!credit.save()){
			throw new RuntimeException("credit is invalid");
		}
		
		System.out.println("customer data saved......");
	}
}
