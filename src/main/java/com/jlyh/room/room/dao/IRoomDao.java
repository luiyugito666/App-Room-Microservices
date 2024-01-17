package com.jlyh.room.room.dao;

import com.jlyh.room.room.model.Room;
import org.springframework.data.repository.CrudRepository;

public interface IRoomDao extends CrudRepository<Room,Long> {
}
