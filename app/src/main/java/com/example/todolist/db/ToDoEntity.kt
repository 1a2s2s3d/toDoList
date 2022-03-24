package com.example.todolist.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity //어떤 구성요소인지 알려주려면 어노테이션을 써줘야함
//@를 이용해 프로그램에 추가정보를 제공하는 방법. 이를 통해 컴파일러가 특정 오류를 억제하거나 실행 시 특정 행동을 하게 됨
data class ToDoEntity (
    @PrimaryKey(autoGenerate = true) val id : Int? = null,
    @ColumnInfo(name = "title") val title : String,
    @ColumnInfo(name = "importance") val importance : Int
)