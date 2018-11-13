package lab.profitsoft.main;

import lab.profitsoft.insurance.Contract;
import lab.profitsoft.people.Client;
import lab.profitsoft.people.InsuredPerson;
import lab.profitsoft.people.Type;


import java.time.LocalDate;
import java.util.ArrayList;


public class MainClass {
    public static void main(String[] args) {
        Client clientE=new Client(Type.ENTITY,"Ivanushki","Pushkin street 6");
        Client clientI=new Client(Type.INDIVIDUAL,"Litvin Roman Mikhailovich","Nauki 14");
        InsuredPerson insuredPerson1;
        InsuredPerson insuredPerson2;
        InsuredPerson insuredPerson3;
        InsuredPerson insuredPerson4;
        InsuredPerson insuredPerson5;

        insuredPerson1=new InsuredPerson("Litvin Roman Mikhailovich",LocalDate.of(1998,6,10),100000);
        insuredPerson2=new InsuredPerson("George Martin",LocalDate.of(1990,10,21),10000);
        insuredPerson3=new InsuredPerson("Milo Gaines",LocalDate.of(1968,3,27),20000);
        insuredPerson4=new InsuredPerson("Dorothy Green Alexandrovna",LocalDate.of(1979,6,1),22000);

        ArrayList<InsuredPerson> insuredPeople=new ArrayList<>();
        insuredPeople.add(insuredPerson2);
        insuredPeople.add(insuredPerson3);
        insuredPeople.add(insuredPerson4);

        Contract contract1=null;
        Contract contract2=null;
        Contract contract3=null;

        contract1=new Contract(LocalDate.of(2018,9,12),LocalDate.of(2018,9,13),LocalDate.of(2021,9,12),clientE,insuredPeople);
        contract2=new Contract(LocalDate.of(2010,3,30),LocalDate.of(2010,3,31),LocalDate.of(2020,3,31),clientI,insuredPerson1);
        contract3=new Contract(LocalDate.of(2017,12,25),LocalDate.of(2017,12,26),LocalDate.of(2018,12,26),clientE,insuredPerson2,insuredPerson3);

        System.out.println(contract1);
        System.out.println(contract2);
        System.out.println(contract3);


    }
}
