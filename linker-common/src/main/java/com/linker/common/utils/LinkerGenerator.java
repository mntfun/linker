package com.linker.common.utils;

import java.util.UUID;

/**
 * @class: LinkerGenerator.java
 * @version: 1.0
 * @author: CM
 * @e-mail: chenmao@danlu.com
 * @date: 2018/7/12 11:05
 * Created By IntelliJ  IDEA
 */
public class LinkerGenerator {

    public static String generateUUID(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }

}
