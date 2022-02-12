package com.raystatic.onboarding_prensentation.welcome

import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.raystatic.core.R
import com.raystatic.core.navigation.Route
import com.raystatic.core.util.UiEvent
import com.raystatic.core_ui.LocalSpacing
import com.raystatic.onboarding_prensentation.components.ActionButton
import com.raystatic.onboarding_prensentation.gender.GenderViewModel

@Composable
fun WelcomeScreen(
    onNavigate:(UiEvent.Navigate) -> Unit,
    vm:GenderViewModel = hiltViewModel()
) {

    val spacing = LocalSpacing.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(spacing.spaceMedium),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(id = R.string.welcome_text),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.h1
        )

        Spacer(modifier = Modifier.height(spacing.spaceMedium))
        ActionButton(
            text = stringResource(id = R.string.next),
            onClick = {
                onNavigate(UiEvent.Navigate(Route.AGE))
            },
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
    }
}