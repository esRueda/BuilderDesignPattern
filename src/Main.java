
public class Main {

	public static void main(String[] args) { // Builder Design pattern.

		Builder builder = new PowerfulComputer();
		Builder builder2 = new MediumPowerComputer();
		Builder builder3 = new LowPowerComputer();
		ComputerTechnician technician = new ComputerTechnician(builder);
		ComputerTechnician technician2 = new ComputerTechnician(builder2);
		ComputerTechnician technician3 = new ComputerTechnician(builder3);
		Computer computer = technician.makeComputer();
		Computer computer2 = technician2.makeComputer();
		Computer computer3 = technician3.makeComputer();

		if (computer != null) {
			System.out.println("The computers manufactured are: ");
			System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
			System.out.println(computer);
			System.out.println(computer2);
			System.out.println(computer3);
			System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
		}
	}
}
