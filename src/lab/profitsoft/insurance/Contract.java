package lab.profitsoft.insurance;

import lab.profitsoft.people.Client;
import lab.profitsoft.people.InsuredPerson;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;


public class Contract {
    int number;
    LocalDate conclusionDate;
    LocalDate startDate;
    LocalDate endDate;
    Client client;
    ArrayList<InsuredPerson> insuredPeople;

    static int numOfContract=0;

    public Contract(LocalDate conclusionDate, LocalDate startDate, LocalDate endDate, Client client, InsuredPerson ... insuredPeople) {
    this(conclusionDate, startDate, endDate, client, new ArrayList<InsuredPerson>(Arrays.asList(insuredPeople)));
    }

    public Contract(LocalDate conclusionDate, LocalDate startDate, LocalDate endDate, Client client, ArrayList<InsuredPerson> insuredPeople) {
        this.number = numOfContract++;
        this.conclusionDate = conclusionDate;
        this.startDate = startDate;
        this.endDate = endDate;
        this.client = client;
        this.insuredPeople = insuredPeople;
    }

    public int totalInsuranceCost(){
        int contractCost=0;
        for (InsuredPerson insuredPerson:insuredPeople){
            contractCost+=insuredPerson.getInsurancePrice();
        }
        return contractCost;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "number: " + number +
                ", conclusionDate: " + conclusionDate +
                ", startDate: " + startDate +
                ", endDate: " + endDate +
                ", client: " + client +
                ", insuredPeople: " + insuredPeople +
                ", total Insurance sum: "+totalInsuranceCost()+
                '}';
    }
}
