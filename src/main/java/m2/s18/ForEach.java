package m2.s18;
// quando uso for each(item:array) lavoro sulle copie non sull'array
public class ForEach {
    public static void main(String[] args) {
        String[] array = new String[5];
        // ...

        for (String item : array) {
            System.out.println(item);
        }
    }
}
