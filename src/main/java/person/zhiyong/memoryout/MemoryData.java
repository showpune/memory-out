package person.zhiyong.memoryout;

public class MemoryData {

    private String value;

    public MemoryData(String value){
        for(int i=0;i<100;i++) {
            this.value += value;
        }
    }
}
