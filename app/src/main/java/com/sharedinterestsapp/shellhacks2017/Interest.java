package com.sharedinterestsapp.shellhacks2017;

/**
 * Created by Raf on 10/1/2017.
 */

public class Interest {

    int iconId = 0;
    String interestText = "";

    public Interest(int iconId, String interestText) {
        this.iconId = iconId;
        this.interestText = interestText;
    }

    public int getIconId() {
        return iconId;
    }

    public String getInterestText() {
        return interestText;
    }
}
