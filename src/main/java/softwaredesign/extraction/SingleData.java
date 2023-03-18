package softwaredesign.extraction;

public abstract class SingleData extends Metric {
    protected Integer value;

    protected SingleData(String name, String description, Integer value) {
        super(name, description);
        this.value = value;
    }

    @Override
    protected String contentToString() {

        return null;
    }

    // TODO: remove after testing
    public Integer getValue() {
        return value;
    }
}
