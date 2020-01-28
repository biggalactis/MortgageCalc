package Testing;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Main {

    public static void main(String[] args){
        System.out.println("Start");
        printNumbers(4);
        System.out.println("finish");
    }

    private static void printNumbers(int limit) {
        for (int i = 0; i <= limit; i ++)
            System.out.println(i);
    }


}
