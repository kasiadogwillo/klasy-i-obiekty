public class MojObiekt {

    public static void main(String[] args) {

        //tworzenie obiektu bazującego na klasie

        //jeżeli tworzę nową klasę, tworzę nowy typ - dla obiektu tworzonego z klasy X będzie to nazwa klasy X

        //TYP OBIEKTU (czyli nazwa klasy, w której jest obiekt) nazwa nowego obiektu = nowy obiekt;

        PolaObiektu katarzyna = new PolaObiektu(); //new NazwaKlasy;

        katarzyna.firstName = "Katarzyna";
        katarzyna.lastName = "Dogwiłło";
        katarzyna.email = "katarzynadogwillo@gmail.com";
        katarzyna.age = 35;
        katarzyna.isAdult = true;

        System.out.println(katarzyna.firstName);
        System.out.println(katarzyna.lastName);
        System.out.println(katarzyna.email);
        System.out.println(katarzyna.age);
        System.out.println(katarzyna.isAdult);

    }
}