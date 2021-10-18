package Scope;

public class BookStoreMain {
    public static void main(String[] args) {
        BookStore bs = new BookStore("123");
        bs.printTheBooks();
        bs.addNewBook("111");
        bs.addNewBook("112");
        bs.addNewBook("113");
        bs.addNewBook("114");
        bs.printTheBooks();
        bs.addNewEmployee("122");
        bs.addNewEmployee("131");
        bs.addNewEmployee("124");
        bs.addNewEmployee("132");
        bs.getNumEmployees();
        bs.getNumBooks();
        System.out.println(bs.bookIsInStock("122"));
        System.out.println(bs.bookIsInStock("131"));
        System.out.println(bs.bookIsInStock("112"));
        System.out.println(bs.bookIsInStock("116"));
        System.out.println(  bs.getNumEmployees());
        System.out.println( bs.getNumBooks());


    }
}
