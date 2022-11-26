import java.lang.Math;
public class Person {
    private long id;
    private String name;
    private String gender;
    private unit division;
    private int salary;
    private String BirthDay;

    public String getBirthDay() {
        return BirthDay;
    }

    public void setBirthDay(String birthDay) {
        BirthDay = birthDay;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", division:ID = " + division.getId() + "  name = " + division.getName() +
                ", salary=" + salary +
                ", BirthDay='" + BirthDay + '\'' +
                '}';
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public unit getDivision() {
        return division;
    }

    public void setDivision(unit division) {
        this.division = division;
    }

    Person(String[] A)
    {
        if (A == null || A.length != 6)
            throw new RuntimeException("invalid cvs file");
        id = new Long(A[0]).longValue();
        name = new String(A[1]);
        gender = new String((A[2]));
        BirthDay = new String(A[3]);
        salary = Integer.parseInt(A[5]);
        division = new unit();
        division.setName(A[4]);
        division.setId(~System.currentTimeMillis() + (int)(Math.random() * 1000));
    }


}
