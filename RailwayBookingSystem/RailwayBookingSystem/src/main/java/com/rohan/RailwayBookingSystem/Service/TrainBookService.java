package com.rohan.RailwayBookingSystem.Service;

import com.rohan.RailwayBookingSystem.Model.TrainBook;

import java.util.List;

public interface TrainBookService {

    String bookticket(TrainBook book);

    List<TrainBook> showMyticket();

    String cancelTicket(Integer id);

}

