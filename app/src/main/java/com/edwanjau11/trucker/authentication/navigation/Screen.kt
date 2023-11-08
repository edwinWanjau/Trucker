package com.edwanjau11.trucker.authentication.navigation

import com.edwanjau11.trucker.authentication.core.Constants.FORGOT_PASSWORD_SCREEN
import com.edwanjau11.trucker.authentication.core.Constants.LOGIN_SCREEN
import com.edwanjau11.trucker.authentication.core.Constants.PROFILE_SCREEN
import com.edwanjau11.trucker.authentication.core.Constants.SIGN_UP_SCREEN
import com.edwanjau11.trucker.authentication.core.Constants.VERIFY_EMAIL_SCREEN

sealed class Screen(val route: String){
    object SignUpScreen :Screen(SIGN_UP_SCREEN)
    object LoginScreen :Screen(LOGIN_SCREEN)
    object VerifyEmailScreen :Screen(VERIFY_EMAIL_SCREEN)
    object ProfileScreen :Screen(PROFILE_SCREEN)
    object ForgotPassScreen :Screen(FORGOT_PASSWORD_SCREEN)
}
