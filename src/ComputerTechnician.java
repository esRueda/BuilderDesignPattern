
public class ComputerTechnician { // As stated in the design pattern, ComputerTechnician will act as the Director.

	private Builder builder;
	public ComputerTechnician(Builder builder) {
		super();
		this.builder = builder;
		if (this.builder == null) {
			throw new IllegalArgumentException("Error, the technician cant work without the builder.");
		}
	}
	public Computer makeComputer() {
		return builder.addProcessor().addGraphicsCard().addPowerSupply().addMotherBoard().build();
	}

}
