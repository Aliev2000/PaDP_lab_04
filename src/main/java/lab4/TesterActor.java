package lab4;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;
import akka.japi.pf.ReceiveBuilder;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;


public class TesterActor extends AbstractActor {
    public void sendToRepository(int packageId, String result) {
        repository.tell(new TestResult(packageId, result), ActorRef.noSender());

    public void testRun(TestRequest request) {

