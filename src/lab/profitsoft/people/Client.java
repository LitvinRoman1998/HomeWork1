package lab.profitsoft.people;

public class Client extends Person {
    private Type type;
    private String companyName;
    private String adress;

    public Client(Type type,String name,String adress) {
        this.type = type;
        if(this.type.equals(Type.INDIVIDUAL)){
            this.fullName=name;
        }
        else {
            this.companyName=name;
        }
        this.adress=adress;
    }

    @Override
    public String toString() {
        return "Client{" +
                "type:" + type+(type==Type.INDIVIDUAL?", Full name:"+fullName:"Company name:"+companyName) +
                ", adress:'" + adress + '\'' +
                '}';
    }
}
