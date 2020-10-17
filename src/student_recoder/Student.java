package student_recoder;

public class Student {
    private String id ;
    private String bench_Number;
    private String name;
    private String e_mail;
    private String telephone ;

    public Student() {
    }
    
 

    public Student(String id, String bench_Number, String name, String e_mail, String telephone) {
        this.id = id;
        this.bench_Number = bench_Number;
        this.name = name;
        this.e_mail = e_mail;
        this.telephone = telephone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBench_Number() {
        return bench_Number;
    }

    public void setBench_Number(String bench_Number) {
        this.bench_Number = bench_Number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", bench_Number=" + bench_Number + ", name=" + name + ", e_mail=" + e_mail + ", telephone=" + telephone + '}';
    }
    
    
}
