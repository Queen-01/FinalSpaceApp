package com.example.finalspace;

import android.view.View;

import androidx.test.core.app.ActivityScenario;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class FindActivityInstrumentationTest {
    @Rule
    public ActivityScenarioRule<FindActivity> activityTestRule = new ActivityScenarioRule<FindActivity>(FindActivity.class);
    private View activityDecorView;

    @Before
    public void setUp(){
        activityTestRule.getScenario().onActivity(new ActivityScenario.ActivityAction<FindActivity>() {
            @Override
            public void perform(FindActivity activity) {
                activityDecorView = activity.getWindow().getDecorView();
            }
        })
    }
}
