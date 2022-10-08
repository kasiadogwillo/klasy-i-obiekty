public class KlasyObiekty {
    public static void main(String[] args) {

        //co to jest klasa
        //template wykorzystywany do tworzenia podobnych do siebie obiektów

        //elementy składowe klasy
        //1. pola obiektu = z czego będzie składał się dany obiekt, np. co poże posiadać user?

        //tworząc nową klasę, tworzymy typ obiektu
        //typ = nazwa klasy

        //obiekt
        //typ obiektu - nazwa klasy (User) = new nazwa klasy()
//        User kasia = new User(); //utworzono nowy obiekt typu
//        kasia.firstName = "Dogwiłło";
//        System.out.println(kasia.firstName);
//
//        User tata = new User();
//        tata.email = "tata@email.com";
//        System.out.println(tata.email);
//
//        User seba = new User();
//        seba.wiek = 37;
//        System.out.println(seba.wiek);
//
//        User gacek = new User ();
//        gacek.isAdult = true;
//        System.out.println(gacek.isAdult);

        User bartosz = new User ();
        bartosz.firstName = "Bartosz";
        bartosz.lastName = "Wojteczek";
        bartosz.email = "nieznammailabartosza@gmail.com";
        bartosz.wiek = 36;
        bartosz.isAdult = true;

        System.out.println(bartosz.firstName);
        System.out.println(bartosz.lastName);
        System.out.println(bartosz.email);
        System.out.println(bartosz.wiek);
        System.out.println(bartosz.isAdult);

        User seba = new User ();
        seba.firstName = "Sebastian";
        seba.lastName = "Dogwiłło";
        seba.email = "sdogwillo@gmail.com";
        seba.wiek = 37;
        seba.isAdult = false;

        System.out.println(seba.firstName);
        System.out.println(seba.lastName);
        System.out.println(seba.email);
        System.out.println(seba.wiek);
        System.out.println(seba.isAdult);

        User kasia = new User();
        kasia.firstName = "Katarzyna";
        kasia.lastName = "Dogwiłło";
        kasia.email = "katarzynadogwillo@gmail.com";
        kasia.wiek = 35;
        kasia.isAdult = true;

        System.out.println(kasia.firstName);
        System.out.println(kasia.lastName);
        System.out.println(kasia.email);
        System.out.println(kasia.wiek);
        System.out.println(kasia.isAdult);
    }
}