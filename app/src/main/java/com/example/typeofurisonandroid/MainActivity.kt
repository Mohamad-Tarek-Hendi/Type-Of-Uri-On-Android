package com.example.typeofurisonandroid

import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.typeofurisonandroid.ui.theme.TypeOfUrisOnAndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // We have 4 type of Uris on Android:
        // resource Uris, file Uris, content Uris and data Uris.

        val resourcesUri =
            Uri.parse("android.resource://$packageName/drawable/ic_launcher_background")
        val launcherBackgroundByte = contentResolver.openInputStream(resourcesUri)?.use {
            it.readBytes()
        }

        println("ic_launcher_background size : ${launcherBackgroundByte?.size}")

        setContent {
            TypeOfUrisOnAndroidTheme {

            }
        }
    }
}