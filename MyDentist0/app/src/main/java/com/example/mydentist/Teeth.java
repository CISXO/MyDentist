package com.example.mydentist;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Teeth {
@PrimaryKey(autoGenerate = true)
private int id = 0;
    private String teeth1;
    private String teeth2;
    private String teeth3;
    private String teeth4;
    private String teeth5;
    private String teeth6;
    private String teeth7;
    private String teeth8;
    private String locate;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getTeeth1() {
        return teeth1;
    }

    public void setTeeth1(String teeth1) {
        this.teeth1 = teeth1;
    }

    public String getTeeth2() {
        return teeth2;
    }

    public void setTeeth2(String teeth2) {
        this.teeth2 = teeth2;
    }

    public String getTeeth3() {
        return teeth3;
    }

    public void setTeeth3(String teeth3) {
        this.teeth3 = teeth3;
    }

    public String getTeeth4() {
        return teeth4;
    }

    public void setTeeth4(String teeth4) {
        this.teeth4 = teeth4;
    }

    public String getTeeth5() {
        return teeth5;
    }

    public void setTeeth5(String teeth5) {
        this.teeth5 = teeth5;
    }

    public String getTeeth6() {
        return teeth6;
    }

    public void setTeeth6(String teeth6) {
        this.teeth6 = teeth6;
    }

    public String getTeeth7() {
        return teeth7;
    }

    public void setTeeth7(String teeth7) {
        this.teeth7 = teeth7;
    }

    public String getTeeth8() {
        return teeth8;
    }

    public void setTeeth8(String teeth8) {
        this.teeth8 = teeth8;
    }

    public String getLocate() {
        return locate;
    }

    public void setLocate(String locate) {
        this.locate = locate;
    }

}
