package person.zhiyong.memoryout;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MemoryOutApplication {

	public static void main(String[] args) throws Exception {
		DirectMemoryOut heapMemoryOut = new DirectMemoryOut();
		heapMemoryOut.run();
	}

}
