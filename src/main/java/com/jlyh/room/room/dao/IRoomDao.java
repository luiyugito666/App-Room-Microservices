package com.jlyh.room.room.dao;

import com.jlyh.room.room.model.Room;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IRoomDao extends CrudRepository<Room,Long> {
    //se puede agregar nuevos metodos con findBy, agregando el nombre del campo definido en el modelo o clase
    public List<Room> findByHotelId(Long hotelId);
}
