import java.util.Date;

public class HourContract extends Departament{
    private Date date;
    private Double valuePerHour;
    private Integer hour;

    public HourContract(Date date, Double valuePerHour, Integer hour) {

        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hour = hour;
    }
    public Double totalValue(){
        return valuePerHour * hour;
    };
}
