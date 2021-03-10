package com.controller;

import com.entity.StudentEntity;
import java.util.*;
import javax.faces.bean.*;

/**
 *
 * @author harini.muthukrishnan
 */
@ManagedBean(name="studentCtrl")
@SessionScoped
public class StudentController {
    
    private StudentEntity std=new StudentEntity();
    Set<StudentEntity> list;

    public StudentEntity getStd() {
        return std;
    }

    public StudentController() {
         list=new LinkedHashSet<>();
    }

    public void setStd(StudentEntity std) {
        this.std = std;
    }

     public Set<StudentEntity> displayAll() {
        if(std.getStdId()!=0)
            list.add(new StudentEntity(std.getStdId(), std.getStdName(),std.getStdLocation()));
        return list;
    }
}
