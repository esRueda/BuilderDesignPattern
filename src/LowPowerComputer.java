
public class LowPowerComputer implements Builder{

	private String processor;
	private String graphicsCard;
	private String powerSupply;
	private String motherBoard;

	@Override
	public Builder addProcessor() {
		System.out.println("Installing processor...");
		this.processor = "Intel® Core™ i3-1115G4";
		return this;
	}

	@Override
	public Builder addGraphicsCard() {
		System.out.println("Installing graphics card...");
		this.graphicsCard = "Nvidia gtx 970";
		return this;
	}

	@Override
	public Builder addPowerSupply() {
		System.out.println("Installing power supply...");
		this.powerSupply = "500W";
		return this;
	}

	@Override
	public Builder addMotherBoard() {
		System.out.println("Installing motherboard...");
		this.motherBoard = "Asus Prime A320M-K";
		return this;
	}

	@Override
	public Computer build() {
		Computer computer = new Computer(processor, graphicsCard, powerSupply, motherBoard);
		return computer;
	}

}
