package concrete;

import java.rmi.RemoteException;

import abstractt.CustomerService;
import entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public void save(Customer customer) throws NumberFormatException, RemoteException {
		System.out.println("saved to db: " + customer.getFirstName());
		
	}

}
