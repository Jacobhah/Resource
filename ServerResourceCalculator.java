import java.util.Scanner;

public class ServerResourceCalculator {
    private int totalMemory;
    private int usedMemory;
    private int totalCPU;
    private int usedCPU;

    public ServerResourceCalculator(int totalMemory, int usedMemory, int totalCPU, int usedCPU) {
        this.totalMemory = totalMemory;
        this.usedMemory = usedMemory;
        this.totalCPU = totalCPU;
        this.usedCPU = usedCPU;
    }

    public int getRemainingMemory() {
        return totalMemory - usedMemory;
    }

    public int getRemainingCPU() {
        return totalCPU - usedCPU;
    }

    public static void main(String[] args) {
        // Server total memory is 16GB, used memory is 4GB
        int totalMemory = 16;
        int usedMemory = 4;

        // The total number of CPU cores of the server is 8, and the number of used CPU cores is 2
        int totalCPU = 8;
        int usedCPU = 2;

        ServerResourceCalculator calculator = new ServerResourceCalculator(totalMemory, usedMemory, totalCPU, usedCPU);

        int remainingMemory = calculator.getRemainingMemory();
        int remainingCPU = calculator.getRemainingCPU();

        System.out.println("Remaining memory：" + remainingMemory + "GB");
        System.out.println("Number of remaining CPU cores：" + remainingCPU);
    }
}
