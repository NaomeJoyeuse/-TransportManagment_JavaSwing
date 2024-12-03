/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

/**
 *
 * @author Naome
 */
public class Bus {
    private String plate_nbr;
    private String bus_name;
    private String  driver;
    private String bus_company;
    private int nbr_passengers;

    public Bus() {
    }
@Override
public String toString() {
    return plate_nbr;
}

    public Bus(String plate_nbr, String bus_name, String driver, String bus_company, int nbr_passengers) {
        this.plate_nbr = plate_nbr;
        this.bus_name = bus_name;
        this.driver = driver;
        this.bus_company = bus_company;
        this.nbr_passengers = nbr_passengers;
    }

    public String getPlate_nbr() {
        return plate_nbr;
    }

    public void setPlate_nbr(String plate_nbr) {
        this.plate_nbr = plate_nbr;
    }

    public String getBus_name() {
        return bus_name;
    }

    public void setBus_name(String bus_name) {
        this.bus_name = bus_name;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getBus_company() {
        return bus_company;
    }

    public void setBus_company(String bus_company) {
        this.bus_company = bus_company;
    }

    public int getNbr_passengers() {
        return nbr_passengers;
    }

    public void setNbr_passengers(int nbr_passengers) {
        this.nbr_passengers = nbr_passengers;
    }

    
}
