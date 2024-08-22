package com.example.myapplication

import android.util.Log
import androidx.lifecycle.ViewModel

private const val TAG = "QuizViewModel"

class QuizViewModel : ViewModel() {
    private var currentIdx = 0

    private val questionBank = listOf(
        Question(R.string.question_australia, true),
        Question(R.string.question_oceans, true),
        Question(R.string.question_mideast, false),
        Question(R.string.question_africa, false),
        Question(R.string.question_americas, true),
        Question(R.string.question_asia, true)
    )

    val currentQuestionAnswer
        get() = questionBank[currentIdx].answer

    val currentQuestionText
        get() = questionBank[currentIdx].textResId

    fun moveToNext() {
        currentIdx += 1
        currentIdx %= questionBank.size
    }
}
