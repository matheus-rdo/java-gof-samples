import context.DeliveryContext;

/**
 * O State é um design pattern usado quando o comportamento de um objeto muda dependendo do seu estado.
 * Através desse design pattern, é possível desacoplar os comportamentos específicos de bloco de código único, cheio de if else
 */
public class StateClient {

    public static void main(String[] args) {
        DeliveryContext ctx = new DeliveryContext(null, "Test123");

        ctx.update(); // Acknowledged
        ctx.update(); // Shipped
        ctx.update(); // In Transition
        ctx.update(); // Out for delivery
        ctx.update(); // Delivered
    }
}
