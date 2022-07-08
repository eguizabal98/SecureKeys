package com.example.securekeys

object Secrets {

    //Method calls will be added by gradle task hideSecret
    //Example : external fun getWellHiddenSecret(packageName: String): String
    init {
        System.loadLibrary("secrets")
    }

    external fun getApiKey(packageName: String): String
    external fun getServerUrl(packageName: String): String
    external fun getAppName(packageName: String): String
}
