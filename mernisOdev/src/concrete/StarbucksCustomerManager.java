package concrete;

import java.rmi.RemoteException;

import abstractt.CustomerCheckService;
import entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) throws NumberFormatException, RemoteException {
		if (customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
		}else {
			System.out.println("hatalý kullanýcý giriþi");
		}
		
	}

	
}
