package com.edwanjau11.trucker.authentication.components

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.edwanjau11.trucker.authentication.core.Constants.GOOGLE_BUTTON
import com.edwanjau11.trucker.authentication.core.Constants.SIGN_UP_BUTTON

@Composable
fun SignUpButton(){
    Button(onClick = { /*TODO*/ }) {
        Text(SIGN_UP_BUTTON)
    }
}

@Composable
fun GoogleButton(){
    Button(onClick = { /*TODO*/ }
    ) {
        Text(GOOGLE_BUTTON)
    }
}