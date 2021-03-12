package com.ssm.test.base.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.Test;

import com.ssm.model.AppLog;
import com.ssm.model.UserInfo;

/**
 * @author
 * @description
 * @date 2020/9/11
 */
public class Lambda {

    @Test
    public void lam(){

        // 1. Individual values
        Stream stream = Stream.of("a", "b", "c");
        // 2. Arrays
        String [] strArray = new String[] {"a", "b", "c"};

        IntStream.of(new int[]{1, 2, 3}).forEach(System.out::println);

        List<AppLog> list = new ArrayList<>();
        AppLog appLog = new AppLog();
        appLog.setLogId("1");

        AppLog appLog2 = new AppLog();
        appLog2.setLogId("2");
        AppLog appLog3 = new AppLog();
        appLog3.setLogId("3");

        list.add(appLog);list.add(appLog2);list.add(appLog3);

        List<String> collect = list.stream().map(AppLog::getLogId).collect(Collectors.toList());
        collect.forEach(o->{
            System.out.println(o);
        });

    }

    @Test
    public void streamCollect() {
        List<Long> longs = new ArrayList<>();
        longs.add(1l);
        longs.add(2l);
        final Set<Long> orgIds = new HashSet<>(longs);
        for (Long orgId : orgIds) {
            System.out.println(orgId);
        }

        UserInfo u1 = new UserInfo();
        u1.setId("1");
        u1.setName("aaa");
        UserInfo u2 = new UserInfo();
        u1.setId("2");
        u1.setName("bbb");
        UserInfo u3 = new UserInfo();
        u1.setId("3");
        u1.setName("bbb");
        List<UserInfo> list = new ArrayList();
        list.add(u1);list.add(u2);


//        final Map<String, Long> groupMap = list.stream().collect(Collectors.groupingBy(UserInfo::getName,Collectors.counting()));
//        Long aaa = groupMap.get("aaa");
//        System.out.println(aaa);
    }

    @Test
    public void tojson() {

        int left = 1;
        int right = 9;
        int i = left + (right - left) / 2;

        System.out.println(i);
        Map map = new HashMap();
        map.put("1",1);
        map.remove("2");

        map.put("","");



    }
}