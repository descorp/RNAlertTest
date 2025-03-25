package com.testrn74.my_module
import android.content.Intent
import com.facebook.react.bridge.Callback
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod

class ForcedAlertModule internal constructor(private val context: ReactApplicationContext?) :
    ReactContextBaseJavaModule(context) {

    override fun getName(): String {
        return "ForcedAlert"
    }

    @ReactMethod
    fun alert(title: String?, message: String?) {
        val dialogIntent = Intent(reactApplicationContext, AlertDialogActivity::class.java)
        dialogIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        dialogIntent.putExtra("title", title)
        dialogIntent.putExtra("message", message)
        context?.startActivity(dialogIntent)
    }
}