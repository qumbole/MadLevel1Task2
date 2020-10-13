package com.example.madlevel1task2

import android.app.Activity
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.madlevel1task2.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root) // Sets the activity layout resource file.

        binding.btnSumbit.setOnClickListener{
            checkAnswers()
        }
    }
//function that checks the answers and shows the amount of right answers
fun checkAnswers(){
    //the values that the user put in
    val inputAnswer1 = binding.editText6.text.toString().trim();
    val inputanswer2= binding.editTextText9.text.toString().trim();
    val inputAnswer3= binding.editTextTextPersonName12.text.toString().trim();
    val inputAnswer4= binding.editTextTextPersonName5.text.toString().trim();

    //array with the correct answers
    val correctAnswers= arrayOf("T", "F", "F","F");
    //array with all the answer from the user
    val inputAnswers= arrayOf(inputAnswer1,inputanswer2, inputAnswer3,inputAnswer4);

    //correct answers count
    var correctAnswersnumber = 0;
    for(i in 0..3){
       if (correctAnswers.elementAt(i).contentEquals(inputAnswers.elementAt(i))){
           correctAnswersnumber++;
       }}

    //text that show the right amount of good answers
    Toast.makeText(this, getString(R.string.Correct)+ correctAnswersnumber, Toast.LENGTH_LONG).show()
}
    }

