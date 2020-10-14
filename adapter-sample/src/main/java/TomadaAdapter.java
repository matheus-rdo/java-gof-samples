import libraries.TomadaDeDoisPinos;
import libraries.TomadaDeTresPinos;

public class TomadaAdapter extends TomadaDeDoisPinos {

    private TomadaDeTresPinos tomadaDeTresPinos;

    public TomadaAdapter(TomadaDeTresPinos tomadaDeTresPinos) {
        this.tomadaDeTresPinos = tomadaDeTresPinos;
    }

    @Override
    public void ligarNaTomadaDeDoisPinos() {
        tomadaDeTresPinos.ligarNaTomadaDeTresPinos();
    }
}
