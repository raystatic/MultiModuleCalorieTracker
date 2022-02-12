package com.raystatic.onboarding_prensentation.gender

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.raystatic.core.domain.models.Gender
import com.raystatic.core.domain.preferences.Preferences
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class GenderViewModel @Inject constructor(
    private val preferences: Preferences
): ViewModel(){

    var selectedGender by mutableStateOf<Gender>(Gender.Male)
        private set
}