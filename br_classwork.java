interface person {
    static void personDetail() {
        System.out.println("Person's Name : Satyam");
        System.out.println("Person's Age: 75");
        System.out.println("Person's Contact number : 64276823");
    }

    default void aadhaar() {        // since this is a default method, we can redefine this method again in child class.
        final String aadhaar = "98564653";
        System.out.println(aadhaar);
    }
}

class br_classwork implements person {
    public void aadhaar() {
        String aadhaar = "567596876";
        System.out.println(aadhaar);
    }
    public static void main(String args[]) {
        person p = new br_classwork();
        person.personDetail();      // since this is a static function, therefore we will have to call it using the class/interface only.

        p.aadhaar();
    }
}