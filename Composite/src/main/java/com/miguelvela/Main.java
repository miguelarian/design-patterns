package com.miguelvela;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Task weeding = new SimpleTask("Weeding");
        Task watering = new SimpleTask("Watering");
        Task transplanting = new SimpleTask("Transplanting");
        Task fertilizing = new SimpleTask("Fertilizing");

        Task outdoorTasks = new CompositeTask("Garden maintenance", List.of(weeding, watering, transplanting, fertilizing));

        Task vacuuming = new SimpleTask("Vacuuming");
        Task dusting = new SimpleTask("Dusting");

        Task indoorTasks = new CompositeTask("Indoor house work", List.of(vacuuming, dusting));

        Task houseWork = new CompositeTask("House work", new ArrayList<>());
        ((CompositeTask) houseWork).addTask(indoorTasks);
        ((CompositeTask) houseWork).addTask(outdoorTasks);

        System.out.println("Weekend plan:");
        houseWork.display();

        System.out.println("Outdoor tasks:");
        ((CompositeTask) houseWork).removeTask(indoorTasks);
        houseWork.display();
    }
}