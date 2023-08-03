package HomeWork_1;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class SortingUtil {
    public static <T>List<T>sort(List<T>list,Comparator<T>comparator){
        Collections.sort(list,comparator);
        return list;
    }
}
