package ua.com.dzlobenets.son.app;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Main {
    // line 1
    // line 2
    private static final String[] MEMBERS = new String[]{
            "Mother", //0
            "Father",// 1
            "Sister",//2
            "Brother"//3
    };
    private static final Map<String, Integer> STATISTIC_OF_MEMBERS = new HashMap<>();

    public static void main(String[] args) throws Exception {

        for (int i = 10; i > 0; i--) {
            final double indexDouble = Math.random() * 3;
            final int indexInt = (int) Math.round(indexDouble);
            final String member = MEMBERS[indexInt];

            STATISTIC_OF_MEMBERS.compute(
                    member,
                    (k, v) -> (Objects.isNull(v) ? 1 : v + 1)
            );

            System.out.println("Hello," + member);
            Thread.sleep(2000);
        }

        System.out.println(STATISTIC_OF_MEMBERS);
    }
}
