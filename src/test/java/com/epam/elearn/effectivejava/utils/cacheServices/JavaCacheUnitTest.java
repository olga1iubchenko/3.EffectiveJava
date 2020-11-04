package com.epam.elearn.effectivejava.utils.cacheServices;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import utils.JavaCacheService;

public class JavaCacheUnitTest {

    @BeforeEach
    public void setUp() throws InterruptedException {
        JavaCacheUnitTest javaCacheUnitTest = new JavaCacheUnitTest();

        System.out.println("\n\n==========Test1: testAddRemoveObjects ==========");
        javaCacheUnitTest.testAddRemoveObjects();
        System.out.println("\n\n==========Test2: testExpiredCacheObjects ==========");
        javaCacheUnitTest.testExpiredCacheObjects();
        System.out.println("\n\n==========Test3: testObjectsCleanupTime ==========");
        javaCacheUnitTest.testObjectsCleanupTime();
}

   @Test
   public void testAddRemoveObjects() {
        // Test with timeToLive = 200 seconds
        // timerInterval = 500 seconds
        // maxItems = 6
        JavaCacheService<String, String> cache = new JavaCacheService<String, String>(200, 500, 6);

        cache.put("eBay", "eBay");
        cache.put("Paypal", "Paypal");
        cache.put("Google", "Google");
        cache.put("Microsoft", "Microsoft");
        cache.put("IBM", "IBM");
        cache.put("Facebook", "Facebook");

        System.out.println("6 Cache Object Added.. cache.size(): " + cache.size());
        cache.remove("IBM");
        System.out.println("One object removed.. cache.size(): " + cache.size());

        cache.put("Twitter", "Twitter");
        cache.put("SAP", "SAP");
        System.out.println("Two objects Added but reached maxItems.. cache.size(): " + cache.size());

    }

    @Test
    public void testExpiredCacheObjects() throws InterruptedException {
        // Test with timeToLive = 1 second
        // timerInterval = 1 second
        // maxItems = 10
        JavaCacheService<String, String> cache = new JavaCacheService<String, String>(1, 1, 10);

        cache.put("eBay", "eBay");
        cache.put("Paypal", "Paypal");
        // Adding 3 seconds sleep.. Both above objects will be removed from
        // Cache because of timeToLiveInSeconds value
        Thread.sleep(3000);

        System.out.println("Two objects are added but reached timeToLive. cache.size(): " + cache.size());

    }


    @Test
    public void testObjectsCleanupTime() throws InterruptedException {
        int size = 500000;

        // Test with timeToLiveInSeconds = 100 seconds
        // timerIntervalInSeconds = 100 seconds
        // maxItems = 500000

        JavaCacheService<String, String> cache = new JavaCacheService<String, String>(100, 100, 500000);

        for (int i = 0; i < size; i++) {
            String value = Integer.toString(i);
            cache.put(value, value);
        }

        Thread.sleep(200);

        long start = System.currentTimeMillis();
        cache.cleanup();
        double finish = (double) (System.currentTimeMillis() - start) / 1000.0;

        System.out.println("Cleanup times for " + size + " objects are " + finish + " s");

    }
}
