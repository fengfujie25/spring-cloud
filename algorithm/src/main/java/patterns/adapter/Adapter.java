package patterns.adapter;

/**
 * @auther: fujie.feng
 * @DateT: 2019-07-08
 */
public class Adapter implements Lightning {

    private TypeCInterFace typeCInterFace;

    public Adapter(TypeCInterFace typeCInterFace) {
        this.typeCInterFace = typeCInterFace;
    }

    @Override
    public void lightning() {
        typeCInterFace.typec();
    }
}
