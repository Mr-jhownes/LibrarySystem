package readerSession;
/**
 * @author Jonathan Santos
 *
 */

public class Reader {

	private int id;
    private String name;
    private String surname;
    private int age;
    private String gender;
    private String address;
    
    

    public Reader(int id, String name, String surname, int age, String gender, String address) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    public int getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }
    
    @Override
    public String toString() {
    	
    	return this.id + ", " + this.name + " " +  this.surname +  ", " + this.age + ", " + this.gender + ", " + this.address + "\r";
    }

	
}
