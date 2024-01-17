package com.jlyh.room.room.service;

import com.jlyh.room.room.dao.IRoomDao;
import com.jlyh.room.room.model.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoomServiceImpl implements IRoomService{
    @Autowired
    private IRoomDao serviceDao;
    @Override
    public List<Room> getAllRoom() {

        return (List<Room>) serviceDao.findAll();
    }

    @Override
    public List<Room> getRoomByHotelId(Long hotelId) {
        List<Room> rooms=serviceDao.findByHotelId(hotelId);
        return rooms;
    }


}
