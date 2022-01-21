package methodreferenceexample;

public class StaticMethodReferennceExample {
	Greetings grt = ThroughOfTheDay::writeThoughtOfTheDay;
    grt.sayGreetings();
}
