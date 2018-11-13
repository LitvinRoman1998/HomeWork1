package lab.profitsoft.people;


import java.time.LocalDate;

public class InsuredPerson extends Person {
    private LocalDate birthDay;
    private int insurancePrice;

    public InsuredPerson(String fullName, LocalDate birthDay, int insurancePrice) {
        super(fullName);
        this.birthDay = birthDay;
        this.insurancePrice = insurancePrice;
    }

    public int getInsurancePrice() {
        return insurancePrice;
    }

    @Override
    public String toString() {
        return "InsuredPerson{" +"fullName:'" + fullName +
                ", birthDay:" + birthDay +
                ", insurancePrice:" + insurancePrice +
                 '\'' +
                '}';
    }
}
