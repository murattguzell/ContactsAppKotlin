package com.muratguzel.kisileruygulamas.util

import android.view.View
import androidx.navigation.NavDirections
import androidx.navigation.Navigation

fun Navigation.switch(view: View, fragmentId: Int){
    findNavController(view).navigate(fragmentId)
}
fun Navigation.switch(view: View, fragmentId: NavDirections){
    findNavController(view).navigate(fragmentId)
}