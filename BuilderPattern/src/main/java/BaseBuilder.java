public abstract class BaseBuilder<T> {

    protected abstract T doBuild();

    public T build() {
        return doBuild();
    }
}
