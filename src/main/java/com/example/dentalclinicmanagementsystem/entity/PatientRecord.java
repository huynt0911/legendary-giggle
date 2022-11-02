package com.example.dentalclinicmanagementsystem.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "patient_records")
public class PatientRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "patient_record_id")
    private Long patientRecordId;

    @Column(name = "reason")
    private String reason;

    @Column(name = "diagnostic")
    private String diagnostic;

    @Column(name = "causal")
    private String causal;

    @Column(name = "date")
    private LocalDate date;

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

    @Column(name = "cost_incurred")
    private Integer costIncurred;

    @Column(name = "note")
    private String note;

    @Column(name = "patient_id")
    private Long patientId;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "prescription")
    private String prescription;

    @Column(name = "pre_record_id")
    private Long preRecordId;

}
