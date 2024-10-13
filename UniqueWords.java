import java.util.*;

public class UniqueWords
{
    public static void main(String[] args){
        List<String> words = Arrays.asList(
                "Apple", "Microsoft", "Google", "Facebook", "Samsung",
                "Sony", "Huawei", "Intel", "Facebook", "Samsung",
                "Microsoft", "Google", "Facebook", "Huawei", "Huawei",
                "Google", "Facebook", "Huawei", "Huawei", "Facebook"
        );

        Set<String> unique = new HashSet<String>(words);

        System.out.println("Уникальные слова");
        System.out.println(unique.toString());
        System.out.println("Частота встречаемости слов");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }
    }
}