package com.example.mydentist;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface TeethDao {
    @Insert

    void setInsertTeeth(Teeth teeth);


    @Update
        // 수정
    void setUpdateTeeth(Teeth teeth);

    @Delete
        //삭제
    void setDeleteTeeth(Teeth teeth);

    @Query("SELECT * FROM Teeth")
    List<Teeth> getUserAll();


}
