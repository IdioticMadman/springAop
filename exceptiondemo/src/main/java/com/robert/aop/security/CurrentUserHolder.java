package com.robert.aop.security;

/**
 * 模拟当前用户
 *
 * @author robert
 */
public class CurrentUserHolder {

    private static final ThreadLocal<String> holder = new ThreadLocal<>();

    public static String get() {
        return holder.get() == null ? "unknow" : holder.get();
    }

    public static void set(String user) {
        holder.set(user);
    }

}
