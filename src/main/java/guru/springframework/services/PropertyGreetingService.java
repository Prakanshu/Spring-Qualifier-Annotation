package guru.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Hi , I am injected from Property";
	}

}
