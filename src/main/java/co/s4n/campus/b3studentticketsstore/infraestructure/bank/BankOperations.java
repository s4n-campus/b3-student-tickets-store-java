package co.s4n.campus.b3studentticketsstore.infraestructure.bank;

import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.client.annotation.Client;

@Client("http://172.17.0.1:10000/fake-bank")
public interface BankOperations {
    @Post()
    String pay(@Body PaymentRequest paymentRequest);
}
