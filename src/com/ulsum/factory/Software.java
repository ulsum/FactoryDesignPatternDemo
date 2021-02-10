package com.ulsum.factory;

import com.ulsum.i18n.I18N;
import com.ulsum.i18n.I18NFactory;

public class Software {

    public static void main(String[] args) {
        I18N i18N = I18NFactory.getI18NObject("italy");
        System.out.println(i18N.getTitle());
    }

}
