package com.farangbank.firebaseday.operatives.accounts;


import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import com.farangbank.firebaseday.R;
import com.google.android.libraries.cloudtesting.screenshots.ScreenShotter;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withParent;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class AccountsActivityTest2 {

    @Rule
    public ActivityTestRule<AccountsActivity> mActivityTestRule = new ActivityTestRule<>(AccountsActivity.class);

    @Test
    public void accountsActivityTest2() {
        ViewInteraction appCompatImageButton = onView(
                allOf(withContentDescription("Open navigation drawer"),
                        withParent(withId(R.id.toolbar)),
                        isDisplayed()));
        appCompatImageButton.perform(click());

        Context context = InstrumentationRegistry.getTargetContext();
        ViewInteraction appCompatCheckedTextView = onView(
                allOf(withId(R.id.design_menu_item_text), withText(context.getString(R.string.operatives_cards)),
                        isDisplayed()));
        ScreenShotter.takeScreenshot("activity_screen", mActivityTestRule.getActivity());
        appCompatCheckedTextView.perform(click());
        ScreenShotter.takeScreenshot("activity_screen2", mActivityTestRule.getActivity());

    }

}
