package com.example.dentalclinicmanagementsystem.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "patient_records")
public class PatientRecords {
    @Id
    @Column(name = "patient_record_id")
    private Long patientRecordId;

    @Column(name = "reason")
    private String reason;

    @Column(name = "diagnostic")
    private String diagnostic;

    @Column(name = "causal")
    private String causal;

    @Column(name = "date")
    private java.sql.Date date;

    @Column(name = "treatment")
    private String treatment;

    @Column(name = "total_cost")
    private Integer totalCost;

    @Column(name = "real_cost")
    private Integer realCost;

    @Column(name = "marrow_record")
    private String marrowRecord;

    @Column(name = "debit")
    private Integer debit;

    @Column(name = "note")
    private String note;

    @Column(name = "patient_id")
    private String patientId;

    @Column(name = "specimen_id")
    private Long specimenId;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "service_id")
    private Long serviceId;

    @Column(name = "prescription")
    private String prescription;

}
