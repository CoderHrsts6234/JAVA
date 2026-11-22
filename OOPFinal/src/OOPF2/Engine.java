package OOPF2;

class SimpleEngine implements Engine {
	private String engineType;
	private int horsePower;
	
	public SimpleEngine(String engineType, int horsePower) {
		this.engineType = engineType;
		this.horsePower = horsePower;
	}
	public String getEngineType() {
		return engineType;
	}
	
	public int getHorsePower() {
		return horsePower;
	}
}
