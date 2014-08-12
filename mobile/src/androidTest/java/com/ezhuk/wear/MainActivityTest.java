// Copyright (c) 2014 Eugene Zhuk.
// Use of this source code is governed by the MIT license that can be found
// in the LICENSE file.

package com.ezhuk.wear;

import android.app.ActionBar;
import android.test.ActivityInstrumentationTestCase2;


public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {
    private MainActivity mMainActivity;

    public MainActivityTest() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        mMainActivity = getActivity();
    }

    public void testPreconditions() {
        assertNotNull("mMainActivity is Null", mMainActivity);
    }

    public void testMainActivityTest_ActionBar() {
        final ActionBar actionBar = mMainActivity.getActionBar();
        assertNotNull("actionBar is Null", actionBar);

        final int displayOptions = actionBar.getDisplayOptions();
        assertTrue(0 == (displayOptions & ActionBar.DISPLAY_HOME_AS_UP));
        assertTrue(0 == (displayOptions & ActionBar.DISPLAY_SHOW_HOME));
    }
}
