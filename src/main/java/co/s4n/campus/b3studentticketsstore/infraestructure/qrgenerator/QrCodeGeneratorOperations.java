package co.s4n.campus.b3studentticketsstore.infraestructure.qrgenerator;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;

@Client("http://172.17.0.1:10001/qr-generator")
public interface QrCodeGeneratorOperations {

    @Get("/{text}")
    String generate(String text);
}
