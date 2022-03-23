public class Customer {

    private int Id;
    private String fName;
    private String lName;
    private String gender;
    private int flightNo;
    private int priorityNo;

    //
    public Customer() {
        Id = 0;
        fName = "";
        lName = "";
        gender = "";
        flightNo = 0;
        priorityNo = 0;
    }

    public Customer(int Id, String fName, String lName, String gender, int flightNo, int priorityNo) {
        this.Id = Id;
        this.fName = fName;
        this.lName = lName;
        this.gender = gender;
        this.flightNo = flightNo;
        this.priorityNo = priorityNo;
    }

    //Getters
    public int getId() {
        return Id;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getGender() {
        return gender;
    }

    public int getFlightNo() {
        return flightNo;
    }

    public int getPriorityNo() {
        return priorityNo;
    }

    //Setters
    public void setId(int id) {
        Id = id;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setFlightNo(int flightNo) {
        this.flightNo = flightNo;
    }

    public void setPriorityNo(int priorityNo) {
        this.priorityNo = priorityNo;
    }
}
