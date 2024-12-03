/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;
import MODEL.Bus;
import MODEL.Route;
/**
 *
 * @author Naome
 */
public class AssignmentModel {
      private int assign_id;
    private Bus plate_nbr;
    private Route route_id;
    private int passengers;
   private Bus bus; // An instance of BusModel
   private Route route;
    

//    public AssignmentModel(int assign_id, Bus plate_nbr, Route route_id, int passengers) {
//        this.assign_id = assign_id;
//        this.plate_nbr = plate_nbr;
//        this.route_id = route_id;
//        this.passengers = passengers;
//    }
//
//    public AssignmentModel() {
//    }
//
//    public int getAssign_id() {
//        return assign_id;
//    }
//
//    public void setAssign_id(int assign_id) {
//        this.assign_id = assign_id;
//    }
//
//    public Bus getPlate_nbr() {
//        return plate_nbr;
//    }
//
//    public void setPlate_nbr(Bus plate_nbr) {
//        this.plate_nbr = plate_nbr;
//    }
//
//    public Route getRoute_id() {
//        return route_id;
//    }
//
//    public void setRoute_id(Route route_id) {
//        this.route_id = route_id;
//    }
//
//    public int getPassengers() {
//        return passengers;
//    }
//
//    public void setPassengers(int passengers) {
//        this.passengers = passengers;
//    }

//    

    public AssignmentModel() {
    }

    public AssignmentModel(int assign_id, Bus plate_nbr, Route route_id, int passengers, Bus bus, Route route) {
        this.assign_id = assign_id;
        this.plate_nbr = plate_nbr;
        this.route_id = route_id;
        this.passengers = passengers;
        this.bus = bus;
        this.route = route;
    }

    public int getAssign_id() {
        return assign_id;
    }

    public void setAssign_id(int assign_id) {
        this.assign_id = assign_id;
    }

    public Bus getPlate_nbr() {
        return plate_nbr;
    }

    public void setPlate_nbr(Bus plate_nbr) {
        this.plate_nbr = plate_nbr;
    }

    public Route getRoute_id() {
        return route_id;
    }

    public void setRoute_id(Route route_id) {
        this.route_id = route_id;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

}
