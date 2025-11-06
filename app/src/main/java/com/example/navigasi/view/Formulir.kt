@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.navigasi.view

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun FormIsian(
    JenisK:List<String> = ListOf("Laki-Laki","Perempuan"),
    OnSubmitBtnClick: () -> Unit
){
    Scaffold (modifier = Modifier,
        {
            TopAppBar()
        })
}

@Composable
fun ListOf(x0: String, x1: String) {
    TODO("Not yet implemented")
}