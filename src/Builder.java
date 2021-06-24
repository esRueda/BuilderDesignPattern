
public interface Builder { //Builder class with all the installation methods.

	public Builder addProcessor();
	public Builder addGraphicsCard();
	public Builder addPowerSupply();
	public Builder addMotherBoard();
	public Computer build();

}