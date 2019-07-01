package basics;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @Author liliang
 * @Date 2019/6/27 17:12
 * @Description
 **/
public class BigDecimalTest {

    public static void main(String[] args) {
        BigDecimal b1 = new BigDecimal(468232949);

        BigDecimal b2 = new BigDecimal(10000);

        BigDecimal result = b1.divide(b2,0, RoundingMode.UP);

        System.out.println(result);
    }
}
