class Bank {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.firstName = "Jan";
        person1.lastName = "Kowalski";
        person1.pesel = "90897812362";

        Addres addres = new Addres();
        addres.postCode = "45-300";
        addres.place = "Szebrzeszyn";
        addres.street = "Pod Lasem";
        addres.nrHouse = "1A";
        addres.nrFlat = 8;

        person1.livingAddres = addres;
        person1.registeredAddres = addres;

        BankAccount account1 = new BankAccount();
        account1.owner = person1;
        account1.balance = 10_000;

        Credit credit1 = new Credit();
        credit1.borrower = person1;
        credit1.cashBorrowed = 2000;
        credit1.interestRate = 0.05;
        credit1.termMonths = 12;

        Person person2 = new Person();
        person2.firstName = "Euzebia";
        person2.lastName = "Kowalski";
        person2.pesel = "123456789";

        Addres registeredAddres = new Addres();
        registeredAddres.postCode = "44-100";
        registeredAddres.place = "Warszawa";
        registeredAddres.street = "Marszałkowska";
        registeredAddres.nrHouse = "2B";
        registeredAddres.nrFlat = 12;

        person2.livingAddres = addres;
        person2.registeredAddres = registeredAddres;

        BankAccount account2 = new BankAccount();
        account2.owner = person2;
        account2.balance = 20_500;

        System.out.println("Osoba 1:");
        System.out.println(person1.firstName + " " + person1.lastName + " " + person1.pesel);
        System.out.println("adres zamieszkania:"+person1.livingAddres.place);
        System.out.println("adres zameldowania:"+person1.registeredAddres.place);
        System.out.println("posiada konto bankowe z kwotą: " + account1.balance);
        System.out.println("oraz kredyt na kwotę: " + credit1.cashBorrowed);

        System.out.println();
        System.out.println("Osoba 2:");
        System.out.println(person2.firstName + " " + person2.lastName + " " + person2.pesel);
        System.out.println("adres zamieszkania:"+person2.livingAddres.place);
        System.out.println("adres zameldowania:"+person2.registeredAddres.place);
        System.out.println("posiada konto bankowe z kwotą: " + account2.balance);


    }
}