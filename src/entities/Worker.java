package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    
    private String name;
    private WorkerLevel level;
    private Double BaseSalary;

    private Departament departament;
    private List<HourContract> contracts = new ArrayList<>();

    public Worker(){

    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Departament departament) {
        this.name = name;
        this.level = level;
        BaseSalary = baseSalary;
        this.departament = departament;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return BaseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        BaseSalary = baseSalary;
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

    /*Adicionar e Remover Contratos */
    public void AddContract(HourContract contract){
        contracts.add(contract);
    }
    
    public void RemoveContract(HourContract contract){
        contracts.remove(contract);
    }

    /*Calculo de ganho dos funcionarios */

    public Double income(int year, int month){
        double soma = BaseSalary;
        Calendar cal = Calendar.getInstance()
        for (HourContract c : contracts){
          cal.setTime(c.getDate());

          int c_year = cal.get(Calendar.YEAR); 
          int c_month =1 + cal.get(Calendar.MONTH); 
            if (year == c_year && month == c_month){
            soma += c.totalValue();
           }
        }
        return soma;
    }
}
