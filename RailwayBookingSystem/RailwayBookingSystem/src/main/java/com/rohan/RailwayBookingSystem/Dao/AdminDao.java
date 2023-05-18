package com.rohan.RailwayBookingSystem.Dao;

import com.rohan.RailwayBookingSystem.Model.TrainDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminDao extends JpaRepository<TrainDetails,Integer> {
}
