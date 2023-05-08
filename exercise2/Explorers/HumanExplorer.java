package Explorers;

import Planets.*;

public class HumanExplorer implements Explorer {

    @Override
    public void visit(Earth earth) {
        System.out.println("Landed on Earth... exploring life");
    }

    @Override
    public void visit(Jupiter jupiter) {
        System.out.println("Landed on Jupiter... exploring life");
    }

    @Override
    public void visit(Mars mars ) {
        System.out.println("Landed on Mars... exploring life");
    }

    @Override
    public void visit(Mercury mercury) {
        System.out.println("Landed on Mercury... exploring life");
    }

    @Override
    public void visit(Neptune neptune) {
        System.out.println("Landed on Neptune... exploring life");
    }

    @Override
    public void visit(Saturn saturn) {
        System.out.println("Landed on Saturn... exploring life");
    }

    @Override
    public void visit(Uranus uranus) {
        System.out.println("Landed on Uranus... exploring life");
    }

    @Override
    public void visit(Venus venus) {
        System.out.println("Landed on Venus... exploring life");
    }  
}