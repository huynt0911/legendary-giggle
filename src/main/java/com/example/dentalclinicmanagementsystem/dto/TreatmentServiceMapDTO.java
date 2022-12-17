package com.example.dentalclinicmanagementsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TreatmentServiceMapDTO {

    private Long treatmentServiceMapId;

    private Long treatmentId;

    private Long serviceId;

    private Integer currentPrice;

    private Integer discount;

    private Long startRecordId;

    private String serviceName;

    public TreatmentServiceMapDTO(Long treatmentId, Long serviceId, Integer currentPrice, Integer discount, String serviceName) {
        this.treatmentId = treatmentId;
        this.serviceId = serviceId;
        this.currentPrice = currentPrice;
        this.discount = discount;
        this.serviceName = serviceName;
    }
}
