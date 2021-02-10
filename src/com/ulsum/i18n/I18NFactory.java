package com.ulsum.i18n;

public class I18NFactory {

    // 静态工厂
    public static I18N getI18NObject(String area) {
        if (area.equals("china")) {
            return new Chinese();
        } else if (area.equals("spain")) {
            return new Spanish();
        } else if (area.equals("italy")) {
            return new Italian();
        } else {
            return null;
        }
    }

}
