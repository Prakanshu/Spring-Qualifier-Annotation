package guru.springframework.services;

public class PropertyGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Hi , I am injected from Property";
	}

}
