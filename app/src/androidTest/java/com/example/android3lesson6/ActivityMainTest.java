package com.example.android3lesson6;

import androidx.test.ext.junit.rules.ActivityScenarioRule;

import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

public class ActivityMainTest {
    @Rule
    public ActivityScenarioRule rule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void sumClickTest() {
        onView(withId(R.id.ed_txt)).perform(typeText("32"));
        onView(withId(R.id.ed_txt2)).perform(typeText("18"));
        onView(withId(R.id.sum)).perform(click());

        onView(withId(R.id.txt)).check(matches(withText("50")));
    }

    @Test
    public void subClickTest() {
        onView(withId(R.id.ed_txt)).perform(typeText("3"));
        onView(withId(R.id.ed_txt2)).perform(typeText("1"));
        onView(withId(R.id.sub)).perform(click());

        onView(withId(R.id.txt)).check(matches(withText("2")));
    }

    @Test
    public void multClickTest() {
        onView(withId(R.id.ed_txt)).perform(typeText("3"));
        onView(withId(R.id.ed_txt2)).perform(typeText("4"));
        onView(withId(R.id.mult)).perform(click());

        onView(withId(R.id.txt)).check(matches(withText("12")));
    }
}
