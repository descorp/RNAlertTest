package com.testrn74.my_module
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AlertDialog

class AlertDialogActivity: Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        displayAlert()
    }

    private fun displayAlert() {
        val builder = AlertDialog.Builder(this)
        val message = intent.getStringExtra("message")
        val title = intent.getStringExtra("title")
        builder
            .setTitle(title)
            .setMessage(message)
            .setPositiveButton("Ok") { _, _ ->
                finish()
            }

        val alert = builder.create()
        alert.setCancelable(false)
        alert.show()
    }
}