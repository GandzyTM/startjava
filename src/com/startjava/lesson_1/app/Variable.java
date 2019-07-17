package com.startjava.lesson_1.app;

public class Variable {
    public static void main(String[] args) {
        int hdd = 250;
        byte cpu = 1;
        short cpuCore = 2;
        long hddKbyte = 262144000;
        float cpuHz = 2.30f;
        double memory = 3.4d;
        char logicalDisk = 'C';
        boolean isPowerfull = true;
        
        System.out.println("My comp has next params:\nHDD in Kb: " + hddKbyte
        + "\nHDD in Gb: " + hdd
        + "\nCPU socket: " + cpu
        + "\nCPU core: " + cpuCore
        + "\nCPU GHz: " + cpuHz
        + "\nRAM Gb: " + memory
        + "\nLogical disk: " + logicalDisk
        + "\nIs it norm: " + isPowerfull);
    }
}
