package com.entity;

import java.util.Objects;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author harini.muthukrishnan
 */
@ManagedBean(name="studententity")
@SessionScoped
public class StudentEntity
{
    private int stdId;
    private String stdName;
    private String stdLocation;
   
    public StudentEntity() {
    }
  
    public int getStdId() {
        return stdId;
    }

    public void setStdId(int stdId) {
        this.stdId = stdId;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public String getStdLocation() {
        return stdLocation;
    }

    public void setStdLocation(String stdLocation) {
        this.stdLocation = stdLocation;
    }

    public StudentEntity(int stdId, String stdName, String stdLocation) {
        this.stdId = stdId;
        this.stdName = stdName;
        this.stdLocation = stdLocation;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.stdId;
        hash = 89 * hash + Objects.hashCode(this.stdName);
        hash = 89 * hash + Objects.hashCode(this.stdLocation);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final StudentEntity other = (StudentEntity) obj;
        if (this.stdId != other.stdId) {
            return false;
        }
        if (!Objects.equals(this.stdName, other.stdName)) {
            return false;
        }
        if (!Objects.equals(this.stdLocation, other.stdLocation)) {
            return false;
        }
        return true;
    }
}
