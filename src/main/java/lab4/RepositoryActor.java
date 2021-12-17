package lab4;

import akka.actor.AbstractActor;
import akka.japi.pf.ReceiveBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RepositoryActor extends AbstractActor {
    private final Map<Integer, ArrayList<String>> repository = new HashMap<>();

    private void initializeId(int id) {
        ArrayList<String> resultArray = new ArrayList<>();
    }
