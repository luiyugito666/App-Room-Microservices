package com.jlyh.room.room.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.jlyh.room.room.config.RoomServiceConfiguration;
import com.jlyh.room.room.model.PropertiesRoom;
import com.jlyh.room.room.model.Room;
import com.jlyh.room.room.service.IRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoomController {

    @Autowired
    private IRoomService roomService;

    @Autowired
    private RoomServiceConfiguration configRoom;




    @GetMapping("/rooms")
    public List<Room> getAllRoom(){
        return roomService.getAllRoom();
    }

    @GetMapping("/rooms/read/properties")
    public String getPropertiesRooms() throws JsonProcessingException {
        ObjectWriter owj = new ObjectMapper().writer().withDefaultPrettyPrinter();
        PropertiesRoom propertiesRoom = new PropertiesRoom(configRoom.getMsg(), configRoom.getBuildVersion(), configRoom.getMailDetails());
        String jsonString = owj.writeValueAsString(propertiesRoom);
        return jsonString;
    }

}
