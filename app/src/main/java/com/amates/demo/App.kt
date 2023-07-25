package com.amates.demo

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate
import com.amates.Amates
import com.amates.support.DomainConfig
import com.amates.support.GlideImageLoader
import com.amates.support.LocaleConfig
import com.amates.support.SimpleStyleConfig

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        Amates.init(
            application = this,
            appId = "YOUR_COMMUNITY_APP_ID_HERE",
            domainConfig = DomainConfig.createAmatesDomainConfig(),
            fileProviderAuthorities = "com.amates.demo.fileprovider",
            imageLoader = GlideImageLoader(),
            profileConfig = DemoAppProfileConfig(),
            styleConfig = SimpleStyleConfig(
                notificationIcon = R.drawable.ic_launcher_foreground, // your icon for notifications
                nightMode = AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM
            ),
            localeConfig = LocaleConfig.English.language,
            firebasePushTokenProvider = null,
            loggers = emptyList()
        )
    }
}
