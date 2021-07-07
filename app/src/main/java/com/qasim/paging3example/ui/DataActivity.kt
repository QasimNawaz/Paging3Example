package com.qasim.paging3example.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.qasim.paging3example.R
import com.qasim.paging3example.utils.extensions.replaceFragment
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_data.*

@AndroidEntryPoint
class DataActivity : AppCompatActivity() {

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data)
        val navHostFragment = nav_host_fragment as NavHostFragment
        val graphInflater = navHostFragment.navController.navInflater
        val navGraph = graphInflater.inflate(R.navigation.nav_graph)
        navController = navHostFragment.navController
        navGraph.startDestination =
            if (intent.getIntExtra("data", 0) == 1)
                R.id.paginationFragment
            else
                R.id.paginationRoomFragment
        navController.graph = navGraph
    }

    override fun onBackPressed() {
        if (!navController.popBackStack()) {
            // Call finish() on your Activity
            finish()
        }
    }
}