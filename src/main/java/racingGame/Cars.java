package racingGame;

import java.util.ArrayList;
import java.util.List;

public class Cars {

	private List<Car> cars = new ArrayList<>();

	public Cars (String carNames){
		String[] names = carNames.split(",");
		for(int i = 0 ; i< names.length; i++){
			cars.add(new Car(names[i]));
		}
	}
	public List<Car> getCars(){
		return cars;
	}

}
