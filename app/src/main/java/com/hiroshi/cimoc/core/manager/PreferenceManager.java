package com.hiroshi.cimoc.core.manager;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Hiroshi on 2016/8/4.
 */
public class PreferenceManager {

    public static final int READER_MODE_PAGE = 0;
    public static final int READER_MODE_STREAM = 1;

    public static final int READER_TURN_LTR = 0;
    public static final int READER_TURN_RTL = 1;
    public static final int READER_TURN_ATB = 2;

    public static final int READER_ORIENTATION_PORTRAIT = 0;
    public static final int READER_ORIENTATION_LANDSCAPE = 1;

    public static final int HOME_COMIC = 0;
    public static final int HOME_SOURCE = 1;
    public static final int HOME_TAG = 2;

    public static final String PREF_APP_VERSION = "pref_app_version";

    public static final String PREF_MAIN_NOTICE = "pref_main_notice";

    public static final String PREF_READER_MODE = "pref_reader_mode";
    public static final String PREF_READER_KEEP_ON = "pref_reader_keep_on";
    public static final String PREF_READER_HIDE_INFO = "pref_reader_hide_info";

    public static final String PREF_READER_PAGE_TURN = "pref_reader_page_turn";
    public static final String PREF_READER_PAGE_ORIENTATION = "pref_reader_page_orientation";
    public static final String PREF_READER_PAGE_CLICK_LEFT = "pref_reader_page_click_left";
    public static final String PREF_READER_PAGE_CLICK_TOP = "pref_reader_page_click_top";
    public static final String PREF_READER_PAGE_CLICK_MIDDLE = "pref_reader_page_click_middle";
    public static final String PREF_READER_PAGE_CLICK_BOTTOM = "pref_reader_page_click_bottom";
    public static final String PREF_READER_PAGE_CLICK_RIGHT = "pref_reader_page_click_right";
    public static final String PREF_READER_PAGE_CLICK_UP = "pref_reader_page_click_up";
    public static final String PREF_READER_PAGE_CLICK_DOWN = "pref_reader_page_click_down";
    public static final String PREF_READER_PAGE_LONG_CLICK_LEFT = "pref_reader_page_long_click_left";
    public static final String PREF_READER_PAGE_LONG_CLICK_TOP = "pref_reader_page_long_click_top";
    public static final String PREF_READER_PAGE_LONG_CLICK_MIDDLE = "pref_reader_page_long_click_middle";
    public static final String PREF_READER_PAGE_LONG_CLICK_BOTTOM = "pref_reader_page_long_click_bottom";
    public static final String PREF_READER_PAGE_LONG_CLICK_RIGHT = "pref_reader_page_long_click_right";
    public static final String PREF_READER_PAGE_LOAD_PREV = "pref_reader_page_load_prev";
    public static final String PREF_READER_PAGE_LOAD_NEXT = "pref_reader_page_load_next";
    public static final String PREF_READER_PAGE_TRIGGER = "pref_reader_page_trigger";

    public static final String PREF_READER_STREAM_TURN = "pref_reader_stream_turn";
    public static final String PREF_READER_STREAM_ORIENTATION = "pref_reader_stream_orientation";
    public static final String PREF_READER_STREAM_CLICK_LEFT = "pref_reader_stream_click_left";
    public static final String PREF_READER_STREAM_CLICK_TOP = "pref_reader_stream_click_top";
    public static final String PREF_READER_STREAM_CLICK_MIDDLE = "pref_reader_stream_click_middle";
    public static final String PREF_READER_STREAM_CLICK_BOTTOM = "pref_reader_stream_click_bottom";
    public static final String PREF_READER_STREAM_CLICK_RIGHT = "pref_reader_stream_click_right";
    public static final String PREF_READER_STREAM_CLICK_UP = "pref_reader_stream_click_up";
    public static final String PREF_READER_STREAM_CLICK_DOWN = "pref_reader_stream_click_down";
    public static final String PREF_READER_STREAM_LONG_CLICK_LEFT = "pref_reader_stream_long_click_left";
    public static final String PREF_READER_STREAM_LONG_CLICK_TOP = "pref_reader_stream_long_click_top";
    public static final String PREF_READER_STREAM_LONG_CLICK_MIDDLE = "pref_reader_stream_long_click_middle";
    public static final String PREF_READER_STREAM_LONG_CLICK_BOTTOM = "pref_reader_stream_long_click_bottom";
    public static final String PREF_READER_STREAM_LONG_CLICK_RIGHT = "pref_reader_stream_long_click_right";
    public static final String PREF_READER_STREAM_LOAD_PREV = "pref_reader_stream_load_prev";
    public static final String PREF_READER_STREAM_LOAD_NEXT = "pref_reader_stream_load_next";
    public static final String PREF_READER_STREAM_SPLIT = "pref_reader_stream_split";
    public static final String PREF_READER_STREAM_INTERVAL = "pref_reader_stream_interval";

    public static final String PREF_NIGHT = "pref_night";

    public static final String PREF_OTHER_STORAGE = "pref_other_storage";
    public static final String PREF_OTHER_THEME = "pref_other_theme";
    public static final String PREF_OTHER_LAUNCH = "pref_other_launch";

    public static final String PREF_DOWNLOAD_CONNECTION = "pref_download_connection";
    public static final String PREF_DOWNLOAD_ORDER = "pref_download_order";
    public static final String PREF_DOWNLOAD_THREAD = "pref_download_thread";

    public static final String PREF_SEARCH_COMPLETE = "pref_search_complete";

    public static final String PREF_SOURCE_SERVER_IKANMAN = "pref_source_server_ikanman";
    public static final String PREF_SOURCE_SERVER_HHAAZZ = "pref_source_server_hhaazz";
    public static final String PREF_SOURCE_SERVER_57MH = "pref_source_server_57mh";

    private static final String PREFERENCES_NAME = "cimoc_preferences";

    private SharedPreferences mSharedPreferences;

    public PreferenceManager(Context context) {
        mSharedPreferences = context.getSharedPreferences(PREFERENCES_NAME, Context.MODE_PRIVATE);
    }

    public String getString(String key) {
        return getString(key, null);
    }

    public String getString(String key, String defValue) {
        return mSharedPreferences.getString(key, defValue);
    }

    public boolean getBoolean(String key, boolean defValue) {
        return mSharedPreferences.getBoolean(key, defValue);
    }

    public int getInt(String key, int defValue) {
        return mSharedPreferences.getInt(key, defValue);
    }

    public long getLong(String key, long defValue) {
        return mSharedPreferences.getLong(key, defValue);
    }

    public void putString(String key, String value) {
        mSharedPreferences.edit().putString(key, value).apply();
    }

    public void putBoolean(String key, boolean value) {
        mSharedPreferences.edit().putBoolean(key, value).apply();
    }

    public void putInt(String key, int value) {
        mSharedPreferences.edit().putInt(key, value).apply();
    }

    public void putLong(String key, long value) {
        mSharedPreferences.edit().putLong(key, value).apply();
    }

}
