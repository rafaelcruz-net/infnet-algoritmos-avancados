package infnet.basicDataStructure.List;

public class TestList {
    public static void main(String[] args) {
        List list = new List();

        list.add("Rafael");
        list.add("Joao");
        list.add("Maria");
        list.add(2, "Silva");

        System.out.println(list.size());

        Object obj = list.get(2);

        System.out.println(obj);

        System.out.println(list.contains(obj));

        list.remove(1);
        list.remove(0);

        System.out.println(list.toString());
    }
}
