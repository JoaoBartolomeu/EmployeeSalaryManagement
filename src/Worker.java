public class Worker {
    private String name;
    private final Double baseSalary;
    private WorkerLevel level;

    public Worker(String name, Double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public void addContract(HourContract contract){}
    public void removeContract(HourContract contract){}
    public Double income(Integer year, Integer month){
        return getBaseSalary();
    }



    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public Double getBaseSalary() {return baseSalary;}

}
