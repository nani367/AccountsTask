ublic class Account {
    private String name;
    private int age;
    private double Average_Age__c;

    public Account(String name, int age) {
        this.name = name;
        this.age = age;
        Average_Age__c = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAverage_Age__c(double average_Age__c) {
        Average_Age__c = average_Age__c;
    }

    public double getAverage_Age__c() {
        return Average_Age__c;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", Average_Age__c=" + Average_Age__c +
                '}';
    }
}
