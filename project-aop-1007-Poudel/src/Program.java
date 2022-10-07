
public class Program {
	public static void main(String[] args) {
		System.out.println("[DBG] Start...");
		ComponentApp componentApp = new ComponentApp("COM");
		DataApp dataApp = new DataApp("DATA");
		ServiceApp serviceApp = new ServiceApp("SRC");

		String comName = componentApp.getName();
		System.out.println("\tCOM NAME: " + comName);

		String dataName = dataApp.getName();
		System.out.println("\tDAT NAME: " + dataName);

		String srcName = serviceApp.getName();
		System.out.println("\tSRC NAME: " + srcName);
		System.out.println("[DBG] Done.");
	}
}
