package com.raystatic.multimodulecalorietracker.navigation

import androidx.navigation.NavController
import com.raystatic.core.util.UiEvent

fun NavController.navigate(event: UiEvent.Navigate){
    this.navigate(event.route)
}