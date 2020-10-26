package states;

import context.DeliveryContext;

/**
 * Representa um estado de um pacote em um sistema de entregas
 */
public interface PackageState {

    public void updateState(DeliveryContext ctx);
}
