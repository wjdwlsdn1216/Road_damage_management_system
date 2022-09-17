import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Hello {
    public static void main(String[] args)  {
    	System.out.println("Python Call");
        String[] command = new String[4];
        command[0] = "python";
        command[1] = "C:\\Users\\wjdwl\\Desktop\\Road_King\\test.py";
        command[2] = "10";
        command[3] = "20";
        try {
            // System.out.println(command[0]);
            execPython(command);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void execPython(String[] command) throws IOException, InterruptedException {
        System.out.println(command[0]);
        CommandLine commandLine = CommandLine.parse(command[0]);
        System.out.println(commandLine);
        for (int i = 1, n = command.length; i < n; i++) {
            System.out.println(command[i]);
            commandLine.addArgument(command[i]);
        }

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PumpStreamHandler pumpStreamHandler = new PumpStreamHandler(outputStream);
        DefaultExecutor executor = new DefaultExecutor();
        executor.setStreamHandler(pumpStreamHandler);
        int result = executor.execute(commandLine);
        System.out.println("result: " + result);
        System.out.println("output: " + outputStream.toString());

    }  
        
}