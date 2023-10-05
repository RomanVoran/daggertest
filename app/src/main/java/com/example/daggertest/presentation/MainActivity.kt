package com.example.daggertest.presentation

import android.Manifest
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.viewModels
import com.appsgeyser.sdk.AppsgeyserSDK
import com.example.daggertest.App
import com.example.daggertest.data.NetworkRepo
import com.example.daggertest.R
import com.example.daggertest.data.DbRepo
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var db: DbRepo

    @Inject
    lateinit var network: NetworkRepo

    lateinit var viewModel: MainViewModel
    val viewModel2: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        (application as App).appComponent.injectToMainActivity(this)
        db.getMessage()
        network.getMessage()


        val p1:Boolean? = true
        val p2:Boolean? = null

        val ss = p1?:false && p2?:false

        Log.d("TEST_TAG","ss = $ss")

        Log.d(
            "TEST_TAG",
            "should show${shouldShowRequestPermissionRationale(Manifest.permission.POST_NOTIFICATIONS)}"
        )


        AppsgeyserSDK.takeOff(this, "123", "12312", "1231")

// test new branch
        val storagePermission = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU)
            arrayOf(
                Manifest.permission.READ_MEDIA_VIDEO,
                Manifest.permission.READ_MEDIA_AUDIO,
                Manifest.permission.READ_MEDIA_IMAGES
            )
        else {
            arrayOf(Manifest.permission.READ_EXTERNAL_STORAGE)
        }

//        permLauncher.launch(storagePermission)

        val sss = arrayOf(Manifest.permission.WRITE_EXTERNAL_STORAGE)
        requestPermissions(sss,12)


    }


    private val permLauncher = registerForActivityResult(
        ActivityResultContracts.RequestMultiplePermissions()
    ) { isGranted ->
        Log.d("TEST_TAG", Manifest.permission.READ_MEDIA_AUDIO)
        Log.d("TEST_TAG", Manifest.permission.READ_MEDIA_VIDEO)
        Log.d("TEST_TAG", Manifest.permission.READ_MEDIA_IMAGES)
        Log.d("TEST_TAG", Manifest.permission.READ_EXTERNAL_STORAGE)
        Log.d("TEST_TAG", "isGranted:")
        isGranted.forEach { key, value ->
            Log.d("TEST_TAG", "key:$key , value:$value")
        }
    }


    override fun onResume() {
        super.onResume()
        AppsgeyserSDK.onResume(this)
    }

}