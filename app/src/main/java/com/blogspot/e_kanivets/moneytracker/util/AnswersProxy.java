package com.blogspot.e_kanivets.moneytracker.util;

import android.support.annotation.Nullable;


/**
 * Util class that wraps the Answers event analytic, to disable it in Debug mode and simplify
 * an interface.
 * Created on 1/11/17.
 *
 * @author Evgenii Kanivets
 */

public class AnswersProxy {
    private static AnswersProxy instance;

    public static AnswersProxy get() {
        if (instance == null) {
            instance = new AnswersProxy();
        }
        return instance;
    }

    private AnswersProxy() {

    }

    private boolean enabled;

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public boolean logEvent(@Nullable String eventName) {
        if (enabled) {
            return true;
        } else {
            return false;
        }
    }

    public boolean logButton(@Nullable String buttonName) {
        if (enabled) {
            return true;
        } else {
            return false;
        }
    }
}
