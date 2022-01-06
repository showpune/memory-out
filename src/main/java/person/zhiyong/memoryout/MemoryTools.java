package person.zhiyong.memoryout;


public class MemoryTools{

    public static void printMemory(){
        Runtime runtime = Runtime.getRuntime();
        double freeMemory = (double)runtime.freeMemory()/(1024*1024);
        double totalMemory = (double)runtime.totalMemory()/(1024*1024);
        double usedMemory = totalMemory - freeMemory;
        
        System.out.println("Total Memory:"+totalMemory);
        System.out.println("Free Memory:"+freeMemory);
        System.out.println("Used Memory:"+usedMemory);

    }
}