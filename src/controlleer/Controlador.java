package controlleer;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import controller.Prueba;

public class Controlador {

	public static void main(String[] args) throws NotBoundException, RemoteException {
		
		try {
			
			Registry r = LocateRegistry.getRegistry("127.0.0.1",1093);
			Prueba stub = (Prueba) r.lookup("Prueba");			
			System.out.println(stub.suma("1","3"));
		} catch ( Exception e) {
			e.printStackTrace(); 
		}
	}
}
