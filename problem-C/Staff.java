public class Staff extends Person {
    private String school;
    private double pay;

    public Staff(String name,String address,String school,double pay){
        this.setName(name);
        this.setAddress(address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public double getPay() {
        return pay;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public String toString() {
        return String.format("Staff[%s,school=%s,pay=$f]", super.toString(), school, pay);
    }
}
