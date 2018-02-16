package se.selborn.practice.dirwatch;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;

import static java.nio.file.StandardWatchEventKinds.*;

/**
 * Created by anders on 5/24/17.
 */
public class Watcher {

    File directoryToWatch=null;



    WatchService watchService ;

    public Watcher(File directoryToWatch) {

        this.directoryToWatch = directoryToWatch;

        try {

            watchService = FileSystems.getDefault().newWatchService();


        } catch (IOException e) {
            e.printStackTrace();
        }


        Path myPath = directoryToWatch.toPath();

        WatchKey key = null;
        try {
            key = myPath.register(watchService, ENTRY_CREATE, ENTRY_MODIFY, ENTRY_DELETE);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //WatchKey key;

        for (; ; ) {
            try {
                key = watchService.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
                return;
            }

            for (WatchEvent<?> event : key.pollEvents()){
                WatchEvent.Kind<?> kind = event.kind();

                if (kind == OVERFLOW){
                    continue;
                }

                WatchEvent<Path> ev = (WatchEvent<Path>)event;
                Path fileName = ev.context();

                System.out.println("New File: " + fileName.toString());

            }

            boolean valid = key.reset();
            if (!valid){
                break;
            }

        }






    }
}
