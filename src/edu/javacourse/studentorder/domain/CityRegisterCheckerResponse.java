package edu.javacourse.studentorder.domain;

public class CityRegisterCheckerResponse {
    private boolean existing;       //сущуствует ли человек в системе
    private Boolean temporal;       //прописан или не прописан человек, или ..

    public boolean isExisting() {
        return existing;
    }

    public void setExisting(boolean existing) {
        this.existing = existing;
    }

    public Boolean getTemporal() {
        return temporal;
    }

    public void setTemporal(Boolean temporal) {
        this.temporal = temporal;
    }
}
