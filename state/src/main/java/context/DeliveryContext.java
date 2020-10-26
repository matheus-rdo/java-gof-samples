package context;

import states.Acknowledged;
import states.PackageState;

/**
 * Define um contexto de interface para o cliente interagir.
 * Responsável por manter as referências do estado concreto e delegar os comportamentos específicos para os diferentes State objects
 */
public class DeliveryContext {

    private PackageState currentState;
    private String packageId;

    public DeliveryContext(PackageState currentState, String packageId) {
        super();
        this.currentState = currentState == null ? Acknowledged.instance() : currentState;
        this.packageId = packageId;
    }

    public PackageState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(PackageState currentState) {
        this.currentState = currentState;
    }

    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    public void update() {
        currentState.updateState(this);
    }
}
