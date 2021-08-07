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
		
		//TC no'su doðru deðil lütfen kendinize göre ayarlayýnýz.
		customerManager.save(new Customer(1, "oðuzhan", "belet", 1999, "213213")); 

	}

}
