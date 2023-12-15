package model.entities;

public  abstract  class Person {
    private String name;
    private String email;
    private Double balance;


    public Person(){


    }

    public Person(String name, String email, Double balance) {
        this.name = name;
        this.email = email;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getBalance() {
        return balance;
    }


    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("User: "+getName()+" \n");
        sb.append("Email: "+getEmail());
        return sb.toString();
    }

}
