package Lecture10.Task2;
public class Test {
    public static void main(String[] args) {
        ArrayListButBetter<String> array1 = new ArrayListButBetter<>();
        ArrayListButBetter<String> array2 = new ArrayListButBetter<>(100);
        array1.add("Barcelona");
        array1.add("Madrid");
        array1.add("Valencia");

        array2.add("Berlin");
        array2.add("Munich");
        array2.add("Hamburg");

        System.out.println(array1);
        System.out.println(array2);

        array1.remove(0);
        array2.remove(0);

        System.out.println(array1);
        System.out.println(array2);

        System.out.println(array1.get(1));
        System.out.println(array2.get(1));

        System.out.println(array1.contains("Madrid"));
        System.out.println(array2.contains("Munich"));

        array1.clear();
        array2.clear();

        System.out.println(array1.contains("Madrid"));
        System.out.println(array2.contains("Munich"));

    }
}
