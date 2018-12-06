package erin.castillo.com.castilloerinpe2;

public class Record {
    String s_fullName, s_age, s_gender;

    public Record() {
    }

    public Record(String s_fullName, String s_age, String s_gender) {
        this.s_fullName = s_fullName;
        this.s_age = s_age;
        this.s_gender = s_gender;
    }

    public String getStudent_fullName() {
        return s_fullName;
    }

    public void setStudent_fullName(String s_fullName) {
        this.s_fullName = s_fullName;
    }

    public String getStudent_age() {
        return s_age;
    }

    public void setStudent_age(String s_age) {
        this.s_age = s_age;
    }
    public String getStudent_gender() {
        return s_gender;
    }

    public void setStudent_gender(String s_gender) {
        this.s_gender = s_gender;
    }
}
