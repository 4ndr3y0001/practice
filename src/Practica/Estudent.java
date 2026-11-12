package Practica;

public class Estudent implements Comparable<Estudent> {
    private String name;
    private double qualification;

    public Estudent(){
        this("unnamed",01);
    }

    public Estudent (String name, double qualification) {
        this.name = name;
        this.qualification = qualification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getQualification() {
        return qualification;
    }

    public void setQualification(double qualification) {
        this.qualification = qualification;
    }

    @Override
    public String toString() {
        return "Estudent{" +
                "name='" + name + '\'' +
                ", qualification=" + qualification +
                '}';
    }

    @Override
    public int compareTo(Estudent o) {
        if(this.qualification>o.qualification){
            return -1;
        } else if (this.qualification<o.qualification) {
            return 1;
        }else {
            return 0;
        }
    }
}


