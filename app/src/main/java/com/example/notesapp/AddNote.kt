package com.example.notesapp

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.notesapp.Models.Note
import com.example.notesapp.databinding.ActivityAddNoteBinding
import com.example.notesapp.databinding.ActivityMainBinding
import java.text.SimpleDateFormat
import java.util.Date

class AddNote : AppCompatActivity() {

    private lateinit var binding: ActivityAddNoteBinding
    private lateinit var oldNote: Note
    private lateinit var note : Note
    var isUpdate = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAddNoteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        try {

            oldNote = intent.getSerializableExtra("current_note") as Note
            binding.etTitle.setText(oldNote.title)
            binding.etNote.setText(oldNote.note)
            isUpdate = true
        }catch (e : java.lang.Exception){

            e.printStackTrace()
        }

        binding.imgCheck.setOnClickListener{

            val title = binding.etTitle.text.toString()
            val noteDesc = binding.etNote.text.toString()


            if(title.isNotEmpty() || noteDesc.isNotEmpty()){

                val formatter = SimpleDateFormat("EEE, d MMM yyyy HH:mm a")

                if(isUpdate){

                    note = Note(
                        oldNote.id,title,noteDesc,formatter.format(Date())
                    )
                }else {

                    note = Note(
                        null, title,noteDesc,formatter.format(Date())
                    )
                }

                val intent = Intent()
                intent.putExtra("note",note)
                setResult(Activity.RESULT_OK,intent)
                finish()
            }else{

                Toast.makeText(this,"Por favor insira a data", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
        }

        binding.imgBackArrow.setOnClickListener{

            onBackPressed()
        }

    }
}