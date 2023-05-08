package Explorers;

import Planets.*;

public class RobotExplorer implements Explorer {
    @Override
    public void visit(Earth earth) {
        System.out.println("Robot landed on Earth... robot on a mission to find life!");
    }

    @Override
    public void visit(Jupiter jupiter) {
        System.out.println("Robot landed on Jupiter... robot on a mission to find life!");
    }

    @Override
    public void visit(Mars mars ) {
        System.out.println("Robot landed on Mars... robot on a mission to find life!");
    }

    @Override
    public void visit(Mercury mercury) {
        System.out.println("Robot landed on Mercury... robot on a mission to find life!");
    }

    @Override
    public void visit(Neptune neptune) {
        System.out.println("Robot landed on Neptune... robot on a mission to find life!");
    }

    @Override
    public void visit(Saturn saturn) {
        System.out.println("Robot landed on Saturn... robot on a mission to find life!");
    }

    @Override
    public void visit(Uranus uranus) {
        System.out.println("Robot landed on Uranus... robot on a mission to find life!");
    }

    @Override
    public void visit(Venus venus) {
        System.out.println("Robot landed on Venus... robot on a mission to find life!");
    }  
}