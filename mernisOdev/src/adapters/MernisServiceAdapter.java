package adapters;

import java.rmi.RemoteException;

import abstractt.CustomerCheckService;
import entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{

	KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
	
	@Override
	public boolean checkIfRealPerson(Customer customer) throws NumberFormatException, RemoteException {
		
		boolean result = kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(customer.identityNumber),customer.firstName.toUpperCase(), customer.lastName.toUpperCase(), customer.dateofBirth);
		if (result == true) {
			System.out.println("iþlem baþarýlý");
			return true;
		}else {
			System.out.println("iþlem baþarýsýz");
			return false;
		}
	}

}
