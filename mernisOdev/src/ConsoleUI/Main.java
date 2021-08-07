package ConsoleUI;

import java.rmi.RemoteException;

import adapters.MernisServiceAdapter;
import concrete.BaseCustomerManager;
import concrete.NeroCustomerManager;
import concrete.StarbucksCustomerManager;
import entities.Customer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		
		//TC no'su do�ru de�il l�tfen kendinize g�re ayarlay�n�z.
		customerManager.save(new Customer(1, "o�uzhan", "belet", 1999, "213213")); 

	}

}
