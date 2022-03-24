package com.example.todolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.todolist.databinding.ActivityAddTodoBinding
import com.example.todolist.db.AppDatabase
import com.example.todolist.db.ToDoDao

class AddTodoActivity : AppCompatActivity() {

    lateinit var binding : ActivityAddTodoBinding
    lateinit var db : AppDatabase
    lateinit var todoDao : ToDoDao

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAddTodoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        db = AppDatabase.getInstance(this)!!
        todoDao = db.getTodoDao()

        binding.btnCompletion.setOnClickListener{
            insertTodo()
        }
    }

    private fun insertTodo(){
        val todoTitle = binding.edtTitle.text.toString()
        var todoImportance = binding.radioGroup.checkedRadioButtonId

        when(todoImportance){
            R.id.btn_high ->{
                todoImportance = 1
            }
            R.id.btn_middle ->{
                todoImportance = 2
            }
            R.id.btn_low ->{
                todoImportance = 3
            }
            else -> {
                todoImportance = -1
            }
        }
    }
}