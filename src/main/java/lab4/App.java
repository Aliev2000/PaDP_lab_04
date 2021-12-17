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
    public static final String HOST = "localhost";
    public static final int PORT = 8080;
    public static final int TIMEOUT = 5000;
    public static final String START_MSG = String.format(

    public static void main(String[] args) throws IOException {
        ActorSystem system = ActorSystem.create("routes");
        final Http http = Http.get(system);
        final ActorMaterializer materializer = ActorMaterializer.create(system);
        App instance = new App();
        final Flow<HttpRequest, HttpResponse, NotUsed> routeFlow;
        routeFlow = instance.createRoute(system).flow(system, materializer);
        final CompletionStage<ServerBinding> binding = http.bindAndHandle(
                routeFlow,
                ConnectHttp.toHost(HOST, PORT),
                materializer
        System.out.println(START_MSG);
    }

    private Route createRoute(ActorSystem system) {
        ActorRef routerActor = system.actorOf(Props.create(RouterActor.class));
        return route(post(routerActor),
                    get(routerActor)
        );

    private Route post(ActorRef routerActor) {
        return entity(Jackson.unmarshaller(Package.class),
                msg -> {
                    routerActor.tell(msg, ActorRef.noSender());
                    return complete("Test started!");
                }
        );

    private Route get(ActorRef routerActor) {
        return parameter("packageId", packageID -> {
                Future<Object> result = Patterns.ask(routerActor,
                new PackageResultsRequest(Integer.parseInt(packageID)),
                        TIMEOUT);
                return completeOKWithFuture(result, Jackson.marshaller());
        });
    }
}

