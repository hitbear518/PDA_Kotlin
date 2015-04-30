package com.zsxj.pda_kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.KeyEvent
import android.view.inputmethod.EditorInfo
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.activity_login.password_edit
import kotlinx.android.synthetic.activity_login.sid_edit
import kotlinx.android.synthetic.activity_login.username_edit
import kotlinx.android.synthetic.tool_bar.toolbar
import org.jetbrains.anko.*

public class LoginActivity : AppCompatActivity() {

    val sidEdit = find<EditText>(R.id.sid_edit)

    override fun onCreate(savedInstanceState: Bundle?) {
        super<AppCompatActivity>.onCreate(savedInstanceState)
        gridLayout {

        }
    }

    private fun restoreFromPrefs() {

    }

    private fun editorActionNext(v: TextView, actionId: Int, event: KeyEvent): Boolean {
        if (actionId == EditorInfo.IME_NULL && event.getAction() == KeyEvent.ACTION_UP) {
            v.onEditorAction(EditorInfo.IME_ACTION_NEXT)
        }
        return true
    }
}
