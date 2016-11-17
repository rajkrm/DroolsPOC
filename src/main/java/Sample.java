import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Sudheer Chowdary on 11/2/2016.
 */
public class Sample implements inter {

    public static void main(String args[]) throws ParseException {
        List<String> list = new ArrayList<>();
        list.add("Mango");
        list.add("Orange");
        list.add("Banana");

        Stream<String> fs = list.parallelStream();
        fs.filter(fruit ->  {
            System.out.println("Fruit:"+fruit);
            return true;
        }).forEach(fruit -> {});
    }


    public static void con(String s){
        System.out.println(s);
    }

    @Override
    public void print() {

    }

}
