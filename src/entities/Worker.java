package entities;

import entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private String name;
    private Double baseSalary;
    private WorkerLevel level;
    private Departament departament;
    private List<HourContract> contracts =  new ArrayList<>();

    public Worker() {}

    public Worker(String name, Double baseSalary, WorkerLevel level, Departament departament) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.level = level;
        this.departament = departament;
    }

    public void addContract(HourContract contract){
        contracts.add(contract);
    }
    public void removeContract(HourContract contract){
        contracts.remove(contract);
    }
    public Double income(Integer year, Integer month){
        Double sum = getBaseSalary();
        Calendar calendar = Calendar.getInstance();
        for(HourContract contract : contracts){
            calendar.setTime(contract.getDate());
            if (year == calendar.get(Calendar.YEAR) && month == calendar.get(Calendar.MONTH) ){
                sum += contract.totalValue();
            }
        }
        return sum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Departament getDepartament() {
        return departament;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }
}
