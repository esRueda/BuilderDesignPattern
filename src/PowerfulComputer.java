
public class PowerfulComputer implements Builder{

	private String processor;
	private String graphicsCard;
	private String powerSupply;
	private String motherBoard;

	@Override
	public Builder addProcessor() {
		System.out.println("Installing processor...");
		this.processor = "AMD Ryzen 9 5900X";
		return this;
	}

	@Override
	public Builder addGraphicsCard() {
		System.out.println("Installing graphics card...");
		this.graphicsCard = "Nvidia rtx 3090";
		return this;
	}

	@Override
	public Builder addPowerSupply() {
		System.out.println("Installing power supply...");
		this.powerSupply = "850W Gold";
		return this;
	}

	@Override
	public Builder addMotherBoard() {
		System.out.println("Installing motherboard...");
		this.motherBoard = "Asus Prime X299-Deluxe II";
		return this;
	}

	@Override
	public Computer build() {
		Computer computer = new Computer(processor, graphicsCard, powerSupply, motherBoard);
		return computer;
	}

}
