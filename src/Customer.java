public class Customer {

    private int id;
    private String fName;
    private String lName;
    private String gender;
    private int flightNo;
    private int priorityNo;

    // Default Constructor
    public Customer() {
        id = 0;
        fName = "";
        lName = "";
        gender = "";
        flightNo = 0;
        priorityNo = 0;
    }

    // Primary Constructor
    public Customer(int Id, String fName, String lName, String gender, int flightNo, int priorityNo) {
        this.id = Id;
        this.fName = fName;
        this.lName = lName;
        this.gender = gender;
        this.flightNo = flightNo;
        this.priorityNo = priorityNo;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFName() {
        return fName;
    }

    public void setFName(String fName) {
        this.fName = fName;
    }

    public String getLName() {
        return lName;
    }

    public void setLName(String lName) {
        this.lName = lName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(int flightNo) {
        this.flightNo = flightNo;
    }

    public int getPriorityNo() {
        return priorityNo;
    }

    public void setPriorityNo(int priorityNo) {
        this.priorityNo = priorityNo;
    }

    // Overriding toString
    public String toString() {
        return "[" + id +
                ", " + fName + " " + lName +
                ", " + gender +
                ", " + flightNo +
                ", " + priorityNo + "]";
    }
}
