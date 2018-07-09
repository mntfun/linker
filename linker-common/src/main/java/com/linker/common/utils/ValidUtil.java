package com.linker.common.utils;

import java.util.Collection;

/**
 * 通用验证工具
 * Created by dentalulcer on 05/07/2018.
 */
public class ValidUtil {

    public static boolean isValid(String str){
        return str != null && !"".equals(str.trim());
    }

    public static boolean isValid(Object[] arr){
        return arr != null && arr.length > 0;
    }

    public static boolean isValid(@SuppressWarnings("rawtypes") Collection col){
        return col != null && !col.isEmpty();
    }

    public static boolean isValid(Object obj){
        return obj != null;
    }

}
