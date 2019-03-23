package guru.springframework.services;

public class SetterGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Hi , I am injected by setter";
	}

}
