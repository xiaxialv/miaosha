package xx;

import org.joda.time.DateTime;
import org.springframework.beans.BeanUtils;

import java.util.Date;

/**
 * @author Sidney 2019-01-12.
 */
public class test {
    public static void main(String[] args) {
//        String a="0";
//        System.out.println(new Byte(a));
//        byte b=0;
//        byte c=1;
//        System.out.println(b<c);
        DateTime as = new DateTime();
        Date bs = new Date();
        BeanUtils.copyProperties(as,bs);
        System.out.println(as.toString());
        System.out.println(bs.toString());

    }

    public static class A {
        DateTime a  = new DateTime();
    }

    public static class B {
        Date b = new Date();
    }

}
