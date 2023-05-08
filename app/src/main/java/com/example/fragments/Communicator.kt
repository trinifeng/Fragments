package com.example.fragments

import android.os.Bundle

interface Communicator {

    fun passTheData(passingText: String): Bundle

}