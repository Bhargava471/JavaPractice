package polyorphism;
class TaxesPercentage{
	float getTaxPercentage() {
		return 0;
	}
}
class India extends TaxesPercentage{
	float getTaxPercentage() {
		System.out.println("India tax percentage is 7.8%");
	return 0;
	}
}
class USA extends TaxesPercentage{
	float getTaxPercentage() {
		System.out.println("USA tax percentage is 13.2%");
		return 0;
	}
}
class Australia extends TaxesPercentage{
	float getTaxPercentage(){
		System.out.println("Australia tax percentage is 11.0%");
		return 0;
	}
}
class Polymorphism {

	public static void main(String[] args) {
		TaxesPercentage t;
		t = new India();
		t.getTaxPercentage();
		t = new USA();
		t.getTaxPercentage();
		t = new Australia();
		t.getTaxPercentage();

	}

}
