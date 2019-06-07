public class Variable {
    public static void main(String[] args) {
        int hdd = 250;
        byte cpu = 1;
        short cpu_core = 2;
        long hdd_kbyte = 262144000;
        float cpu_hz = 2.30f;
        double memory = 3.4d;
        char logical_disk = 'C';
        boolean b = true;
        System.out.println("My comp has next params:\nHDD in Kb: " + hdd_kbyte
        + "\nHDD in Gb: " + hdd
        + "\nCPU socket: " + cpu
        + "\nCPU core: " + cpu_core
        + "\nCPU GHz: " + cpu_hz
        + "\nRAM Gb: " + memory
        + "\nLogical disk: " + logical_disk
        + "\nIs it norm: " + b);
    }
}
