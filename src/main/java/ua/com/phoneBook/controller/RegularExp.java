package ua.com.phoneBook.controller;

/**
 * Created by denystymoshkevych on 8/7/17.
 */
public interface RegularExp {

    String REG_NAME = "^[a-zA-Z'.]{2,40}$";
    String REG_LOGIN = "^[A-Za-z0-9_-]{3,8}$";
    String REG_TEXT = "^[a-zA-Z0-9]+";
    String REG_ZIP_CODE = "^(\\d{5}-\\d{4}|\\d{5}|\\d{9})$|^([a-zA-Z]\\d[a-zA-Z] \\d[a-zA-Z]\\d)$";
    String REG_PHONE = "^(\\s*)?(\\+)?([- _():=+]?\\d[- _():=+]?){10,14}(\\s*)?$";
    String REG_EMAIL = "^(|(([A-Za-z0-9]+_+)|([A-Za-z0-9]+\\-+)|([A-Za-z0-9]+\\.+)|([A-Za-z0-9]+\\++))*[A-Za-z0-9]+@((\\w+\\-+)|(\\w+\\.))*\\w{1,63}\\.[a-zA-Z]{2,6})$";

}
