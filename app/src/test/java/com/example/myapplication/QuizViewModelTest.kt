package com.example.myapplication

import androidx.lifecycle.SavedStateHandle
import org.junit.Assert.*
import org.junit.Test


class QuizViewModelTest {
    @Test
    fun providesExpectedQuestionText() {
        val handle = SavedStateHandle()
        val model = QuizViewModel(handle)
        assertEquals(R.string.question_australia, model.currentQuestionText)
    }

    @Test
    fun wrapsAroundQuestionBank() {
        val handle = SavedStateHandle(mapOf(CURRENT_INDEX_KEY to 5))
        val model = QuizViewModel(handle)
        assertEquals(R.string.question_asia, model.currentQuestionText)
        model.moveToNext()
        assertEquals(R.string.question_australia, model.currentQuestionText)
    }
}
