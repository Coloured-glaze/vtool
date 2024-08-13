package com.omarea.vtools;

import android.app.Application;
import androidx.test.core.app.ApplicationProvider;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertNotNull;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
@RunWith(AndroidJUnit4.class)
public class ApplicationTest {

    public ApplicationTest() {
        // 默认构造函数可以删除，因为不需要继承 ApplicationTestCase
    }

    @Test
    public void testApplicationExists() {
        Application application = ApplicationProvider.getApplicationContext();
        assertNotNull("Application is null", application);
    }
}
