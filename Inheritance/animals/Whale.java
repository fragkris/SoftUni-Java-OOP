
public class Whale extends Animal{
	
	public Whale(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public String produceSound() {
        return "Radar sounds";
    }

}
