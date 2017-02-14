package fr.vsc.codingdojo.pandemie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class City {
	public static final int MAX_OF_DISEASE = 3;
	public List<Disease> diseases = new ArrayList<>();
	public List<City> nearCities;

	public City(Disease personalDisease) {
		this.diseases = Arrays.asList(personalDisease);
	}

	public City(final List<City> nearCities) {
		this.nearCities = nearCities;
	}

	public City() {
		nearCities = new ArrayList<>();
	}


	public void contaminate(Disease disease) {
		if(hasDisease(disease)) {
			disease.contaminate();
		}else{

			diseases.add(disease);
		}
	}


	private boolean hasDisease(final Disease disease) {
		return diseases != null &&
				!diseases.isEmpty()
				&& diseases.stream().anyMatch(d ->d.getNameDisease().equals(disease.getNameDisease()));
	}

	public void decontaminate(Disease disease) {
		 disease.decontaminate();
	}

	public void eclosion(Disease disease) {
		nearCities.stream().forEach(city -> city.contaminate(disease));

	}
}
