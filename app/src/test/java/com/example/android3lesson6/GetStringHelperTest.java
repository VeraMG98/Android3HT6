package com.example.android3lesson6;

import android.content.Context;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertArrayEquals;

public class GetStringHelperTest {
    GetStringHelper helper;
    @Before
    public void setup() {
        Context context = Mockito.mock(Context.class);
        Mockito.when(context.getString(R.string.words)).thenReturn("One Two");
        helper = new GetStringHelper(context);
    }

    @Test
    public void getString() {
        String[] res = {"One", "Two"};
        assertArrayEquals(res, helper.getString(R.string.words));
    }

    @After
    public void clear() {
        helper = null;
    }
}
