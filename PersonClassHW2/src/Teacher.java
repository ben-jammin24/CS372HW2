public class Teacher extends Person implements Employee{
    private String gradeLevel;
    private String cert;
    private int ID = 123456;
    Teacher() { gradeLevel = "don't know"; cert = "don't know"; }//default teacher
    Teacher(String name, String phoneNumber, int age)
    {
        this.setName(name);
        this.setPhoneNumber(phoneNumber);
        this.setAge(age);
    }
    public int getPay()
    {
        return 30000;  // teacher pay per month
    }
    public int getID()
    {
        return ID;
    }

    public void setGradeLevel(String gradeLevel) { this.gradeLevel = gradeLevel; }

    public void setCert(String cert) { this.cert = cert; }

    public String getCert() { return cert; }
    public String getGradeLevel() { return gradeLevel;}
    public void display()
    {
        System.out.println(this.getName() + ", age " + this.getAge() +", works in the school as a " + this.getGradeLevel()
        + " grade teacher with a certification from " + this.getCert());
    }

}
