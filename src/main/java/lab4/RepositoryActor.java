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
    private void storeResult(TestResult m) {
        int id = m.getPackageId();
        String result = m.getResult();
        if (!repository.containsKey(id)) {
            initializeId(id);
        }
        repository.get(id).add(result);
    }
    @Override
    public Receive createReceive() {
        return ReceiveBuilder.create()
                .match(TestResult.class, this::storeResult)
                .match(PackageResultsRequest.class, this::getPackageResults)
                .build();
}