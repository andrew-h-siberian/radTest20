package test;

import org.junit.Test;
import rad.bin..RunnerRatScatter;

import static junit.framework.Assert.assertEquals;

public class TestModule {
    @Test
    public void test_searchClosestMinimalIndex() {
        Double[] mas = new Double[]{1.5, 6.7, 8.1, 4.2};
        Double k = 4.1;

        assertEquals(1, RunnerRatScatter.searchClosestMinimalIndex(mas, k));
    }

}
