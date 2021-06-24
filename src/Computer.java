
public class Computer {

	private String processor;
	private String graphicsCard;
	private String powerSupply;
	private String motherBoard;

	public Computer() {

		super();

	}

	public Computer(String processor, String graphicsCard, String powerSupply, String motherBoard) {

		this();
		this.processor = processor;
		this.graphicsCard = graphicsCard;
		this.powerSupply = powerSupply;
		this.motherBoard = motherBoard;

	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public String getGraphicsCard() {
		return graphicsCard;
	}

	public void setGraphicsCard(String graphicsCard) {
		this.graphicsCard = graphicsCard;
	}

	public String getPowerSupply() {
		return powerSupply;
	}

	public void setPowerSupply(String powerSupply) {
		this.powerSupply = powerSupply;
	}

	public String getMotherBoard() {
		return motherBoard;
	}

	public void setMotherBoard(String motherBoard) {

		this.motherBoard = motherBoard;

	} 

	@Override
	public String toString() {


		StringBuilder builder = new StringBuilder();

		builder.append("Computer --> [Processor= ").append(processor).append(", Graphics card= ").append(graphicsCard).append(", Power Supply= ").append(powerSupply)
		.append(", MotherBoard=").append(motherBoard).append("]");

		return builder.toString();
	}
}
