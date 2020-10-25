import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 兰龙斌
 * @date Created in 2020/10/24 17:09
 * @description
 * @version: v1.0
 */
public class YYYYMMDD {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        String format = dateFormat.format(new Date());
        System.out.println(format);
    }
}
