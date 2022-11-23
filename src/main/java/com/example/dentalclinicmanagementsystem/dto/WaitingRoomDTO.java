package com.example.dentalclinicmanagementsystem.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class WaitingRoomDTO {

    private Long waitingRoomId;

    private Long patientId;

    private LocalDate date;

    private String status;

    private Boolean isBooked;

    private String patientName;

    public WaitingRoomDTO(Long waitingRoomId, Long patientId, LocalDate date, String patientName) {
        this.waitingRoomId = waitingRoomId;
        this.patientId = patientId;
        this.date = date;
        this.patientName = patientName;
    }
}
