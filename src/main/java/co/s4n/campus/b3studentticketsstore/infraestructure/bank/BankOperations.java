package co.s4n.campus.b3studentticketsstore.infraestructure.bank;

import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.client.annotation.Client;

@Client("bank")
public interface BankOperations {
    @Post("/fake-bank")
    String pay(@Body PaymentRequest paymentRequest);
}
