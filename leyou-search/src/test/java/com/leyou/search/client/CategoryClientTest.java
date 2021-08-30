package com.leyou.search.client;

import com.leyou.LySearchApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

/**
 * @Description TODO
 * @Author wanggang
 * @Date 2021年06月01日
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = LySearchApplication.class)
public class CategoryClientTest {

    @Autowired
    private CategoryClient categoryClient;

    @Test
    public void testQueryCategories() {
        List<Long> idList = Arrays.asList(1l, 2l, 3l);
        List<String> names = categoryClient.queryNameByIds(idList);
        names.forEach(System.out::println);
    }

}
