import java.time.LocalDate;

public class Student {
    private String name;
    private LocalDate dateOfbirth;
    private int phoneNumber;
    private String nationality;


    public Student (String name,LocalDate dateOfbirth,int phoneNumber,String nationality) {
        this.name =name;
        this.dateOfbirth = dateOfbirth;
        this.phoneNumber = phoneNumber;
        this.nationality = nationality;

    }


    public String getName() {
        return name;
    }
        public void setName( String name) {
            this.name = name;

        }



    public void setDateOfbirth(LocalDate dateOfbirth) {
        this.dateOfbirth = dateOfbirth;
    }

    public LocalDate getDateOfbirth() {
        return dateOfbirth;
    }

    public String getNationality() {
        return nationality;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

}


