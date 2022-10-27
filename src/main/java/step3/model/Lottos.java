package step3.model;

import java.util.ArrayList;
import java.util.List;

public class Lottos {

    private List<Lotto> lottos;

    public void generate(int generatorCount) {
        lottos = new ArrayList<>();
        for (int i = 0; i < generatorCount; i++) {
            lottos.add(createLotto());
        }
    }

    private Lotto createLotto() {
        Lotto lotto = new Lotto();
        lotto.create();
        return lotto;
    }

    public int getSize() {
        return lottos.size();
    }

    public List<Lotto> getLottos() {
        return lottos;
    }
}
