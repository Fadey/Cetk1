package testTasks;

import java.util.Scanner;

/**
 * Created by artem on 22.01.17.
 */

public class IPClass {
    public static void main(String argv[]) {
        final int MAX_IP = 255;
        System.out.print("Enter first IP: ");
        Scanner sc = new Scanner(System.in);
        String firstIp = sc.nextLine();
        System.out.print("Enter second IP: ");
        String secondIp = sc.nextLine();
        boolean isI4 = true;
        String[] fisrtipPart = firstIp.split("\\.");
        String[] secondipPart = secondIp.split("\\.");
        try{
            if( Integer.parseInt(fisrtipPart[0]) > Integer.parseInt(secondipPart[0])
                    || (Integer.parseInt(fisrtipPart[1]) > Integer.parseInt(secondipPart[1])
                    && Integer.parseInt(fisrtipPart[2]) > Integer.parseInt(secondipPart[2])
                    && Integer.parseInt(fisrtipPart[3]) > Integer.parseInt(secondipPart[3]))
                    ){
                Exception se = new Exception("First IP is bigger than second. Replace it.");
                throw se;
            }

        } catch (Exception e){
            System.out.println("Error:" + e.getMessage());
        };
        exitlabel:
        for (int i1 = Integer.parseInt(fisrtipPart[0]); i1 <= Integer.parseInt(secondipPart[0]); i1++) {
            for (int i2 = 0; i2 <= MAX_IP; i2++) {
                for (int i3 = 0; i3 <= MAX_IP; i3++) {
                    for (int i4 = 0; i4 <= MAX_IP; i4++) {
                        if(isI4 == true){
                            isI4 = false;
                            i4 = Integer.parseInt(fisrtipPart[3]) + 1;
                            i3 = Integer.parseInt(fisrtipPart[2]);
                            i2 = Integer.parseInt(fisrtipPart[1]);
                        }
                        if ((i1 == Integer.parseInt(secondipPart[0]) && i2 == Integer.parseInt(secondipPart[1]) && i3 == Integer.parseInt(secondipPart[2]) && ( i4 == (Integer.parseInt(secondipPart[3])) || Integer.parseInt(secondipPart[3]) == Integer.parseInt(fisrtipPart[3])) )
                                ){
                            break exitlabel;
                        }
                        System.out.println(i1 + "." + i2 + "." + i3 + "." + i4);
                    }
                }
            }
        }
    }

}

