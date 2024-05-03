package com.example.testmessagemod

import android.content.Context
import android.widget.Toast

class MyCls {
    companion object{
        fun showMSDMessage(context: Context, message: String) {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
        }
    }
}