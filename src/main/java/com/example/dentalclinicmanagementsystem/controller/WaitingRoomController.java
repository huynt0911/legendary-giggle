package com.example.dentalclinicmanagementsystem.controller;

import com.example.dentalclinicmanagementsystem.dto.WaitingRoomDTO;
import com.example.dentalclinicmanagementsystem.entity.Patient;
import com.example.dentalclinicmanagementsystem.service.WaitingRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("api/waiting_room")
public class WaitingRoomController {

    @Autowired
    private WaitingRoomService waitingRoomService;

//    @Autowired
//    private KafkaTemplate<String, String> kafkaTemplate;

    @PostMapping("call-patient/{id}")
    public ResponseEntity<Void> callPatient(@PathVariable Long id) {
        waitingRoomService.callPatient(id);
//        kafkaTemplate.send("waiting-room1", id.toString());
        return ResponseEntity.ok().build();
    }

    @GetMapping("get-list-waiting")
    public ResponseEntity<Page<WaitingRoomDTO>> getListWaitingRoom(@RequestParam(required = false, defaultValue = "") String patientName,
                                                                   @RequestParam(required = false)LocalDate date,
                                                                   Pageable pageable) {

        return  ResponseEntity.ok().body(waitingRoomService.getListWaitingRoom(patientName,date, pageable));
    }

    @PostMapping("confirm-customer/{id}")
    public ResponseEntity<Void> confirmCustomer(@PathVariable Long id,
                                                @RequestParam Boolean isAttend) {

        waitingRoomService.confirmCustomer(id, isAttend);
        return ResponseEntity.ok().build();
    }

    @PostMapping("")
    public void addPatientToWaitingRoom(@RequestBody Patient patient) {

    }

    @GetMapping("get_list_confirm")
    public ResponseEntity<List<WaitingRoomDTO>> getListConfirm() {
        return ResponseEntity.ok().body(waitingRoomService.getListConfirm());
    }

}
