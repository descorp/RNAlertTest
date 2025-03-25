package com.testrn74.my_module
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.ProgressBar
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
            .setView(ProgressBar(this))
            .setTitle(title)
            .setMessage(message)
            .setPositiveButton("Dismiss") { _, _ ->
                finish()
            }

        val alert = builder.create()
        alert.setCancelable(false)
        alert.show()
    }
}