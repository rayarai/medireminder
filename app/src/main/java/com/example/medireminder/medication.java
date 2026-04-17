package com.example.medireminder;

public class Medication {

    private String id, name, dosage, time, status;

    public Medication() {}

    public Medication(String id, String name, String dosage, String time, String status) {
        this.id = id;
        this.name = name;
        this.dosage = dosage;
        this.time = time;
        this.status = status;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public String getDosage() { return dosage; }
    public String getTime() { return time; }
    public String getStatus() { return status; }

    public void setStatus(String status) { this.status = status; }
}