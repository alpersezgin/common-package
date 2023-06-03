package com.kodlamaio.commonpackage.utils.constants;

public class Roles {
    public static final String AdminAndUser = "hasRole('user') and hasRole('admin')";

    public static final String AdminOrModelyear = "hasRole('admin') || returnObject.modelYear == 2019";
}
