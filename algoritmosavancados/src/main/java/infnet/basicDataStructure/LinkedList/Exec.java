package infnet.basicDataStructure.LinkedList;

public class Exec {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList();
        list.addFront("Isabel");
        list.addFront("Ruth");
        list.addFront("Karl");
        list.addFront("John");
        System.out.println(list.find("Isabel"));
        System.out.println(list.find("Ruth"));
        System.out.println(list.find("Karl"));
        System.out.println(list.find("John"));
        System.out.println(list.find("James"));

        list.deleteFront();
        System.out.println(list.find("John"));
        list.addFront("Oliver");
        System.out.println(list.find("Ruth"));
        list.addAfter(list.find("Ruth").get(), "Sam");
        System.out.println(list.toString());
    }
}
