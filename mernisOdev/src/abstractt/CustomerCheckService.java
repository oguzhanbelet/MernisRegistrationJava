package abstractt;

import java.rmi.RemoteException;

import entities.Customer;

public interface CustomerCheckService {
	
	boolean checkIfRealPerson(Customer customer) throws NumberFormatException, RemoteException;
}
