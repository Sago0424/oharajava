package monndai13;


public class Cook implements Person {
    private String name;
    private String job;
    private String specialty;

    public Cook(String name, String job, String specialty) {
        this.name = name;
        this.job = job;
        this.specialty = specialty;
    }

    @Override
    public void introduce() {
        System.out.println("氏名：" + name);
        System.out.println("職種：" + job);
        System.out.println("得意料理：" + specialty);
    }
}


