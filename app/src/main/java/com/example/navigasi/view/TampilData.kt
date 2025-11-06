package com.example.navigasi.view

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import com.example.navigasi.R

@file: OptIn(ExpermentalMaterial3Api::class)

@Composable
fun TampilData(
    OnBackBtnClick:()-> Unit
){
    val items = listOf(
        Pair(stringResource(R.string.nama_lengkap),"Contoh Nama"),
        Pair(stringResource(R.string.jenis_kelamin),"Lainnya"),
        Pair(stringResource(R.string.alamat),"Yogyakarta")
    )