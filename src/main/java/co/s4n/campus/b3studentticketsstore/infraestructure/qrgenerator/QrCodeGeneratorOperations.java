package co.s4n.campus.b3studentticketsstore.infraestructure.qrgenerator;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;

@Client("qr-generator")
public interface QrCodeGeneratorOperations {

    @Get("/qr-generator/{text}")
    String generate(String text);
}
