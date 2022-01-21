package generic;

public class GenericClass<X> {
	X name;
	public X getName() {
		return name;
	}
	public void setName(X name) {
		this.name = name;
	}
	public String genericMethod(GenericClass<String> x) {
		x.setName("Rama");
		return x.name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
