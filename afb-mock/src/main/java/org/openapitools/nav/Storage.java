package org.openapitools.nav;

import org.openapitools.model.Order;
import org.openapitools.model.Transaction;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

/**
 * 2018/11/13
 *
 * @author Sirius
 */
public class Storage {


    private static Map<String, Map<LocalDate, BigDecimal>> navMap = new HashMap<>();
    private static Map<String, Order> orderMap = new HashMap<>();

    private static LocalDate inceptionDate = LocalDate.parse("2018-11-13");

    static {
        Map<LocalDate, BigDecimal> f1Map = new HashMap<>();
        Map<LocalDate, BigDecimal> f2Map = new HashMap<>();
        Map<LocalDate, BigDecimal> f3Map = new HashMap<>();

        navMap.put("1", f1Map);
        navMap.put("2", f2Map);
        navMap.put("3", f3Map);


        f1Map.put(inceptionDate, new BigDecimal("5.6270"));
        f1Map.put(LocalDate.parse("2018-11-14"), new BigDecimal("5.6360"));
        f1Map.put(LocalDate.parse("2018-11-15"), new BigDecimal("5.6420"));
        f1Map.put(LocalDate.parse("2018-11-16"), new BigDecimal("5.6420"));
        f1Map.put(LocalDate.parse("2018-11-19"), new BigDecimal("5.6340"));
        f1Map.put(LocalDate.parse("2018-11-20"), new BigDecimal("5.6350"));
        f1Map.put(LocalDate.parse("2018-11-21"), new BigDecimal("5.6310"));
        f1Map.put(LocalDate.parse("2018-11-22"), new BigDecimal("5.6270"));
        f1Map.put(LocalDate.parse("2018-11-23"), new BigDecimal("5.6210"));
        f1Map.put(LocalDate.parse("2018-11-26"), new BigDecimal("5.6020"));
        f1Map.put(LocalDate.parse("2018-11-27"), new BigDecimal("5.5860"));
        f1Map.put(LocalDate.parse("2018-11-28"), new BigDecimal("5.5840"));
        f1Map.put(LocalDate.parse("2018-11-29"), new BigDecimal("5.5860"));
        f1Map.put(LocalDate.parse("2018-11-30"), new BigDecimal("5.5830"));
        f1Map.put(LocalDate.parse("2018-12-03"), new BigDecimal("5.5780"));
        f1Map.put(LocalDate.parse("2018-12-04"), new BigDecimal("5.5780"));
        f1Map.put(LocalDate.parse("2018-12-05"), new BigDecimal("5.5790"));
        f1Map.put(LocalDate.parse("2018-12-06"), new BigDecimal("5.5880"));
        f1Map.put(LocalDate.parse("2018-12-07"), new BigDecimal("5.5890"));
        f1Map.put(LocalDate.parse("2018-12-10"), new BigDecimal("5.5920"));
        f1Map.put(LocalDate.parse("2018-12-11"), new BigDecimal("5.5950"));
        f1Map.put(LocalDate.parse("2018-12-12"), new BigDecimal("5.5950"));
        f1Map.put(LocalDate.parse("2018-12-13"), new BigDecimal("5.5950"));
        f1Map.put(LocalDate.parse("2018-12-14"), new BigDecimal("5.6050"));
        f1Map.put(LocalDate.parse("2018-12-17"), new BigDecimal("5.6160"));
        f1Map.put(LocalDate.parse("2018-12-18"), new BigDecimal("5.6220"));
        f1Map.put(LocalDate.parse("2018-12-19"), new BigDecimal("5.6280"));
        f1Map.put(LocalDate.parse("2018-12-20"), new BigDecimal("5.6260"));
        f1Map.put(LocalDate.parse("2018-12-21"), new BigDecimal("5.6200"));
        f1Map.put(LocalDate.parse("2018-12-24"), new BigDecimal("5.6160"));
        f1Map.put(LocalDate.parse("2018-12-25"), new BigDecimal("5.6050"));
        f1Map.put(LocalDate.parse("2018-12-26"), new BigDecimal("5.5950"));
        f1Map.put(LocalDate.parse("2018-12-27"), new BigDecimal("5.5940"));
        f1Map.put(LocalDate.parse("2018-12-28"), new BigDecimal("5.5860"));
        f1Map.put(LocalDate.parse("2018-12-31"), new BigDecimal("5.5880"));

        f2Map.put(inceptionDate, new BigDecimal("4.2940"));
        f2Map.put(LocalDate.parse("2018-11-14"), new BigDecimal("4.3600"));
        f2Map.put(LocalDate.parse("2018-11-15"), new BigDecimal("4.4680"));
        f2Map.put(LocalDate.parse("2018-11-16"), new BigDecimal("4.4770"));
        f2Map.put(LocalDate.parse("2018-11-19"), new BigDecimal("4.4350"));
        f2Map.put(LocalDate.parse("2018-11-20"), new BigDecimal("4.4640"));
        f2Map.put(LocalDate.parse("2018-11-21"), new BigDecimal("4.4560"));
        f2Map.put(LocalDate.parse("2018-11-22"), new BigDecimal("4.4560"));
        f2Map.put(LocalDate.parse("2018-11-23"), new BigDecimal("4.4990"));
        f2Map.put(LocalDate.parse("2018-11-26"), new BigDecimal("4.5280"));
        f2Map.put(LocalDate.parse("2018-11-27"), new BigDecimal("4.4920"));
        f2Map.put(LocalDate.parse("2018-11-28"), new BigDecimal("4.4010"));
        f2Map.put(LocalDate.parse("2018-11-29"), new BigDecimal("4.4330"));
        f2Map.put(LocalDate.parse("2018-11-30"), new BigDecimal("4.4470"));
        f2Map.put(LocalDate.parse("2018-12-03"), new BigDecimal("4.4250"));
        f2Map.put(LocalDate.parse("2018-12-04"), new BigDecimal("4.4290"));
        f2Map.put(LocalDate.parse("2018-12-05"), new BigDecimal("4.4940"));
        f2Map.put(LocalDate.parse("2018-12-06"), new BigDecimal("4.4290"));
        f2Map.put(LocalDate.parse("2018-12-07"), new BigDecimal("4.3830"));
        f2Map.put(LocalDate.parse("2018-12-10"), new BigDecimal("4.4080"));
        f2Map.put(LocalDate.parse("2018-12-11"), new BigDecimal("4.3840"));
        f2Map.put(LocalDate.parse("2018-12-12"), new BigDecimal("4.3980"));
        f2Map.put(LocalDate.parse("2018-12-13"), new BigDecimal("4.3240"));
        f2Map.put(LocalDate.parse("2018-12-14"), new BigDecimal("4.2220"));
        f2Map.put(LocalDate.parse("2018-12-17"), new BigDecimal("4.1320"));
        f2Map.put(LocalDate.parse("2018-12-18"), new BigDecimal("3.9870"));
        f2Map.put(LocalDate.parse("2018-12-19"), new BigDecimal("4.1090"));
        f2Map.put(LocalDate.parse("2018-12-20"), new BigDecimal("4.1760"));
        f2Map.put(LocalDate.parse("2018-12-21"), new BigDecimal("4.2620"));
        f2Map.put(LocalDate.parse("2018-12-24"), new BigDecimal("4.2860"));
        f2Map.put(LocalDate.parse("2018-12-25"), new BigDecimal("4.2510"));
        f2Map.put(LocalDate.parse("2018-12-26"), new BigDecimal("4.2610"));
        f2Map.put(LocalDate.parse("2018-12-27"), new BigDecimal("4.1700"));
        f2Map.put(LocalDate.parse("2018-12-28"), new BigDecimal("3.9650"));
        f2Map.put(LocalDate.parse("2018-12-31"), new BigDecimal("3.8780"));

        f3Map.put(inceptionDate, new BigDecimal("7.7340"));
        f3Map.put(LocalDate.parse("2018-11-14"), new BigDecimal("7.7280"));
        f3Map.put(LocalDate.parse("2018-11-15"), new BigDecimal("7.7380"));
        f3Map.put(LocalDate.parse("2018-11-16"), new BigDecimal("7.7510"));
        f3Map.put(LocalDate.parse("2018-11-19"), new BigDecimal("7.7640"));
        f3Map.put(LocalDate.parse("2018-11-20"), new BigDecimal("7.8080"));
        f3Map.put(LocalDate.parse("2018-11-21"), new BigDecimal("7.8280"));
        f3Map.put(LocalDate.parse("2018-11-22"), new BigDecimal("7.8480"));
        f3Map.put(LocalDate.parse("2018-11-23"), new BigDecimal("7.9570"));
        f3Map.put(LocalDate.parse("2018-11-26"), new BigDecimal("7.9850"));
        f3Map.put(LocalDate.parse("2018-11-27"), new BigDecimal("8.0000"));
        f3Map.put(LocalDate.parse("2018-11-28"), new BigDecimal("7.9650"));
        f3Map.put(LocalDate.parse("2018-11-29"), new BigDecimal("7.9330"));
        f3Map.put(LocalDate.parse("2018-11-30"), new BigDecimal("7.9830"));
        f3Map.put(LocalDate.parse("2018-12-03"), new BigDecimal("8.0190"));
        f3Map.put(LocalDate.parse("2018-12-04"), new BigDecimal("8.0400"));
        f3Map.put(LocalDate.parse("2018-12-05"), new BigDecimal("8.1170"));
        f3Map.put(LocalDate.parse("2018-12-06"), new BigDecimal("8.2300"));
        f3Map.put(LocalDate.parse("2018-12-07"), new BigDecimal("8.2360"));
        f3Map.put(LocalDate.parse("2018-12-10"), new BigDecimal("8.2080"));
        f3Map.put(LocalDate.parse("2018-12-11"), new BigDecimal("8.2270"));
        f3Map.put(LocalDate.parse("2018-12-12"), new BigDecimal("8.1580"));
        f3Map.put(LocalDate.parse("2018-12-13"), new BigDecimal("8.0300"));
        f3Map.put(LocalDate.parse("2018-12-14"), new BigDecimal("8.0960"));
        f3Map.put(LocalDate.parse("2018-12-17"), new BigDecimal("8.1280"));
        f3Map.put(LocalDate.parse("2018-12-18"), new BigDecimal("8.0650"));
        f3Map.put(LocalDate.parse("2018-12-19"), new BigDecimal("8.0280"));
        f3Map.put(LocalDate.parse("2018-12-20"), new BigDecimal("8.0240"));
        f3Map.put(LocalDate.parse("2018-12-21"), new BigDecimal("8.0380"));
        f3Map.put(LocalDate.parse("2018-12-24"), new BigDecimal("8.0470"));
        f3Map.put(LocalDate.parse("2018-12-25"), new BigDecimal("8.0590"));
        f3Map.put(LocalDate.parse("2018-12-26"), new BigDecimal("8.1180"));
        f3Map.put(LocalDate.parse("2018-12-27"), new BigDecimal("8.1350"));
        f3Map.put(LocalDate.parse("2018-12-28"), new BigDecimal("8.1070"));
        f3Map.put(LocalDate.parse("2018-12-31"), new BigDecimal("8.1480"));
    }

    public static BigDecimal getNav(LocalDate localDate, String fundId) {
        Map<LocalDate, BigDecimal> fundMap = navMap.getOrDefault(fundId, new HashMap<>());

        int max = 10;
        for (int i = 0; i < max; i++) {
            LocalDate key = i > 0 ? localDate.minusDays(i) : localDate;
            if (fundMap.containsKey(key)) {
                return fundMap.get(key);
            }
        }

        return fundMap.getOrDefault(inceptionDate, BigDecimal.ONE);
    }

    public static void addOrder(String id, Order order) {
        orderMap.put(id, order);
    }

    public static Order getOrder(String id) {
        return orderMap.get(id);
    }
}
