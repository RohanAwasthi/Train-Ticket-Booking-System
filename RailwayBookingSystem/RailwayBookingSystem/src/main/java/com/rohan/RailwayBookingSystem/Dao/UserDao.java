package com.rohan.RailwayBookingSystem.Dao;

import com.rohan.RailwayBookingSystem.Model.TrainBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<TrainBook,Integer> {
}
