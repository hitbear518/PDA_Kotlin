package com.zsxj.pda_kotlin

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.ActionBarActivity

import kotlinx.android.synthetic.activity_login.*
import kotlinx.android.synthetic.tool_bar.*

public class LoginActivity : ActionBarActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        setSupportActionBar(toolbar)
    }
}
