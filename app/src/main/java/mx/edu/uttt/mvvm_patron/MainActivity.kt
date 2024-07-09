package mx.edu.uttt.mvvm_patron

import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModel
import mx.edu.uttt.mvvm_patron.ui.theme.MvvM_PatronTheme
import mx.edu.uttt.mvvm_patron.viewModels.LoteriaViewModel
import mx.edu.uttt.mvvm_patron.views.LoteriaView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewModel: LoteriaViewModel by viewModels()

        setContent{
            MvvM_PatronTheme {
                Surface (
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ){
                    LoteriaView(viewModel = viewModel)
                }
            }
        }
    }
}
