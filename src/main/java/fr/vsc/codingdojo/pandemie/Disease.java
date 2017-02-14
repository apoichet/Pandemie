package fr.vsc.codingdojo.pandemie;

public class Disease {
	private static final int MAX_OF_DISEASE = 3;
	private String nameDisease;

	private int numberOfContamination;

	public Disease(final String nameDisease, final int numberOfContamination) {
		this.nameDisease = nameDisease;
		this.numberOfContamination = numberOfContamination;
	}

	public void contaminate() {
		if (numberOfContamination < MAX_OF_DISEASE){
			numberOfContamination = numberOfContamination +1;
		}
	}

	public void decontaminate() {
		if (numberOfContamination > 0){
			numberOfContamination = numberOfContamination -1;
		}
	}

	public String getNameDisease() {
		return nameDisease;
	}

	public void setNameDisease(final String nameDisease) {
		this.nameDisease = nameDisease;
	}

	public int getNumberOfContamination() {
		return numberOfContamination;
	}

	public void setNumberOfContamination(final int numberOfContamination) {
		this.numberOfContamination = numberOfContamination;
	}
}
