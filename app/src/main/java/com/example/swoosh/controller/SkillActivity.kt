package com.example.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.swoosh.utilities.EXTRA_LEAGUE
import com.example.swoosh.R
import com.example.swoosh.utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : AppCompatActivity() {

    private var league = ""
    private var selectedSkill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)!!
    }

    fun onBeginnerClicked(view: View) {
        ballerSkillBtn.isChecked = false

        selectedSkill = "beginner"
    }

    fun onBallerClicked(view: View) {
        beginnerSkillBtn
    }

    fun onFinishClicked(view: View) {
        val finishActivity = Intent(this, FinishActivity::class.java).apply {
            putExtra(EXTRA_LEAGUE, league)
            putExtra(EXTRA_SKILL, selectedSkill)
        }
        startActivity(finishActivity)
    }
}
