import entities.Departament;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

                        /*Inicio*/
        System.out.println("Enter departament's name: ");
        String departamentName = sc.nextLine();

        System.out.println("Enter worker data: ");
        System.out.println("Name: ");
        String nameWorker = sc.nextLine();

        System.out.println("Level: ");
        String levelWorker = sc.nextLine();


        System.out.println("Base Salary: ");
        Double baseSalary = sc.nextDouble();
        Worker worker = new Worker(nameWorker, baseSalary,WorkerLevel.valueOf(levelWorker), new Departament(departamentName));

        System.out.println("How many contracts to this worker? ");
        int contracts = sc.nextInt();
        for (int i = 0; i < contracts ; i++){
            System.out.println("Enter contract " + i + 1 + " data: ");
            System.out.println("Date (DD/MM/YYYY): ");
            String dateContract = sc.nextLine();


            System.out.println("Value per hour: ");
            Double valuePerHour = sc.nextDouble();

            System.out.println("Duration (Hours): ");
            Integer duration = sc.nextInt();
            HourContract hourContract = new HourContract(sdf.parse(dateContract), valuePerHour, duration);

        }
        System.out.println("Enter month and year to calculate income (DD/MM/YYYY): ");
        Integer month = sc.nextInt();
        Integer year = sc.nextInt();
        System.out.println(worker.getName());
        System.out.println(worker.getDepartament());
        System.out.println(worker.income(month, year));

    }
}