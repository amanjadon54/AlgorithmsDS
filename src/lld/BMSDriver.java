package lld;

import lld.model.Multiplex;

import java.util.List;

public class BMSDriver {

    MultiplexManager multiplexManager = new MultiplexManager();

    public void start(){}


    public List<Multiplex> fetchAllMultiplexes(String city){
        multiplexManager.getAllMultiplexes();


        return null;
    }

}
