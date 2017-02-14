package fr.vsc.codingdojo.pandemie;



import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class PandemieTest {
	public static final int MAX_NUMBER_OF_DISEASE = 3;
	private City city;
	private City firstNextCity;

/*	@Test
	public void should_contaminate_city(){

		givenCity();
		int initialNumberOfDisease = city.;

		city.contaminate();

		assertThat(city.numberDisease).isNotEqualTo(0);
		assertThat(city.numberDisease).isEqualTo(initialNumberOfDisease+1);

	}

	@Test
	public void should_decontaminate_city(){
		givenCityWithDesease(1);

		city.decontaminate();

		assertThat(city.numberDisease).isEqualTo(0);

	}

	@Test
	public void should_propagation_diseases(){



		givenCity();

		whenWeContaminateOver3Times();


		assertThat(city.numberDisease).isEqualTo(MAX_NUMBER_OF_DISEASE);


	}

	@Test
	public void should_contaminate_near_cities_when_eclosion(){

		givenCity();
		int numberDiseaseCity = firstNextCity.numberDisease;

		whenEclosion();

		assertThat(firstNextCity.numberDisease).isEqualTo(numberDiseaseCity+1);
	}

	private void whenEclosion() {
		whenWeContaminateOver3Times();
		city.eclosion();
	}

	private void whenWeContaminateOver3Times() {
		city.contaminate();
		city.contaminate();
		city.contaminate();
		city.contaminate();
	}

	private void givenCity() {
		city = new City();
		firstNextCity = this.city.nearCities.get(0);
	}

	private void givenCityWithDesease(int numberOfDisease) {
		city = new City(numberOfDisease);
	}*/
}
