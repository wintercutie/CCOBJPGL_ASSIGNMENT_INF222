package Explorers;

import Planets.Mars;
import Planets.Planet;
import Planets.Mercury;
import Planets.Saturn;
import Planets.Jupiter;
import Planets.Pluto;
import Planets.Earth;
import Planets.Neptune;
import Planets.Uranus;
import Planets.Venus;


public interface Explorer {

    void visit(Mercury mercury);

    void visit(Mars mars);

    void visit(Saturn saturn);

    void visit(Jupiter jupiter);

    void visit(Pluto pluto);

    void visit(Earth earth);

    void visit(Neptune neptune);

    void visit(Uranus uranus);

    void visit(Venus venus);


    default void visit(Planet planet) {
        System.out.println("Landed on an unknown planet...");
    }
}