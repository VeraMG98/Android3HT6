package com.example.android3lesson6;

import android.content.Context;

public class GetStringHelper {
    private Context context;

    public GetStringHelper(Context context) {
        this.context = context;
    }

    public String[] getString(int stringId) {
        return context.getString(stringId).split(" ");
    }
}
