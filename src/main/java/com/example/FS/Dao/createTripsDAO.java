package com.example.FS.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.FS.Controller.Entities.createATrip;

public interface createTripsDAO extends JpaRepository<createATrip, Long> {

}

