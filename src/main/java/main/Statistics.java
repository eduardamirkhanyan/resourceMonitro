package main;

import com.avaldes.model.NetworkInterfaces;
import org.hyperic.sigar.FileSystem;

/**
 * Created by Eduard on 6/24/2017.
 */
public class Statistics {
    public static void main(String[] args) {
        JvmStatisticsUtility ooo = JvmStatisticsUtility.getInstance();

        for(FileSystem ff : ooo.getAllFileSystemList()){
            System.out.print("fs="+ff);
        }

            System.out.print("fs="+ooo.getAllNetInterfaces(true).getNetworkInterface().get(0));


    }
}
