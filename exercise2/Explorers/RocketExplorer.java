package Explorers;

import Planets.*;

public class RocketExplorer implements Explorer {
    @Override
    public void visit(Earth earth) {
        System.out.println("Launching to Earth... Landed successfully!");
    }

    @Override
    public void visit(Jupiter jupiter) {
        System.out.println("Launching to Jupiter... Landed successfully!");
    }

    @Override
    public void visit(Mars mars ) {
        System.out.println("Launching to Mars... Landed successfully!");
    }

    @Override
    public void visit(Mercury mercury) {
        System.out.println("Launching to Mercury... Landed successfully!");
    }

    @Override
    public void visit(Neptune neptune) {
        System.out.println("Launching to Neptune... Landed successfully!");
    }

    @Override
    public void visit(Saturn saturn) {
        System.out.println("Launching to Saturn... Landed successfully!");
    }

    @Override
    public void visit(Uranus uranus) {
        System.out.println("Launching to Uranus... Landed successfully!");
    }

    @Override
    public void visit(Venus venus) {
        System.out.println("Launching to Venus... Landed successfully!");
    }  
}