public class Main {

    public static void main(String[] args) {
        Address address1 = new Address("Москва", "Кековная", 15);
        Address address2 = new Address("Москва", "Кековная", 15);

        System.out.println(address1.equals(address2));
    }
}
