package lab4;

import akka.NotUsed;
import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.http.javadsl.ConnectHttp;
import akka.http.javadsl.Http;
import akka.http.javadsl.ServerBinding;
import akka.http.javadsl.marshallers.jackson.Jackson;
import akka.http.javadsl.model.HttpRequest;
import akka.http.javadsl.model.HttpResponse;
import akka.http.javadsl.server.AllDirectives;
import akka.http.javadsl.server.Route;
import akka.pattern.Patterns;
import akka.stream.ActorMaterializer;
import akka.stream.javadsl.Flow;
import scala.concurrent.Future;

import java.io.IOException;
import java.util.concurrent.CompletionStage;

public class App extends AllDirectives {
    public static final int PORT = 8080;
    public static final int TIMEOUT = 5000;
    private Route post(ActorRef routerActor) {
        return entity(Jackson.unmarshaller(Package.class),
                msg -> {
                    routerActor.tell(msg, ActorRef.noSender());
                    return complete("Test started!");
                }
        );

    private Route get(ActorRef routerActor) {

