package android.deepdive.ksp.sample

import android.deepdive.ksp.sample.repository.ExampleRepository
import android.deepdive.ksp.sample.repository.ExampleRepositoryImpl
import android.deepdive.ksp.sample.repository.IExampleRepository
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private val repository: IExampleRepository = ExampleRepositoryImpl(ExampleRepository())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.resultTextView).text = repository.getData(1, 2).toString()

    }


}
