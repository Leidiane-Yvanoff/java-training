public class ObjectTraining {

    // TODO 1. Add the following private attributes :
    // - name (String)
    // - age (int)
    // - wilder (boolean)
	
    private String name;  
    private int age; 
    private boolean wilder;

    // TODO 2. Add a Constructor with name and age arguments (in this order)
    // This constructor must initialize name and age attributes
    public ObjectTraining(String name, int age) {  
        this.name = name;  
        this.age = 0;  
        this.wilder = true;
        
    }  

    // TODO 3. Add getter method for name attribute 
    public String getName() {  
        return this.name;  
    }  
    // TODO 4. Add setter method for name attribute

    public void setName(String name) {  
        this.name = name;  
    }
    // TODO 5. Add setter method for age attribute
    public int getAge() {  
        return this.age;  
    } 
    // TODO 6. Add setter method for age attribute

    public void setAge(int age) {
        this.age = age;
    }
    // TODO 7. Add getter method for wilder attribute
    public boolean isWilder() {
		return wilder;
	}
    // TODO 8. Add setter method for wilder attribute


	public void setWilder(boolean wilder) {
		this.wilder = wilder;
	}
	
	// TODO 9. Create a method 'whoAmI' that returns "My name is {name} and I'm {age}"
    // where you replace {name} and {age} with attributes values
    public String  whoAmI() {
    	
    	String str = "My name is " + this.getName();
    	return str + " and I'm " + this.getAge();
    }


    // Do not remove this empty constructor !
    public ObjectTraining() {
    }

	
}
